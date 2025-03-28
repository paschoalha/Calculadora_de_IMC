package br.fecapccp.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

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
    private float IMC;
    private String classificacao;
    private String FraseMotivacional;

    private ImageView btnFechar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculo_imcactivity);

        editPeso = findViewById(R.id.editaTextPeso);
        editAltura = findViewById(R.id.editTextAltura);

        btnSet = findViewById(R.id.btnSet);
        btnSet.setOnClickListener(view -> {
            peso = Float.parseFloat(editPeso.getText().toString());
            altura = Float.parseFloat(editAltura.getText().toString());
            IMC = peso/((altura)*(altura));

            Class activity = MainActivity.class;

            if(IMC<18.5){
                activity = AbaixoDoPesoActivity.class;
                classificacao = "Abaixo do peso";
                FraseMotivacional = "Seu corpo é forte e capaz — com equilíbrio e nutrição, você vai atingir seu melhor!";
            }
            else if(IMC>=18.5 && IMC<25){
                activity = PesoNormalActivity.class;
                classificacao = "Peso normal";
                FraseMotivacional = "Continue firme! Seu compromisso com a saúde é a base do seu progresso diário.";
            }
            else if(IMC>=25 && IMC<30){
                activity = SobrepesoActivity.class;
                classificacao = "Sobrepeso";
                FraseMotivacional = "Cada passo conta. Pequenas mudanças constroem grandes transformações!";
            }
            else if(IMC>=30 && IMC<35){
                activity = Obesidade1Activity.class;
                classificacao = "Obesidade grau 1";
                FraseMotivacional = "Você tem o poder de virar a chave — hoje é um ótimo dia para recomeçar com foco!";
            }
            else if(IMC>=35 && IMC<40){
                activity = Obesidade2Activity.class;
                classificacao = "Obesidade grau 2";
                FraseMotivacional = "Desistir não é opção. Seu futuro saudável começa com as escolhas que faz agora!";
            }
            else if(IMC>=40){
                activity = Obesidade3Activity.class;
                classificacao = "Obesidade grau 3";
                FraseMotivacional = "Você é mais forte do que qualquer obstáculo. O primeiro passo é acreditar em si!";
            }

            Intent intent = new Intent(this, activity);

            intent.putExtra("peso", peso);
            intent.putExtra("altura", altura);
            intent.putExtra("IMC", IMC);
            intent.putExtra("classificacao", classificacao);
            intent.putExtra("FraseMotivacional", FraseMotivacional);

            startActivity(intent);
        });

        btnFechar = findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
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
