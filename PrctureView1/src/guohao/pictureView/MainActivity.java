package guohao.pictureView;

//import android.R;
//import android.annotation.TargetApi;
import android.app.Activity;
//import android.os.Build;
import android.os.Bundle;
//import android.os.Handler;
//import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.annotation.SuppressLint;
/*import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
*/

@SuppressLint("SuspiciousImport")
public class MainActivity extends Activity {
	// ��ʼ������ͼƬ
	int[] images = new int[] { R.drawable.guohao,
			R.drawable.flower,
			R.drawable.snow,
			/*R.drawable.girl,
			R.drawable.boy,
			R.drawable.*/
			};
	int currentImage = 0;

	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
			//���ø�activity��ʾactivity_main�ļ������View
		setContentView(R.layout.activity_main);
		LinearLayout main = (LinearLayout) findViewById(R.id.root);  //��ȡ���Բ��ֹ�����
		final ImageView image = new ImageView(this);  //����ImageView���
		main.addView(image);  // ��ImageView�ӽ����Բ��ֹ�����
		image.setImageResource(images[0]);//��ʼ��ʱ��ʾ��һ����Ƭ
		image.setOnClickListener(new OnClickListener() {  //�½�һ��������������
			public void onClick(View v) {
				if (currentImage >= 2) {
					currentImage = -1;
				}
				image.setImageResource(images[++currentImage]);
			}
		});
	}
}