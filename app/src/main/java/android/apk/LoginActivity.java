package android.apk;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;


public class LoginActivity extends AppCompatActivity {
    EditText etUsername;
    EditText etPassword;
    Database database;
    SQLiteDatabase db;
    Users users;
    SharedPreferences pref;
    private SharedPreferences.Editor editor;
    SharedPreferences pref2;
    private SharedPreferences.Editor editor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    etUsername = (EditText) findViewById(R.id.etABNumber2);
    etPassword = (EditText) findViewById(R.id.etPassword2);
        database = new Database(this);
    }

    public void onClickLogin(View view){
        Intent welcomeActivity = new Intent(LoginActivity.this,HomeActivity.class);
        startActivity(welcomeActivity);
     /*   if(etUsername.getText().toString().equals("")){
            etUsername.setError("Please supply your username");
        }
        else if(etPassword.getText().toString().equals("")){
            etPassword.setError("Please supply your password");
        }
        else {
              Intent welcomeActivity = new Intent(LoginActivity.this,HomeActivity.class);
              startActivity(welcomeActivity);
        }*/
    }
}
