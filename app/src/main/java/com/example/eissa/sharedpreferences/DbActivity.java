package com.example.eissa.sharedpreferences;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DbActivity extends AppCompatActivity {
    EditText Name;
    EditText Password;
    Button btnshow;
    Button btnback;
    String Default="NA";
    String name;
    String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);
    
    Name=(EditText)findViewById(R.id.name);
    Password=(EditText)findViewById(R.id.password);
    btnshow=(Button)findViewById(R.id.btnshow);
    btnback=(Button)findViewById(R.id.btnbak);
}

    public void Show(View view) {
        SharedPreferences sharedPreferences=getSharedPreferences("Data",MODE_PRIVATE);
        name=sharedPreferences.getString("name",Default);
        pass=sharedPreferences.getString("pass",Default);
        if(name.equals(Default)|| pass.equals(Default)){
            Toast.makeText(this,"No Data Found",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this," Data Found",Toast.LENGTH_SHORT).show();
            Name.setText(name);
            Password.setText(pass);
        }



    }

    public void Back(View view) {
        Toast.makeText(this,"Main Actvity",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}

