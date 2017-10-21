package com.example.rohitgiri.assignment9_a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import static com.example.rohitgiri.assignment9_a.R.color.blue;
import static com.example.rohitgiri.assignment9_a.R.color.green;
import static com.example.rohitgiri.assignment9_a.R.color.red;

public class MainActivity extends AppCompatActivity {

    private TextView mtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();

        //connecting the mtextview object to Textview object in layout
        mtextview= (TextView) findViewById(R.id.text);
    }

    // calling method when activity in launched
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

       //inflating the menus
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    //method to change color of textview when particular menu option is selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.red)
        {
           mtextview.setTextColor(getResources().getColor(red));
        }
        if(id==R.id.green)
        {
            mtextview.setTextColor(getResources().getColor(green));
        }
        if(id==R.id.blue)
        {
            mtextview.setTextColor(getResources().getColor(blue));
        }
        return super.onOptionsItemSelected(item);
    }
}
