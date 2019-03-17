package com.example.ritwik.photoeditor.Interface;

/**
 * Created by ritwik on 17-03-2019.
 */

public interface EditImageFragementListener {
    void onBrightnessChanged(int brightness);
    void onSaturationChanged(float saturation);
    void onConstraintChanged(float constraint);
    void onEditStarted();
    void onEditCompleted();

}
