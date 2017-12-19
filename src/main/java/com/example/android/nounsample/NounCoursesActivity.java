package com.example.android.nounsample;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

//import android.support.v7.app.ActionBarActivity;


public abstract class NounCoursesActivity extends AppCompatActivity {

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun_courses);
    }

    public void setContentView(int activity_noun_courses) {
    }

    //@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*
        Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intro, menu);
        */
        return true;
    }

    //@Override
    /*public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        //return super.onOptionsItemSelected(item);
        return false;
    }
    */
    public void open(View view) {
        TextView textView = (TextView) view;
        String downloadLink = (String) textView.getHint();
        String fileName = downloadLink.substring(downloadLink.lastIndexOf('/')+1);
        DownloadManager downloadManager = (DownloadManager)getSystemService(Context. DOWNLOAD_SERVICE);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(downloadLink));
        DownloadManager.Request request1 = request.setDestinationInExternalFilesDir(this, Environment.DIRECTORY_DOWNLOADS, fileName);
    }

    @Override
    public Context getApplicationContext() {
        return null;
    }
}
