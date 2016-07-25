package android.apk;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onClickLogin2(View view){
        Intent welcomeActivity = new Intent(Login2.this,HomeActivity.class);
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
