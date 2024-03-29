package com.example.framelayout;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	private int currentColor = 0;
	//定义一个颜色数组
	final int[] colors = new int[] { 
			R.color.color7, 
			R.color.color6,
			R.color.color5, 
			R.color.color4, 
			R.color.color3, 
			R.color.color2,
			R.color.color1, 
			};
//
	final int[] names = new int[] { 
			R.id.View1, 
			R.id.View2, 
			R.id.View3,
			R.id.View4, 
			R.id.View5, 
			R.id.View6, 
			R.id.View7 
			};
	TextView[] views = new TextView[7];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		for (int i = 0; i < 7; i++) {
			views[i] = (TextView) findViewById(names[i]);
			//
		}
		final Handler handler = new Handler() {
			public void handleMessage(Message msg) {
				if (msg.what == 0x1122) {
					for (int i = 0; i < 7-currentColor; i++) {
						views[i].setBackgroundResource(colors[i + currentColor]);
					}

						for (int i = 7 - currentColor, j = 0; i < 7; i++, j++) {
							views[i].setBackgroundResource(colors[j]);
						}
					
					super.handleMessage(msg);
				}
			}
		};

		new Timer().schedule(new TimerTask() {
			public void run() {
				currentColor++;
				if (currentColor >= 6) {
					currentColor = 0;
				}
				Message m = new Message();
				m.what = 0x1122;
				handler.sendMessage(m);
			}
		}, 0, 100);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
