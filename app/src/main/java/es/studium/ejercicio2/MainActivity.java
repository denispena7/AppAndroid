package es.studium.ejercicio2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btnButton;
    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    /*    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;*/

        btnButton = findViewById(R.id.button);
        btnButton.setOnClickListener(this);

        texto = findViewById(R.id.cuadroTexto);
        texto.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View view)
    {
        String mensaje = texto.getText().toString();
        if(mensaje.length() == 0)
        {
            Toast.makeText(this, R.string.mensaje_error, Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, texto.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}