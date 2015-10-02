package com.example.leti.novipel;

import android.view.MotionEvent;
import android.view.View;

import processing.core.PApplet;
import processing.event.MouseEvent;


/**
 * Created by leti on 29/09/15.
 */
public class Sketch extends PApplet {


    private float x;
    private float y;
    public Sketch (){
        x=0;
        y=300;
    }
    public void settings() {
        size(600, 600, P2D);
    }
    public void setup(){

        background(255);
    }

    public void draw(){
        background(255);
        paintLine();
        paintEllipse();
        if(mousePressed){
            onTouch();
        }
        x=(float)(x-0.5);
        y=(float)(y+0.7);

    }

    void paintLine(){

        strokeWeight(10);
        stroke(135, 60, 63);
        line(0, 300, 100, 300);
        line(100, 300, 100, 100);
        curve(100,300,150, 310, 250, 310, 300,100);
       // line(100, 100, 300, 100);
        line(300, 100, 300, 300);
        line(300, 300, 400, 300);
        line(400, 300, 400, 100);
        line(400, 100, 600, 100);
    }

    void paintEllipse(){

        noStroke();
        fill(135, 60, 63);
        ellipse(x, y, 50, 50);
    }
    public void onTouch(){
        if(x<100){
            x=x+7;
            y=(float)(y-0.8);
        }else if((x>100)&&(x<(float)109.5)){
            x=(float)(x+0.7);
            y=y-7;
        }else if((x>=(float)109.5)&&(x<300)){
            x=x+7;
            y=(float)(y-0.8);
        }

    }




}
