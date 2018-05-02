package com.example.storage.Supplier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;

import com.example.storage.R;
import com.example.storage.Utils.DrawableColor;
import com.example.storage.Utils.StatusBarUtils;

public class Supplier_photo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(R.layout.activity_supplier_photo,null);
        DrawableColor.changeColor(view,R.id.addphoto,R.drawable.ic_add_a_photo_black,R.color.gray);
        setContentView(R.layout.activity_supplier_photo);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.checkin));
        StatusBarUtils.setStatusBar(this,getResources().getColor(R.color.checkin));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.checkin_photo_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
