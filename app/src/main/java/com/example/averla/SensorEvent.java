package com.example.averla;

import android.hardware.Sensor;
import android.hardware.SensorEventCallback;
import android.hardware.SensorEventListener;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.os.Build;

import android.util.Log;

import androidx.annotation.RequiresApi;

import java.util.List;

@RequiresApi(api = Build.VERSION_CODES.N)
public class SensorEvent  implements SensorEventListener {


    public void getSearchEvent(){


          new SensorEvent();
    }





    @Override
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        Sensor sensor = sensorEvent.sensor;


    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

        Log.println(Log.WARN,"TAG", "Tell the file name "+ sensor.getName());

    }

    class  Sensormanag implements SensorEventListener2 {


        @Override
        public void onFlushCompleted(Sensor sensor) {




        }

        @Override
        public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                EvenSensor evenSensor = new EvenSensor();

            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    class EvenSensor extends SensorEventCallback {





    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    class Dyns extends SensorManager.DynamicSensorCallback{





    }
}
