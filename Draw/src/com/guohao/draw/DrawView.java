package com.guohao.draw;

//import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

class DrawView extends View {
	public float currentX = 40;
	public float currentY = 50;
	Paint p = new Paint();//尽量不要再onDraw中创建实例。放到类field上

	public DrawView(Context context) {
		super(context);
	}

	//@SuppressLint("DrawAllocation")
	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		p.setColor(Color.RED);
		canvas.drawCircle(currentX, currentY, 15, p);
	}

}
