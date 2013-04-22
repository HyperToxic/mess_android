package com.example.myborther;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.annotation.SuppressLint;
import android.content.Intent;

@SuppressLint("SuspiciousImport")
public class MainActivity extends Activity {
	// 初始化数组图片
	int[] images = new int[] { R.drawable.begin, R.drawable.a, R.drawable.b,
			R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
			R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j,
			R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n,
			R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r,
			R.drawable.end,

	};
	int currentImage = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		WindowManager.LayoutParams.FLAG_FULLSCREEN); 
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		// 设置该activity显示activity_main文件定义的View
		setContentView(R.layout.whatsnew);
		RelativeLayout main = (RelativeLayout) findViewById(R.id.myBrother); // 获取线性布局管理器
		final ImageView image = new ImageView(this); // 创建ImageView组件
		final Button bn = (Button) findViewById(R.id.tips);

		bn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View source) {

				Intent intent = new Intent();

				intent.setClass(MainActivity.this, aboutActivity.class);
				startActivity(intent);

			}

		});

		main.addView(image); // 把ImageView加进线性布局管理器
		image.setImageResource(images[0]);// 初始化时显示第一张照片
		image.setOnClickListener(new OnClickListener() { // 新建一个接听器匿名类
			@Override
			public void onClick(View v) {
				if (currentImage <= 18) {

					image.setImageResource(images[++currentImage]);
				} else {
					Intent intent = new Intent();

					intent.setClass(MainActivity.this, aboutActivity.class);
					startActivity(intent);
					// guohaoActivity.this.finish();

				}
			}
		});

	}
}
