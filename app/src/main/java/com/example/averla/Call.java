package com.example.averla;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@RequiresApi(api = Build.VERSION_CODES.Q)
public class Call extends CameraDevice.StateCallback  {

    private Executor executor;
    List<OutputConfiguration> outputConfigurationList = new ArrayList<>();

   //OutputConfiguration configuration = new OutputConfiguration(new Surface(new SurfaceControl.Builder().build()));


    @Override
    public void onOpened(@NonNull CameraDevice cameraDevice) {





         //   outputConfigurationList.add(configuration);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {

            try {
                cameraDevice.createCaptureSession(new SessionConfiguration(SessionConfiguration.SESSION_REGULAR,null, null,null ));
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onDisconnected(@NonNull CameraDevice cameraDevice) {

    }

    @Override
    public void onError(@NonNull CameraDevice cameraDevice, int i) {
             System.out.print("CAmerca cant open");

    }
}
