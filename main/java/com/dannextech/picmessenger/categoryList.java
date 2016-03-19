package com.dannextech.picmessenger;

import android.app.Activity;
import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class categoryList extends Activity implements AdapterView.OnItemClickListener {
private ListView list;
    final String arr[] = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);

        list = (ListView) findViewById(R.id.listview_categories);


        arr[0] = "Cartoon";
        arr[1] = "Thriller";
        arr[2] = "Horror";
        arr[3] = "Comedy";
        arr[4] = "Cakes";
        //("Love","Missing","Sorry","Wise","Encouraging");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(categoryList.this,android.R.layout.simple_list_item_1,arr );

        list.setAdapter(adapter);

        list.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(arr[position]=="Cartoon"){
            Toast.makeText(categoryList.this,"The Item selected is " + arr[position],Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, love.class);
            startActivity(intent);

        }
        else if (arr[position]=="Thriller"){
            Toast.makeText(categoryList.this,"The Item selected is " + arr[position],Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, missing.class);
            startActivity(intent);
        }
        else
            Toast.makeText(categoryList.this,"You have selected the wrong one ",Toast.LENGTH_SHORT).show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_category_list, menu);
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
}
