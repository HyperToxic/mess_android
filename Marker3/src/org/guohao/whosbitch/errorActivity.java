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
		// 设置全屏
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_null);
		LinearLayout main = (LinearLayout) findViewById(R.id.error); // 获取线性布局管理器
		final ImageView image = new ImageView(this); // 创建ImageView组件
		main.addView(image); // 把ImageView加进线性布局管理器
		image.setImageResource(images[0]);// 初始化时显示第一张照片
		image.setOnClickListener(new OnClickListener() { // 新建一个接听器匿名类
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
