package com.example.averla;

import java.util.prefs.Preferences;
import java.util.prefs.PreferencesFactory;

public class PrefsFactory implements PreferencesFactory {

    private Preferences preferences;

    PrefsFactory(Preferences preferences){
        this.preferences = preferences;

    }

    @Override
    public Preferences systemRoot() {
        Preferences.systemNodeForPackage(PrefsFactory.class);

        return preferences;
    }

    @Override
    public Preferences userRoot() {
        return preferences;
    }
}
