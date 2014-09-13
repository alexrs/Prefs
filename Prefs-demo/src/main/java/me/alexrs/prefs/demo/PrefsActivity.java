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

        TextView tv1 = (TextView) findViewById(R.id.textView1);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);
        TextView tv5 = (TextView) findViewById(R.id.textView5);


        tv1.setText("String: " + Prefs.with(this).getString("STRING", ""));

        Prefs.with(this).save("BOOL", true);
        tv2.setText("Boolean: " + String.valueOf(Prefs.with(this).getBoolean("BOOL", false)));

        Prefs.with(this).save("INT", 42);
        tv3.setText("Int: " + String.valueOf(Prefs.with(this).getInt("INT", 0)));

        Prefs.with(this).save("FLOAT", 1.0F);
        tv4.setText("Float: " + String.valueOf(Prefs.with(this).getFloat("FLOAT", 0F)));

        Prefs.with(this).save("LONG", 36352353252135L);
        tv5.setText("Long: " + String.valueOf(Prefs.with(this).getLong("LONG", 0)));
    }

}
