package org.guohao.whosbitch; 
import android.app.Activity; 
import android.os.Bundle; 
import android.view.MotionEvent; 
import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.LinearLayout; 
import android.widget.Toast; 
public class resultActivity extends Activity { 
private LinearLayout layout; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_result); 
layout=(LinearLayout)findViewById(R.id.exit_layout);
layout.setOnClickListener(new OnClickListener() { 
@Override 
public void onClick(View v) { 
// TODO Auto-generated method stub 
Toast.makeText(getApplicationContext(), "��ʾ����������ⲿ�رմ��ڣ�", 
Toast.LENGTH_SHORT).show(); 
} 
}); 
} 
@Override 
public boolean onTouchEvent(MotionEvent event){ 
finish(); 
return true; 
} 

}

