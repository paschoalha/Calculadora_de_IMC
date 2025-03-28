package br.fecapccp.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class CalculoIMCActivity extends AppCompatActivity {

    private Button btnSet;
    private EditText editPeso;
    private EditText editAltura;
    private float peso;
    private float altura;
    private float imc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculo_imcactivity);

        //variaveis
        editPeso = findViewById(R.id.editaTextPeso);
        editAltura = findViewById(R.id.editTextAltura);

        btnSet = findViewById(R.id.btnSet);

        //
        btnSet.setOnClickListener(view -> {
            peso = Float.parseFloat(editPeso.getText().toString());
            altura = Float.parseFloat(editAltura.getText().toString());
            imc = peso/((altura)*(altura));

            Class activity = MainActivity.class;

            if(imc<18.5){
                activity = AbaixoDoPesoActivity.class;
            }
            else if(imc>=18.5 && imc<25){
                activity = PesoNormalActivity.class;
            }
            else if(imc>=25 && imc<30){
                activity = SobrepesoActivity.class;
            }
            else if(imc>=30 && imc<35){
                activity = Obesidade1Activity.class;
            }
            else if(imc>=35 && imc<40){
                activity = Obesidade2Activity.class;
            }
            else if(imc>=40){
                activity = Obesidade3Activity.class;
            }

            Intent intent = new Intent(this, activity);

            intent.putExtra("peso", peso);
            intent.putExtra("altura", altura);
            intent.putExtra("IMC", imc);

            startActivity(intent);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Limpar(View view){
        editPeso = findViewById(R.id.editaTextPeso);
        editAltura = findViewById(R.id.editTextAltura);

        editPeso.setText("");
        editAltura.setText("");
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
