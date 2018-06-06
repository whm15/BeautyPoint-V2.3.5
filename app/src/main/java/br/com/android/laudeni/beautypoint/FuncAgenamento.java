package br.com.android.laudeni.beautypoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FuncAgenamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func_agenamento);

        Button btn = findViewById(R.id.btn_agendar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FuncAgenamento.this, "Função de agendamento\ndisponível em breve!", Toast.LENGTH_LONG).show();
                Toast.makeText(FuncAgenamento.this, "Mantenha-se atualizado!\nEquipe Beauty Point agradece!", Toast.LENGTH_LONG).show();


            }
        });

    }
}
