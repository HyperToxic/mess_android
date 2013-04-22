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
	Paint p = new Paint();//������Ҫ��onDraw�д���ʵ�����ŵ���field��

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
