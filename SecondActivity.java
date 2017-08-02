package ejemplo.pruebafinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{

    TextView nameText2;
    TextView ageText2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameText2 = (TextView) findViewById(R.id.name);
        ageText2 = (TextView) findViewById(R.id.age);

        nameText2.setText(getIntent().getStringExtra("NAME"));
        ageText2.setText(getIntent().getStringExtra("AGE"));
    }

}
