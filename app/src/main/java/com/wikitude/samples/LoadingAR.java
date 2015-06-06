package com.wikitude.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.wikitude.sdksamples.R;

public class LoadingAR extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_ar);
        try {
            final Intent intent = new Intent(this, Class.forName("com.wikitude.samples.SampleCamActivity"));
            intent.putExtra("activityTitle",
                    "Smart Assist");
            intent.putExtra("activityArchitectWorldUrl", "samples/AirportView/index.html");
            intent.putExtra("activityIr", false);
            intent.putExtra("activityGeo",
                    true);
            intent.putExtra("srcLatitude",
                    54.23453);
            intent.putExtra("srcLongitude",
                    4.23453);
            intent.putExtra("srcAltitude",
                    0);
            intent.putExtra("srcAccuracy",
                    5.1);
            this.startActivity(intent);
        } catch (Exception e) {
            /*
			 * may never occur, as long as all SampleActivities exist and are
			 * listed in manifest
			 */
            Toast.makeText(this, "LoadAR" + "\nnot defined/accessible",
                    Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loading_ar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            try {
                final Intent intent = new Intent(this, Class.forName("com.wikitude.samples.SampleCamActivity"));
                intent.putExtra("activityTitle",
                        "6.3 Limiting Range");
                intent.putExtra("activityArchitectWorldUrl", "samples/AirportView/index.html");
                intent.putExtra("activityIr", false);
                intent.putExtra("activityGeo",
                        true);
                this.startActivity(intent);
            } catch (Exception e) {
            /*
			 * may never occur, as long as all SampleActivities exist and are
			 * listed in manifest
			 */
                Toast.makeText(this, "LoadAR" + "\nnot defined/accessible",
                        Toast.LENGTH_SHORT).show();
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
