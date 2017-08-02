package ejemplo.pruebafinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{

    TextView nameText2;
    TextView ageText2;
    Button backButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameText2 = (TextView) findViewById(R.id.name);
        ageText2 = (TextView) findViewById(R.id.age);
        backButton = (Button) findViewById(R.id.back);

        nameText2.setText(getIntent().getStringExtra("NAME"));
        ageText2.setText(getIntent().getStringExtra("AGE"));

        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent = new Intent(SecondActivity.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }
}
