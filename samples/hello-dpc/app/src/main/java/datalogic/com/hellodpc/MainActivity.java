package datalogic.com.hellodpc;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {

            DevicePolicyManager dpm = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
            if (dpm.isDeviceOwnerApp(getApplicationContext().getPackageName())) {
                TextView tv1 = (TextView) findViewById(R.id.hellomsg);
                tv1.setText("Look at me! I am a DPC");
            }
            else
            {
                TextView tv1 = (TextView) findViewById(R.id.hellomsg);
                tv1.setText("I am NOT a DPC");
            }
        }

    }
}
