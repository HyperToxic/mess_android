package org.guohao.whosbitch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

//import android.text.Editable;

public class errorActivity extends Activity {

	int[] images = new int[] { R.drawable.error,

	};
	int currentImage = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		// ����ȫ��
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_null);
		LinearLayout main = (LinearLayout) findViewById(R.id.error); // ��ȡ���Բ��ֹ�����
		final ImageView image = new ImageView(this); // ����ImageView���
		main.addView(image); // ��ImageView�ӽ����Բ��ֹ�����
		image.setImageResource(images[0]);// ��ʼ��ʱ��ʾ��һ����Ƭ
		image.setOnClickListener(new OnClickListener() { // �½�һ��������������
			@Override
			public void onClick(View v) {

				Intent intent = new Intent();

				intent.setClass(errorActivity.this, guohaoActivity.class);
				startActivity(intent);
				errorActivity.this.finish();

			}
		});

	}

}
