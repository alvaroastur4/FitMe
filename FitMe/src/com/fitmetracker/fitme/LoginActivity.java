package com.fitmetracker.fitme;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.view.Menu;

public class LoginActivity extends SherlockActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity); // Cambio �lvaro
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.loginactivity, menu);
        return true;
    }*/
}
