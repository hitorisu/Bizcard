package sample.bizcard;

import android.app.Activity;
import android.os.Bundle;

public class ShowActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// R.javaからshowレイアウトを生成
		setContentView(R.layout.show);
	}

}