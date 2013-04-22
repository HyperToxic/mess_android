package org.guohao.whosbitch;

import android.os.Bundle;
import android.app.Activity;
//import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText name;
	EditText job;
	EditText av;
	EditText hei;
	EditText music;
	EditText sex;
	EditText like;
   // Button bn;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Button bn = (Button) findViewById(R.id.bn);
		final Button bn2 = (Button) findViewById(R.id.bn2);
		name = (EditText) findViewById(R.id.your_name);
		job = (EditText) findViewById(R.id.job);
		av = (EditText) findViewById(R.id.av);
		like = (EditText) findViewById(R.id.what_you_like_most);
		sex = (EditText) findViewById(R.id.fm);
		music = (EditText) findViewById(R.id.music);
		hei = (EditText) findViewById(R.id.height);
        //bn = (Button)findViewById(R.id.bn);
		bn.setOnClickListener(new OnClickListener() {

			// class MyClickListener implements View.OnClickListener{
			public void onClick(View source) {
				job.setText(R.string.jobR);
				name.setText(R.string.nameR);
				av.setText(R.string.avR);
				like.setText(R.string.likeR);
				sex.setText(R.string.sexR);
				music.setText(R.string.musicR);
				hei.setText(R.string.heiR);
			

			}
		});
		
		bn2.setOnClickListener(new OnClickListener() {

			// class MyClickListener implements View.OnClickListener{
			public void onClick(View source) {
				job.setText("");
				name.setText("");
				av.setText("");
				like.setText("");
				sex.setText("");
				music.setText("");
				hei.setText("");
				
				//super.onCreate(savedInstanceState);
				//setContentView(R.layout.activity_about);
			

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		super.onCreateOptionsMenu(menu);

		//menu.add(R.string.quit);
		menu.add(R.string.about);
		//menu.add(R.string.settings);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		

		setContentView(R.layout.activity_about);

		return true;
	}

}
