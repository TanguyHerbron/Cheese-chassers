package com.nauk.cheesechassers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class GraphicManager extends View implements View.OnTouchListener {

    private int y;
    private int x;
    private Board board;
    private Modele modele;

    public GraphicManager(Context context) {
        super(context);

        init();
    }

    public GraphicManager(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public GraphicManager(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    public GraphicManager(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init();
    }

    private void init()
    {

        this.setBackgroundColor(Color.RED);

        modele = new Modele();
        board = new Board(modele.getMonTableau());
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }
}
