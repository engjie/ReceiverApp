package sg.edu.rp.c346.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 16019641 on 13/8/2018.
 */

public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast my_toast = Toast.makeText(context,"Low Battery",Toast.LENGTH_LONG);
        my_toast.show();

    }
}
