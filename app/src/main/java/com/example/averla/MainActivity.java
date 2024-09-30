/*

Class main activity configures and references layout objects

Author: Andy Duverneau

Date 7/2024
 */

package com.example.averla;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button pickUpButton, deliveryButton, restaurantInfo, searchButton,restaurantInfoRow1 ;
    private SearchView src;
    private TextView acountText, aboutText, rightsText;
    private ImageView logoAccount, messageView, settingView;
    private ScrollView scrollView;
    private HorizontalScrollView hori, hori1;
    private SQLiteDatabase sqLiteDatabase;
    private static Cursor curso;
    private Activity activity = this;


    @RequiresApi(api = Build.VERSION_CODES.S)
    @SuppressLint({"MissingInflatedId", "WrongConstant", "UseSupportActionBar"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Auto(,);

        logoAccount = findViewById(R.id.imageView);
        restaurantInfo = findViewById(R.id.button77);
        messageView = findViewById(R.id.imageView5);
        settingView = findViewById(R.id.imageView9);
        restaurantInfoRow1 = findViewById(R.id.button76);
        searchButton = findViewById(R.id.button14);

        //ima8 = findViewById(R.id.button10);
        scrollView = findViewById(R.id.scroll);
        aboutText = findViewById(R.id.textView2);
        acountText = findViewById(R.id.textView);
        rightsText = findViewById(R.id.textView3);
        // ho = findViewById(R.id.hori1);
        hori = findViewById(R.id.hori);
        hori1 = findViewById(R.id.hori1);
        pickUpButton = findViewById(R.id.button);
        deliveryButton = findViewById(R.id.button2);
        //scrollView = findViewById(R.id.scroll);



        pickUpButton.setBackgroundColor(Color.CYAN);
        deliveryButton.setBackgroundColor(Color.WHITE);

        //configure objects
        src = findViewById(R.id.src);
        src.setScrollX(SearchView.SCROLL_AXIS_HORIZONTAL);
        // src.setQueryHint("Search Averla");
        src.setInputType(SearchView.SYSTEM_UI_FLAG_FULLSCREEN);
        src.setBackgroundColor(Color.LTGRAY);
        src.setQueryRefinementEnabled(true);
        src.setSubmitButtonEnabled(true);

        // scrollView.setSmoothScrollingEnabled(true);
        scrollView.setVerticalScrollBarEnabled(false);

        // hori.setHorizontalScrollBarEnabled(false);
        hori.setHorizontalScrollBarEnabled(false);
        hori1.setHorizontalScrollBarEnabled(false);
        hori.setVerticalScrollBarEnabled(false);
        hori1.setVerticalScrollBarEnabled(false);
        //add a query text listener
        src.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Toast.makeText(getApplicationContext(), s + " submitted ", Toast.LENGTH_LONG).show();
                Intent inte = new Intent(MainActivity.this, Menu1.class);
                startActivity(inte);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                return false;
            }
        });



        src.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Menu1.class);
                startActivity(inte);

            }
        });


        src.setOnSuggestionListener(new SearchView.OnSuggestionListener() {
            @Override
            public boolean onSuggestionSelect(int i) {
                return true;
            }

            @Override
            public boolean onSuggestionClick(int i) {
                return true;
            }
        });

        // src.setInputType(WindowInsets.Type.systemGestures());

        messageView.setColorFilter(Color.BLACK);
        settingView.setColorFilter(Color.BLACK);

        //Open the camera
        searchButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                //  Log.println(Log.WARN,"TAG", "Tell the file name "+ Device.Emergeny(EmergencyNumber.CREATOR.createFromParcel(Parcel.obtain())));
         /*       BiometricPrompt.Builder builder = new  BiometricPrompt.Builder(activity);

                builder.setAllowedAuthenticators(BiometricManager.Authenticators.BIOMETRIC_STRONG);
                builder.setConfirmationRequired(true);
                builder.setDeviceCredentialAllowed(true);


                builder.setTitle("Identification");
             *//*   builder.setNegativeButton("Cancel", runnable -> {

                }, (dialogInterface, i) -> {


                }) ;*//*
                if(builder.build() != null) {
                  BiometricPrompt biometricPrompt = builder.build();
                  Log.println(Log.WARN,"TAG", "Tell the file name is n");
                  Device.Biometry(biometricPrompt);
                }*/
                // Log.println(Log.WARN,"TAG", "Tell the file name ");
                getSearchEvent();//
                // onTrackballEvent()
                SensorEvent sensorEvent = new SensorEvent();
                sensorEvent.getSearchEvent();


            }
        });


        pickUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deliveryButton.setBackgroundColor(Color.LTGRAY);
                pickUpButton.setBackgroundColor(Color.CYAN);
            }
        });


        deliveryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickUpButton.setBackgroundColor(Color.LTGRAY);
                deliveryButton.setBackgroundColor(Color.CYAN);
            }
        });

        acountText = (TextView) findViewById(R.id.textView);

        logoAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Profile.class);
                startActivity(inte);
            }
        });

        restaurantInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Menu.class);
                startActivity(inte);

            }
        });


        restaurantInfoRow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Menu1.class);
                startActivity(inte);
            }
        });
       /* ima8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Menu2.class);
                startActivity(inte);
            }
        });*/
        messageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Message.class);
                startActivity(inte);
            }
        });


        aboutText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, About.class);
                startActivity(inte);
            }
        });


        rightsText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Policy.class);
                startActivity(inte);
            }
        });


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSearchRequested() {

        return super.onSearchRequested();
    }

    @Override
    public void onBackPressed() {
        //  Toast.makeText(getApplicationContext(), " Go back", Toast.LENGTH_LONG).show();
        //setContentView(R.layout.anss);

        super.onBackPressed();
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        InputDevice inputDevice = InputDevice.getDevice(ev.getDeviceId());
        src.setQueryHint(inputDevice.getName());

        Log.println(Log.WARN,"TAG", "Tell the file name ");
        return super.dispatchTouchEvent(ev);
    }

    public  Cursor getCursor(){


        sqLiteDatabase = new Helper(activity).getReadableDatabase();
        return curso = sqLiteDatabase.rawQuery(null, null);
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
      /*  InputDevice inputDevice = InputDevice.getDevice(ev.getDeviceId());
        src.setQueryHint(inputDevice.getName());
        Log.println(Log.WARN,"TAG", "Tell the file name "+ inputDevice.getName());
*/
        return super.dispatchGenericMotionEvent(ev);
    }



    @Override
    public void onProvideAssistContent(AssistContent outContent) {

        Intent intent = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            intent = outContent.getIntent();
        }
        startActivity(intent);


        super.onProvideAssistContent(outContent);
    }
    /*

    Create autofill
    params: autofillmanager, view


     */
    public static void Auto(AutofillManager autofillManager, View view){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            autofillManager.commit();
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            autofillManager.notifyValueChanged(view);
        }
    }

}











