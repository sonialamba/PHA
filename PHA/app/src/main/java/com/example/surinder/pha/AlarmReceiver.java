package com.example.surinder.pha;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context k1, Intent k2) {
            // TODO Auto-generated method stub
            Toast.makeText(k1, "Alarm received!", Toast.LENGTH_LONG).show();

    }

}
