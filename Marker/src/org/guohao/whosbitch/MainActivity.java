package org.guohao.whosbitch;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

//import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	int[] images = new int[] { R.drawable.splash1, R.drawable.splash2,
			R.drawable.splash3,

	};
	int currentImage = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_splash);

		LinearLayout main = (LinearLayout) findViewById(R.id.splash); // ��ȡ���Բ��ֹ�����
		final ImageView image = new ImageView(this); // ����ImageView���
		main.addView(image); // ��ImageView�ӽ����Բ��ֹ�����
		image.setImageResource(images[0]);// ��ʼ��ʱ��ʾ��һ����Ƭ
		image.setOnClickListener(new OnClickListener() { // �½�һ��������������
			public void onClick(View v) {
				if (currentImage >= 2) {
					Intent intent = new Intent();

					intent.setClass(MainActivity.this, SecondActivity.class);
					startActivity(intent);
					MainActivity.this.finish();

				} else {
					image.setImageResource(images[currentImage + 1]);
					++currentImage;
				}
			}
		});

	}
}
