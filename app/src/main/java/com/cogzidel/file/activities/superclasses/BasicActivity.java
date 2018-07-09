package com.cogzidel.file.activities.superclasses;

import android.support.v7.app.AppCompatActivity;

import com.cogzidel.file.ui.colors.ColorPreferenceHelper;
import com.cogzidel.file.utils.application.AppConfig;
import com.cogzidel.file.ui.colors.ColorPreference;
import com.cogzidel.file.utils.provider.UtilitiesProvider;
import com.cogzidel.file.utils.theme.AppTheme;

/**
 * Created by rpiotaix on 17/10/16.
 */
public class BasicActivity extends AppCompatActivity {

    protected AppConfig getAppConfig() {
        return (AppConfig) getApplication();
    }

    public ColorPreferenceHelper getColorPreference() {
        return getAppConfig().getUtilsProvider().getColorPreference();
    }

    public AppTheme getAppTheme() {
        return getAppConfig().getUtilsProvider().getAppTheme();
    }

    public UtilitiesProvider getUtilsProvider() {
        return getAppConfig().getUtilsProvider();
    }
}
