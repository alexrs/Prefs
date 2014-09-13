package me.alexrs.prefs.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import me.alexrs.prefs.R;
import me.alexrs.prefs.lib.Prefs;


public class PrefsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_prefs);
        TextView tv = (TextView) findViewById(R.id.textView);

        Prefs.with(this).save("NAME", "Hector");
        tv.setText(Prefs.with(this).getString("NAME", ""));
    }

}
