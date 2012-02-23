package sample.bizcard;

import android.app.Activity;
import android.os.Bundle;

public class RegistActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// R.javaからregistレイアウトを生成
		setContentView(R.layout.regist);
	}
}
