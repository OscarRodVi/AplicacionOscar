package com.example.rv_od.aplicacionoscar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView encabezado;//objeto llamado encabezado de tipo TextView
        encabezado=(TextView) findViewById(R.id.encabezado);
        // el objeto=(casteo a tipo TextView)
        // findViewById es la comunicacion entre el java y xml (R-> es la carpeta deonde esta.id -> por id.elID)
        encabezado.setText("el misa me la pela");//da el valor del texto
        encabezado.setTextColor(Color.argb(60,255,255,0)); //desde 0->255 van la escala de los colores,el primero es la intensidad
        encabezado.setTextSize(40);

        RelativeLayout Home;
        Home = (RelativeLayout) findViewById(R.id.Home);
        Home.setBackgroundColor(Color.argb(60,255,0,255));

        //SmsManager Mensajero = SmsManager.getDefault();
        //Mensajero.sendTextMessage("5516398985",null,"mensaje de texto",null,null);

        //<uses-permission android:name="android.permission.SEND_SMS"/>
        //da permisos para poder realizar acciones, en este caso mandar mensajes (va en AndroidManifest.xml)

        Log.e("etiqueta","mensaje de error");

        Toast.makeText(getBaseContext(),"se chingo esta madre",Toast.LENGTH_LONG).show();
        //mensaje de alerta


    }
}
