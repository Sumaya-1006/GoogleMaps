package com.example.googlemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity {
    Button mapBtn;
    private static final String TAG = "MainActivity";
    private static final int ERROR_DIALOG_REQUEST = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isServicesOk()){
            init();
        }

    }
    private void init(){
       mapBtn = findViewById(R.id.mapBtnId);
       mapBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, MapActivity.class);
               startActivity(intent);
           }
       });

    }
    public boolean isServicesOk(){
       Log.d(TAG,"isServicesOk : checking google services version");

       int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable((MainActivity.this));

       if(available == ConnectionResult.SUCCESS) {
           Log.d(TAG,"isServicesOk : google services version is working");
           return true;

       }else if(GoogleApiAvailability.getInstance().isUserResolvableError(available)){
           Log.d(TAG,"isServicesOk : error is occurred ");
           Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(MainActivity.this,available,ERROR_DIALOG_REQUEST);
           dialog.show();

       }else {
           Toast.makeText(this, "you can not make request", Toast.LENGTH_SHORT).show();
       }
       return false;
    }
}