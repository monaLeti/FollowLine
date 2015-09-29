package com.example.leti.novipel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by leti on 28/09/15.
 */
public class Start extends View {


    private int activate;
    public Start(Context context){
        super(context);
        activate = 0;
    }
    public Start(Context context, AttributeSet attrs, int defaultStyle){
        super(context, attrs, defaultStyle);
        activate = 0;

    }
    public Start(Context context, AttributeSet attrs){
        super(context, attrs);
        activate = 0;

    }


    //Set the size of the controll
    protected void onMeasure(int widthSpec, int heightSpec){
        super.onMeasure(widthSpec, heightSpec);

        int width = calculateWidth(widthSpec);
        int height = calculateHeight(heightSpec);

        setMeasuredDimension(width, heightSpec);


    }

    public int calculateWidth(int limitSpec){
        int res = 25;
        int mode = MeasureSpec.getMode(limitSpec);
        int limit = MeasureSpec.getSize(limitSpec);

        if(mode == MeasureSpec.AT_MOST){
            res = limit;
        } else if (mode == MeasureSpec.EXACTLY){
            res = limit;
        }
        return res;
    }

    public int calculateHeight (int limitSpec){
        int res = 25;
        int mode = MeasureSpec.getMode(limitSpec);
        int limit = MeasureSpec.getSize(limitSpec);

        if(mode == MeasureSpec.AT_MOST){
            res = limit;
        }else if(mode == MeasureSpec.EXACTLY){
            res = limit;
        }
        return res;
    }

    public void changeColor (){
        if(activate == 0){
            activate = 1;
        } else if(activate == 1){
            activate = 0;
        }
        this.invalidate();
    }
    //Draw the control
    protected void onDraw (Canvas canvas){
        //Get the size
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        if(activate == 0){
            paint.setColor(Color.parseColor("#3767B1"));
        }else if(activate == 1){
            paint.setColor(Color.parseColor("#D15959"));
        }
        paint.setShadowLayer(20, 0, 0, Color.parseColor("#968F8F"));

        // Important for certain APIs
        setLayerType(LAYER_TYPE_SOFTWARE, paint);
        canvas.drawCircle(width / 2, height / 2, height / 4, paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(width / 5);
        canvas.drawText("START", width/5 , height/2, paint);

    }


  /*
    //Circle flickers
    public boolean onTouchEvent(MotionEvent event){
        if(activate == 0){
            activate = 1;
        } else if(activate == 1){
            activate = 0;
        }


        //Refresh the control
        this.invalidate();

        return super.onTouchEvent(event);
    }
*/



}
