package ejemplo.pruebafinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView nameText2;
    TextView ageText2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameText2=(TextView)findViewById(R.id.name);//Buscamos las views a modificar
        ageText2=(TextView)findViewById(R.id.age);

        /* A continuación les pondré la parte del código que coloca el mensaje del edittext en el textview del
        segundo layout.
        Hay dos formas de hacerlo: la primera es una forma más corta. Vean que hay un método llamado .getStringExtra que obtendrá el string directamente.
        La segunda es la vista en clase.
        Usen la que crean más conveniente.
         */
        //Aquí hay otra forma para hacer el intent
        nameText2.setText(getIntent().getStringExtra("NAME"));//Ponemos lo que recibimos de la primer activity en el texto name

        //Aquí está la forma vista en clase
        Bundle extras =intent.getExtras();
        if (extras!=null){
            String mensaje= extras.getString("AGE");//Guardamos el dato en un string
            ageText2.setText(mensaje);//Ponemos el mensaje en el lugar del texto


        }

    }

}
