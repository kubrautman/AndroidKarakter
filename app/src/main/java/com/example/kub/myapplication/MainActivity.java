package com.example.kub.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,EditText.OnEditorActionListener {
TextView tv;
TextView tvKarakterozellikleri;
Button bsaldir;
Button buyu;
Button byemekye;
karakter k;
EditText isim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.cevap);
       tvKarakterozellikleri=(TextView)findViewById(R.id.bilmece);
       bsaldir=(Button)findViewById(R.id.btnsaldir);
      buyu=(Button)findViewById(R.id.btnuyu);
      isim=(EditText)findViewById(R.id.editText);
      isim.setOnEditorActionListener(this);
      byemekye=(Button)findViewById(R.id.btnyemekye);
      bsaldir.setOnClickListener(this);
     byemekye.setOnClickListener(this);
      buyu.setOnClickListener(this);
k=new karakter();
k.kilo=10;
k.saldiriGucu=100;
k.hareketSayisi=10;
tv.setText("Oyuna hoşgeldiniz lütfen karakter ismi girin");
tvKarakterozellikleri.setText(k.toString());



    }
    @Override
    //TextEditor boolean döndürür.
    public  boolean onEditorAction(TextView tx, int x, KeyEvent ke){
        tv.setText("Karakterin ismi: "+isim.getText() +" olak atandı.");
        k.isim=(String) isim.getText().toString();
        tvKarakterozellikleri.setText(k.toString());
        isim.setVisibility(View.INVISIBLE);
        return  true;

    }
    @Override
    public void onClick(View v)
    {
        if(v.getId()==bsaldir.getId())
            tv.setText(k.savas());

        else if(v.getId()==buyu.getId())
            tv.setText(k.uyumak());

    else if(v.getId()==byemekye.getId())
            tv.setText(k.yemek());
     tvKarakterozellikleri.setText(k.toString());


    }
}
