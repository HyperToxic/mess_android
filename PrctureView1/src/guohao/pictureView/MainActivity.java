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
	// 初始化数组图片
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
			//设置该activity显示activity_main文件定义的View
		setContentView(R.layout.activity_main);
		LinearLayout main = (LinearLayout) findViewById(R.id.root);  //获取线性布局管理器
		final ImageView image = new ImageView(this);  //创建ImageView组件
		main.addView(image);  // 把ImageView加进线性布局管理器
		image.setImageResource(images[0]);//初始化时显示第一张照片
		image.setOnClickListener(new OnClickListener() {  //新建一个接听器匿名类
			public void onClick(View v) {
				if (currentImage >= 2) {
					currentImage = -1;
				}
				image.setImageResource(images[++currentImage]);
			}
		});
	}
}