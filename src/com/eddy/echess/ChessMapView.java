package com.eddy.echess;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ChessMapView extends View {

	public ChessMapView(Context context) {
		super(context);
	}
	
	public ChessMapView(Context context , AttributeSet attrs){  
        super(context,attrs);  
    }  

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint p = new Paint();
		p.setColor(Color.RED);
		p.setTextSize(120);
		canvas.drawText("aaa", 100, 100, p);
	}

}
