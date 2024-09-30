package com.example.averla;

import android.graphics.Camera;
import android.hardware.Sensor;
import android.hardware.camera2.CameraDevice;
import android.location.Location;
import android.location.LocationListener;
import android.os.Build;
import android.service.autofill.AutofillService;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Bio implements LocationListener {

    @Override
    public void onLocationChanged(@NonNull Location location) {
        location.reset();


    }
}