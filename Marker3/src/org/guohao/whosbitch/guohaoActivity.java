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

public class guohaoActivity extends Activity {

	EditText name;

	EditText height;

	EditText sex;
	EditText age;

	// Button bn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// ��ֹ���뷨�Զ�����
		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		// ����ȫ��
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN); //
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_main);
		// ��һ����ť
		final Button bn = (Button) findViewById(R.id.next);

		name = (EditText) findViewById(R.id.name);

		sex = (EditText) findViewById(R.id.sex);

		height = (EditText) findViewById(R.id.height);
		age = (EditText) findViewById(R.id.age);

		bn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View source) {

				if (age.getText().toString().length() < 1
						|| height.getText().toString().length() < 1
						|| sex.getText().toString().length() < 1
						|| name.getText().toString().length() < 1)

				{

					Intent intent = new Intent();

					intent.setClass(guohaoActivity.this, errorActivity.class);
					startActivity(intent);
					guohaoActivity.this.finish();
				} else {

					// �Զ����

					name.setText(R.string.nameR);
					age.setText(R.string.ageR);
					sex.setText(R.string.sexR);
					height.setText(R.string.heightR);

					// ������һҳ
					Intent intent = new Intent();

					intent.setClass(guohaoActivity.this, NextActivity.class);
					startActivity(intent);
					// guohaoActivity.this.finish();

				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		super.onCreateOptionsMenu(menu);

		MenuItem settings = menu.add("����");
		settings.setIntent(new Intent(this, settingsActivity.class));
		// return super.onCreateOptionsMenu(menu);

		MenuItem about = menu.add("����");
		about.setIntent(new Intent(this, aboutActivity.class));

		MenuItem share = menu.add("����");
		share.setIntent(new Intent(this, aboutActivity.class));

		MenuItem quit = menu.add("�˳�");
		quit.setIntent(new Intent(this, aboutActivity.class));

		return true;
	}

	/*
	 * public boolean onOptionsItemSelected(MenuItem item) {
	 * 
	 * Intent intent = new Intent();
	 * 
	 * intent.setClass(guohaoActivity.this, aboutActivity.class);
	 * startActivity(intent); // guohaoActivity.this.finish();
	 * 
	 * return true; }
	 */

}
