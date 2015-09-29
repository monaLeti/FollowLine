package com.example.leti.novipel;

import processing.core.PApplet;
import android.app.Fragment;

/**
 * Created by leti on 29/09/15.
 */
public class Sketch extends PApplet {


    private float x, y;

    public void settings() {
        size(1000, 1000, "P2D");
    }

    public void setup() {
        background(255);
    }

    public void draw() {
        background(255);

        x = (float) (x - 0.2);
        y = (float) (y + 0.3);
        ellipse(x,y,50,50);
    }


}
