package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    EditText ed1;
    int val;
    Button btn;
    TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.amount);
        spinner = findViewById(R.id.spinner);
        btn = findViewById(R.id.button);
        txtview = findViewById(R.id.textView3);
        List<String> list = new ArrayList<>();
        list.add("USD");
        list.add("LBP");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if(spinner.getSelectedItem().toString()=="USD"){
                                           //convert usd to lbp
                                           val = Integer.parseInt(ed1.getText().toString())*40000;


                                       }else{
                                           //convert lbp to usd
                                           val = Integer.parseInt(ed1.getText().toString())/40000;
                                       }
                                       txtview.setText(Integer.toString(val));

                                   }
                               }

        );


    }

}