
/*
This is an attempt to authenticate
asking users to provide credentials

Author: Andy Duverneau
 */


package com.example.averla;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.CancellationSignal;
import android.telephony.emergency.EmergencyNumber;

import java.util.List;

public class Device {


    /*

    create Biometry method
    params: BiometricPrompt

    return: void

     */
    public static  void Biometry( BiometricPrompt biometricPrompt){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            biometricPrompt.authenticate(new CancellationSignal(), runnable -> {

            }, new BiometricPrompt.AuthenticationCallback() {
                @Override
                public void onAuthenticationError(int errorCode, CharSequence errString) {
                    super.onAuthenticationError(errorCode, errString);
                }
            });
        }


    }


}