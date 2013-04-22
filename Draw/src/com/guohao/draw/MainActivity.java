package com.guohao.draw;

import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	//创建DrawView实例

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LinearLayout root = (LinearLayout)findViewById(R.id.root);
		final DrawView draw = new DrawView(this);
		final DrawView draw2 = new DrawView(this);
		draw.setMinimumWidth(300);
		draw.setMinimumHeight(500);
		draw2.setMinimumWidth(300);
		draw2.setMinimumHeight(500);
	//	root.addView(draw2);
		//为draw组件设置 触摸事件
		draw.setOnTouchListener(new View.OnTouchListener(){
			public boolean onTouch(View args0, MotionEvent event){
				draw.currentX = event.getX();
				draw.currentY = event.getY();
				draw.invalidate();
				return true;
			}
		});
		root.addView(draw);
	//	root.addView(draw2);
	}

	
	/*public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}*/

}
