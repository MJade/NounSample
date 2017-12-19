package com.example.android.nounsample;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class NounIntroActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun_intro);

        // Get the Intent that started this activity and extract the string
        // Had to copy this from android documentation...
        //...it FINALLY worked...
        // the KEy was referencing the MainActivity.java file and retrieving the variable from there
        // before displaying it in the TextView of this new activity ....whoooo...

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text

        TextView fullNameTextView = (TextView) findViewById(R.id.fullname_text_view);
        fullNameTextView.setText("Hello " + message);
    }


    public void sendList(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, NounCoursesActivity.class);
        startActivity(intent);

    }

    public void sendExtraList(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ExtraCoursesActivity.class);
        startActivity(intent);

    }


    /**
     * This is for later
     * public void webPage(View view) {
     * // Do something in response to button
     * Intent intent = new Intent(this, DisplayMessageActivity.class);
     * EditText editText = (EditText) findViewById(R.id.edit_message);
     * String message = editText.getText().toString();
     * startActivity(intent);
     * }
     */

    /**
     * Called when the user clicks the Continue button
     */

        /* Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Display message on new activity page
        TextView fullnameTextView = (TextView) findViewById (R.id.fullname_text_view);
        fullnameTextView.setText("Hello, " + message + "!");

        /* Leave this off for now, it overwrites the new layout.xml
        //Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Set the text view as the activity layout
        setContentView(textView);
        */




     /*   if (savedInstanceState == null) {
           getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment()).commit();
        }
        }
    */
    /* ...not needed here...
    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
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
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/
}
