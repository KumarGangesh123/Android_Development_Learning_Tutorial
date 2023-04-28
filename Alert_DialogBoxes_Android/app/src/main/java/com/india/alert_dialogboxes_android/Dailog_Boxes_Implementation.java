package com.india.alert_dialogboxes_android;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class Dailog_Boxes_Implementation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // alterBox for single button

        AlertDialog alter1 = new AlertDialog.Builder(this).create();
        alter1.setTitle("Single Button Alert Box");
        alter1.setIcon(R.drawable.baseline_info_24);
        alter1.setMessage("This is the single button alter box");
        alter1.setButton("Confirm",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Dailog_Boxes_Implementation.this, "Single AlterBox Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        alter1.show();

        // alterBox for double button

        AlertDialog.Builder alter2 = new AlertDialog.Builder(this);
        alter2.setTitle("Double Button AlterDialog");
        alter2.setIcon(R.drawable.baseline_info_24);
        alter2.setMessage("This is the two button alter dailog");
        alter2.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Dailog_Boxes_Implementation.this, "Double Button Yes Option", Toast.LENGTH_SHORT).show();
            }
        });

        alter2.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Dailog_Boxes_Implementation.this, "Double Button No Option", Toast.LENGTH_SHORT).show();
            }
        });

        alter2.show();

        // thiple button Confirm dialog box


        AlertDialog.Builder alter3 = new AlertDialog.Builder(this);
        alter3.setTitle("Double Button AlterDialog");
        alter3.setIcon(R.drawable.baseline_info_24);
        alter3.setMessage("This is the two button alter dailog");
        alter3.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Dailog_Boxes_Implementation.this, "Double Button Yes Option", Toast.LENGTH_SHORT).show();
            }
        });

        alter3.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Dailog_Boxes_Implementation.this, "Double Button No Option", Toast.LENGTH_SHORT).show();
            }
        });

        alter3.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Dailog_Boxes_Implementation.this, "Double Button Cancle Option", Toast.LENGTH_SHORT).show();
            }
        });

        alter3.show();


    }
}