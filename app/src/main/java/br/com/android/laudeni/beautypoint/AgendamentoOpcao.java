package br.com.android.laudeni.beautypoint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class AgendamentoOpcao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamento_opcao);

        Salao salao = (Salao) getIntent().getSerializableExtra("salaodt");

        ImageView image = findViewById(R.id.ag_img_salao);

        String imgPath = salao.getImgUrl();
        if(imgPath != null && !imgPath.isEmpty()) {
            Picasso.get().load(imgPath).into(image);
        }


        Button botaoAGF = (Button) findViewById(R.id.func_sl01);

        Button botaoAGF2 = (Button) findViewById(R.id.func_sl02);

        botaoAGF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent( AgendamentoOpcao.this, FuncAgenamento.class );



                startActivity(i);
            }
        });

        botaoAGF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent( AgendamentoOpcao.this, FuncAgenamento.class );



                startActivity(i);
            }
        });
    }
}
