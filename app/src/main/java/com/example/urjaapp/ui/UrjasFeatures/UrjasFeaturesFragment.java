package com.example.urjaapp.ui.UrjasFeatures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;


import com.example.urjaapp.R;

public class UrjasFeaturesFragment extends AppCompatActivity {

    Toolbar jtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urjas_features_fragment);

        setToolbar();
    }

    private void setToolbar()
    {
    jtoolbar = findViewById(R.id.toolbar);
    setSupportActionBar(jtoolbar);

    if(getSupportActionBar() == null)
        return;

    getSupportActionBar().setTitle("Urjas Services Application");
     getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
