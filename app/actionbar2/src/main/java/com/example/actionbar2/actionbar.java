package com.example.actionbar2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;

public class actionbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionbar);

        ActionBar actionBar = getActionBar();

        actionBar.setTitle(" Gfg | ActionBar");
        actionBar.setSubtitle("This is an action bar");
        actionBar.setSubtitle(R.drawable.ic_launcher_background);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled();
    }
    //@Override
   // public boolean onOptionsItemSelected(Menu menu)
}