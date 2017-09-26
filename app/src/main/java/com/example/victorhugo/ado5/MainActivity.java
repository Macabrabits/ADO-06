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


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    }
    public void gerarNotificacao1(View view){
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent p = PendingIntent.getActivity(this, 0 , new Intent(this, tela1.class), 0 );
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Ticker");
        builder.setContentTitle("Título");
        builder.setContentText("Tela 1");
        builder.setOngoing(true);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        builder.setContentIntent(p);
        Notification n = builder.build();
        nm.notify(R.mipmap.ic_launcher, n);

    }
    public void gerarNotificacao2(View view){
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent p = PendingIntent.getActivity(this, 0 , new Intent(this, tela2.class), 0 );
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Ticker");
        builder.setContentTitle("Título");
        builder.setContentText("Tela 2");
        builder.setOngoing(true);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        builder.setContentIntent(p);
        Notification n = builder.build();
        nm.notify(R.mipmap.ic_launcher, n);

    }
    public void gerarNotificacao3(View view){
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent p = PendingIntent.getActivity(this, 0 , new Intent(this, tela3.class), 0 );
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Ticker");
        builder.setContentTitle("Título");
        builder.setContentText("Tela 3");
        builder.setOngoing(true);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        builder.setContentIntent(p);
        Notification n = builder.build();
        nm.notify(R.mipmap.ic_launcher, n);

    }
    public void gerarNotificacao4(View view){
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent p = PendingIntent.getActivity(this, 0 , new Intent(this, tela4.class), 0 );
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Ticker");
        builder.setContentTitle("Título");
        builder.setContentText("Tela 4");
        builder.setOngoing(true);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        builder.setContentIntent(p);
        Notification n = builder.build();
        nm.notify(R.mipmap.ic_launcher, n);

    }
    public void gerarNotificacao5(View view){
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent p = PendingIntent.getActivity(this, 0 , new Intent(this, tela5.class), 0 );
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Ticker");
        builder.setContentTitle("Título");
        builder.setContentText("Tela 5");
        builder.setOngoing(true);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        builder.setContentIntent(p);
        Notification n = builder.build();
        nm.notify(R.mipmap.ic_launcher, n);

    }

}
