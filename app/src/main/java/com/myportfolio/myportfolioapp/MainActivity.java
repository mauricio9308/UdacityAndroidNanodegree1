package com.myportfolio.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

/**
 * Main Activity of the My Portfolio App
 *
 * */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* setting the listeners for the button clicks */
        findViewById( R.id.bttn_popular_movies).setOnClickListener( MainActivity.this /* View.OnClickListener */);
        findViewById( R.id.bttn_stock_hawk ).setOnClickListener( MainActivity.this /* View.OnClickListener */);
        findViewById( R.id.bttn_build_it_bigger ).setOnClickListener( MainActivity.this /* View.OnClickListener */);
        findViewById( R.id.bttn_make_your_app_material ).setOnClickListener( MainActivity.this /* View.OnClickListener */);
        findViewById( R.id.bttn_go_ubiquitous ).setOnClickListener( MainActivity.this /* View.OnClickListener */);
        findViewById( R.id.bttn_capstone ).setOnClickListener( MainActivity.this /* View.OnClickListener */);
    }

    @Override
    public void onClick(View view) {
        String textToDisplay = null; // Holder of the message

        /* handling of the button clicks */
        switch ( view.getId() ){
            case R.id.bttn_popular_movies:
                textToDisplay = getString(R.string.message_popular_movies);
                break;
            case R.id.bttn_stock_hawk:
                textToDisplay = getString(R.string.message_stock_hawk);
                break;
            case R.id.bttn_build_it_bigger:
                textToDisplay = getString(R.string.message_build_it_bigger);
                break;
            case R.id.bttn_make_your_app_material:
                textToDisplay = getString(R.string.message_make_your_app_material);
                break;
            case R.id.bttn_go_ubiquitous:
                textToDisplay = getString(R.string.message_go_ubiquitous);
                break;
            case R.id.bttn_capstone:
                textToDisplay = getString(R.string.message_capstone);
                break;
            default:
                throw new IllegalStateException("Invalid click event listened...");
        }

        /* display of the message if it's set */
        if(!TextUtils.isEmpty( textToDisplay )){
            Toast.makeText( MainActivity.this, textToDisplay, Toast.LENGTH_SHORT ).show();
        }

    }
}
