package com.example.loops;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    StringBuilder sb = new StringBuilder();
    Button btnfor,btnwhile,btndowhile,btnforeach;
    EditText start,end;
    TextView reasult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnfor = findViewById(R.id.btnfor);
         btnwhile = findViewById(R.id.btnwhile);
         btndowhile = findViewById(R.id.btndowhile);
         start = findViewById(R.id.start);
         end = findViewById(R.id.end);
         reasult = findViewById(R.id.reasult);
         btnforeach = findViewById(R.id.btnforeach);
 
         btnfor.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (start.getText().toString().isEmpty() || end.getText().toString().isEmpty()) {
                     Toast.makeText(MainActivity.this, "Please enter starting and ending number", Toast.LENGTH_SHORT).show();
                 } else {
                     int from = Integer.parseInt(start.getText().toString());
                     int to = Integer.parseInt(end.getText().toString());

                     for (int i = from; i <= to; i++) {
                         sb.append(i + " ");
                     }
                     reasult.setText(sb);
                     sb.setLength(0);
                 }
             }
         });
         btnwhile.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                     if(start.getText().toString().isEmpty() || end.getText().toString().isEmpty()){
                         Toast.makeText(MainActivity.this, "Please enter starting and ending number", Toast.LENGTH_SHORT).show();
                     }
                     else {
                         int from = Integer.parseInt(start.getText().toString());
                         int to = Integer.parseInt(end.getText().toString());
                         int i = from;
                         while (i <= to){
                             sb.append(i + " ");
                             i++;
                         }
                         reasult.setText(sb);
                         sb.setLength(0);
                     }
                 }
         });
         btndowhile.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(start.getText().toString().isEmpty() || end.getText().toString().isEmpty()){
                     Toast.makeText(MainActivity.this, "Please enter starting and ending number", Toast.LENGTH_SHORT).show();
                 }
                 else {
                     int from = Integer.parseInt(start.getText().toString());
                     int to = Integer.parseInt(end.getText().toString());
                     int i = from;
                    do {
                       sb.append(i + " ");
                       i++;
                    } while(i <= to);
                     reasult.setText(sb);
                     sb.setLength(0);
                 }
             }
         });
         btnforeach.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                     int arr[]={12,13,14,44};
                     for(int i:arr){
                         sb.append(i + " ");
                     }
                     reasult.setText(sb);
                     sb.setLength(0);
             }
         });
    }
}