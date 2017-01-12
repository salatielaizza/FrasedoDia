package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView TextoNovaFrase;
    private Button botaoNovaFrase;

    private String[] Frases = { "Neste sentido, a complexidade dos estudos efetuados faz parte de um processo de gerenciamento das regras de conduta normativas.",
            "Por conseguinte, o novo modelo estrutural aqui preconizado nos obriga à análise dos relacionamentos verticais entre as hierarquias.",
            "O cuidado em identificar pontos críticos na constante divulgação das informações possibilita uma melhor visão global do sistema de participação geral.",
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextoNovaFrase= (TextView) findViewById(R.id.TextoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        //TextoNovaFrase.setText( Frases[0]);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroALeatorio = randomico.nextInt(Frases.length);
                TextoNovaFrase.setText( Frases[numeroALeatorio]);
            }
        });


    }


}
