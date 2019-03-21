package com.example.ritwik.photoeditor.Interface;

/**
 * Created by ritwik on 17-03-2019.
 */

public interface EditImageFragmentListener {
    void onBrightnessChanged(int brightness);
    void onSaturationChanged(float saturation);
    void onContrastChanged(float contrast);
    void onEditStarted();
    void onEditCompleted();

}
