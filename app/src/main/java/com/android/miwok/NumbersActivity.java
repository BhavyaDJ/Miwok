package com.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create array of words
        ArrayList<String> words = new ArrayList<String>();
        words.add(0,"One");
        words.add(1,"Two");
        words.add(2,"Three");
        words.add(3,"Four");
        words.add(4,"Five");
        words.add(5,"Six");
        words.add(6,"Seven");
        words.add(7,"Eight");
        words.add(8,"Nine");
        words.add(9,"Ten");
        words.add(10,"Eleven");
        words.add(11,"tweleve");
        words.add(12,"Thirteen");
        words.add(13,"Thirteen");
        words.add(14,"fourteen");
        words.add(15,"fifty");
        words.add(16,"sixteen");
        words.add(17,"seventeen");
        words.add(18,"eighteen");
        words.add(19,"nineteen");
        words.add(20,"Twenty");
        words.add(21,"Twentyone");
        words.add(22,"Twentytwo");
        words.add(23,"Twentythree");
        words.add(24,"Twentyfour");
        words.add(25,"Twentyfive");
        words.add(26,"Twentysix");
        words.add(27,"Twentyseven");
        words.add(28,"Twentyeight");
        words.add(29,"Twentynine");
        words.add(30,"thirty");
        words.add(31,"thirtyone");
        words.add(32,"thirtytwo");
        words.add(33,"thirtythree");
        words.add(34,"thirtyfour");
        words.add(35,"thirtyfive");
        words.add(36,"thirtysix");
        words.add(37,"thirtyseven");
        words.add(38,"thirtyeight");
        words.add(39,"thirtynine");
        words.add(40,"forty");
        words.add(41,"fortyone");
        words.add(42,"fortytwo");
        words.add(43,"fortythree");
        words.add(44,"fortyfour");
        words.add(45,"fortyfive");
        words.add(46,"fortysix");
        words.add(47,"fortyseven");
        words.add(48,"fortyeight");
        words.add(49,"fortynine");
        words.add(50,"fifty");


        // Verify the contents of the list by printing out each element to the logs

       /* Log.v("numberActivity","word at index 0:" +words.get(0));
        Log.v("numberActivity","word at index 1:" +words.get(1));
        Log.v("numberActivity","word at index 2:" +words.get(2));
        Log.v("numberActivity","word at index 3:" +words.get(3));
        Log.v("numberActivity","word at index 4:" +words.get(4));
        Log.v("numberActivity","word at index 5:" +words.get(5));
        Log.v("numberActivity","word at index 6:" +words.get(6));
        Log.v("numberActivity","word at index 7:" +words.get(7));
        Log.v("numberActivity","word at index 8:" +words.get(8));
        Log.v("numberActivity","word at index 9:" +words.get(9));
        */
        // Find the root view so we can add child views to it
        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        //while loop
        /*int index =0;
         while(index < words.size()){
             //create a new textView
             TextView wordView = new TextView(this);
             //Set the text to be word at the current index
             wordView.setText(words.get(index));
             // Add this TextView as another child to the root view of this layout
             rootView.addView(wordView);
             index++;

         }
        */
        //for loop
        /*for (int index= 0;index<words.size();index++){
            //create a new textView
            TextView wordView = new TextView(this);
            //Set the text to be word at the current index
            wordView.setText(words.get(index));
            // Add this TextView as another child to the root view of this layout
            rootView.addView(wordView);
        }
        */
    }
}
