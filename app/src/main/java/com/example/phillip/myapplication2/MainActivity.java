package com.example.phillip.myapplication2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {
    private final String TAG = "TKT;"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }
    //@Override
    //protected void onStart(Bundle savedInstanceState) {
      //  super.onStart();
        //Log.d(TAG, "onStart");
    //}
    //@Override
    //protected void onRestart() {
      //  super.onRestart();
        //Log.d(TAG, "onRestart");
    //}
    //@Override
    //protected void onResume() {
      //  super.onResume();
        //Log.d(TAG, "onResume");
    //}
    //@Override
    //protected void onPause() {
      //  super.onPause();
       // Log.d(TAG, "onPause");
    //}
    //@Override
    //protected void onStop() {
      //  super.onStop();
       // Log.d(TAG, "onStop");
    //}
    //@Override
    //protected void onDestroy() {
      //  super.onDestroy();
        //Log.d(TAG, "onDestroy");
    //}

    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      //  getMenuInflater().inflate(R.menu.menu_main, menu);
       // return true;
    //}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
