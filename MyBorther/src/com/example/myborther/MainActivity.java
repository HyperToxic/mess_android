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
	// ��ʼ������ͼƬ
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
		// ���ø�activity��ʾactivity_main�ļ������View
		setContentView(R.layout.whatsnew);
		RelativeLayout main = (RelativeLayout) findViewById(R.id.myBrother); // ��ȡ���Բ��ֹ�����
		final ImageView image = new ImageView(this); // ����ImageView���
		final Button bn = (Button) findViewById(R.id.tips);

		bn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View source) {

				Intent intent = new Intent();

				intent.setClass(MainActivity.this, aboutActivity.class);
				startActivity(intent);

			}

		});

		main.addView(image); // ��ImageView�ӽ����Բ��ֹ�����
		image.setImageResource(images[0]);// ��ʼ��ʱ��ʾ��һ����Ƭ
		image.setOnClickListener(new OnClickListener() { // �½�һ��������������
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
