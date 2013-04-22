package org.guohao.whosbitch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class NextActivity extends Activity {

	EditText haircut;

	EditText music;

	EditText books;
	EditText car;

	// Button bn;

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

		setContentView(R.layout.activity_next);
		// 下一步按钮
		final Button bn = (Button) findViewById(R.id.next);
		final Button bn2 = (Button) findViewById(R.id.result);

		haircut = (EditText) findViewById(R.id.haircut);

		music = (EditText) findViewById(R.id.music);
		car = (EditText) findViewById(R.id.car);

		books = (EditText) findViewById(R.id.books);

		bn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View source) {
				Intent intent = new Intent();

				intent.setClass(NextActivity.this, guohaoActivity.class);
				startActivity(intent);
				NextActivity.this.finish();

			}
		});

		// 结果按钮的设置
		bn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View source) {

				if (music.getText().toString().length() < 1
						|| car.getText().toString().length() < 1
						|| haircut.getText().toString().length() < 1
						|| books.getText().toString().length() < 1)

				{

					Intent intent = new Intent();

					intent.setClass(NextActivity.this, errorActivity.class);
					startActivity(intent);
					NextActivity.this.finish();
				}

				else {

					music.setText(R.string.musicR);
					car.setText(R.string.carR);
					haircut.setText(R.string.haircutR);
					books.setText(R.string.booksR);
					//

					Intent intent = new Intent();

					intent.setClass(NextActivity.this, resultActivity.class);
					startActivity(intent);
					// 在当前activity基础上弹出菜单
					// NextActivity.this.finish();

				}

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		super.onCreateOptionsMenu(menu);

		// menu.add(R.string.quit);
		menu.add(R.string.about);

		// menu.add(R.string.settings);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		Intent intent = new Intent();

		intent.setClass(NextActivity.this, aboutActivity.class);
		startActivity(intent);
		// NextActivity.this.finish();

		return true;
	}

}
