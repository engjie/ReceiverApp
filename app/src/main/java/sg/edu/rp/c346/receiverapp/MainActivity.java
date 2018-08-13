package sg.edu.rp.c346.receiverapp;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // to register the receiver
    BroadcastReceiver br = new BatteryReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);

        //trigger on low battery. Typically used to reduce activities in app which consume power
        filter.addAction("android.intent.action.BATTERY_LOW");
        this.registerReceiver(br, filter);
    }

    @Override

    protected void onDestroy() {
        super.onDestroy();
        this.unregisterReceiver(br);
    }
}

