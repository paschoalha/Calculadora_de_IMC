package br.fecapccp.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PesoNormalActivity extends AppCompatActivity {

    private float peso;
    private float altura;
    private float IMC;
    private String classificacao;
    private TextView textResultado;
    private ImageView btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_peso_normal);

        btnFechar = findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        Bundle bundle = getIntent().getExtras();

        peso = bundle.getFloat("peso");
        altura = bundle.getFloat("altura");
        IMC = bundle.getFloat("IMC");
        classificacao = bundle.getString("classificacao");

        textResultado = findViewById(R.id.textResultado);
        textResultado.setText("com " + altura + "m de altura e pesando "+ peso + " kg, seu IMC é de " + IMC + " o que te classifica em: " + classificacao);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
    }
}