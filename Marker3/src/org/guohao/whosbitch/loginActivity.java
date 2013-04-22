package org.guohao.whosbitch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends Activity {

	EditText code;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 禁止输入法自动弹出
		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		// 设置全屏
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN); //
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_login);
		// 下一步按钮
		final Button bn = (Button) findViewById(R.id.login);

		code = (EditText) findViewById(R.id.code);

		bn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View source) {
				String codeS = code.getText().toString();

				// 获取认证码并判断
				if (codeS.length() > 10)

				{

					Intent intent = new Intent();

					intent.setClass(loginActivity.this, guohaoActivity.class);
					startActivity(intent);
					loginActivity.this.finish();
				} else {

					Intent intent = new Intent();

					intent.setClass(loginActivity.this, aboutActivity.class);
					startActivity(intent);
					// guohaoActivity.this.finish();

				}
			}
		});
	}

}
