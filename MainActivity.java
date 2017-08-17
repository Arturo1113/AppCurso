package ejemplo.pruebafinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//CONSTRUCTOR
    //Declaración de variables
    Button passButton;
    EditText nameEdit;
    EditText ageEdit;
    String nameString,ageString;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passButton=(Button)findViewById(R.id.pass);//Los buscamos por su id
        nameEdit=(EditText)findViewById(R.id.nameEdit1);
        ageEdit=(EditText)findViewById(R.id.ageEdit1);

        passButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//lo que hará el botón
                nameString=nameEdit.getText().toString();//Obtiene lo que tenga el edittext y lo convierte a cadena
                ageString=ageEdit.getText().toString();

                intent=new Intent(MainActivity.this,SecondActivity.class);//Le decimos al intent que pasemos de la actividad presente a la segunda.

                intent.putExtra("NAME",nameString);//guardamos lo que está en el edittext en un extra con nombre entre comilas""
                intent.putExtra("AGE",ageString);

                startActivity(intent);


            }
        });
    }
}
