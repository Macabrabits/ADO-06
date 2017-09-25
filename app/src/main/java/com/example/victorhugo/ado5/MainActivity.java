package com.example.victorhugo.ado5;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        Button1 = (Button)findViewById(R.id.button);

        /*
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent abreCadastro = new Intent(MainActivity.this, tela1.class);
                startActivity(abreCadastro);

            }
        });
        */

    }
    public void gerarNotificacao(View view){
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent p = PendingIntent.getActivity(this, 0 , new Intent(this, tela1.class), 0 );
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Ticker");
        builder.setContentTitle("Título");
        builder.setContentText("Descrição");
        builder.setOngoing(true);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        builder.setContentIntent(p);
        Notification n = builder.build();
        nm.notify(R.mipmap.ic_launcher, n);

    }


}
