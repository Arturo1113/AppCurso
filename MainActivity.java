package ejemplo.pruebafinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    Button passButton;
    EditText nameEdit;
    EditText ageEdit;
    Intent intent;

    String ageString1, nameString1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passButton = (Button) findViewById(R.id.pass);
        nameEdit = (EditText) findViewById(R.id.nameEdit1);
        ageEdit = (EditText) findViewById(R.id.ageEdit1);

        passButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                nameString1 = nameEdit.getText().toString();
                ageString1 = ageEdit.getText().toString();

                intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("NAME", nameString1);
                intent.putExtra("AGE", ageString1);

                startActivity(intent);
            }
        });

    }
}
