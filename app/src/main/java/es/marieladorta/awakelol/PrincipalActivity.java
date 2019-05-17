package es.marieladorta.awakelol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;

public class PrincipalActivity extends AppCompatActivity {

    Button btnBuscarPartida;
    ProgressBar pbCargarDatosPartida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnBuscarPartida = (Button) findViewById(R.id.btnBuscarPartida);
        pbCargarDatosPartida = (ProgressBar) findViewById(R.id.pbCargarDatos);


    }
}
