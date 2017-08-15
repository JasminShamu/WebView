package com.jasmin.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etxtUrl;
    Button btnGo,btnFb,btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtUrl=(EditText)findViewById(R.id.etxtUrl);

        btnGo=(Button)findViewById(R.id.btnGo);
        btnFb=(Button)findViewById(R.id.btnFb);
        btnGoogle=(Button)findViewById(R.id.btnGoogle);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url=etxtUrl.getText().toString();
                if (url.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please input url!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,WebViewActivity.class);
                    intent.putExtra("link",url);//data pass to web view activity
                    startActivity(intent);
                }
            }
        });

        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,WebViewActivity.class);
                intent.putExtra("link","www.facebook.com");
                startActivity(intent);

            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,WebViewActivity.class);
                intent.putExtra("link","www.google.com");
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Google", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
