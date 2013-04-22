import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class main extends Activity {
	// 初始化数组图片
	int[] images = new int[] { R.drawable.guohao, R.drawable.flower,
			R.drawable.snow, };
	int currentImage = 0;

	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		LinearLayout main = (LinearLayout) findViewById(R.id.root);
		final ImageView image = new ImageView(this);
		main.addView(image);
		image.setImageResource(images[0]);
		image.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (currentImage >= 3) {
					currentImage = -1;
				}
				image.setImageResource(images[++currentImage]);
			}
		});
	}
}