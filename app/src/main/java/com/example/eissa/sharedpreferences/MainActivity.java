package com.example.eissa.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtname;
    EditText txtpassword;
    Button btnsave;
    Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname=(EditText)findViewById(R.id.txtname);
        txtpassword=(EditText)findViewById(R.id.txtpassword);
        btnsave=(Button)findViewById(R.id.btnsave);
        btnnext=(Button)findViewById(R.id.btnext);

    }

    public void Save(View view) {

        SharedPreferences sharedPreferences=getSharedPreferences("Data",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("name",txtname.getText().toString());
        editor.putString("pass",txtpassword.getText().toString());
        editor.commit();
        Toast.makeText(this,"Save Data Is Successfully",Toast.LENGTH_SHORT).show();
    }

    public void Next(View view) {
        Toast.makeText(this,"DataBase",Toast.LENGTH_SHORT).show();

        Intent intent= new Intent(this,DbActivity.class);
        startActivity(intent);

    }
}
