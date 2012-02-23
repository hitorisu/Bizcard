package sample.bizcard;

import android.os.Bundle;

public class MapActivity extends com.google.android.maps.MapActivity {
	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);

		setContentView(R.layout.map);
	}

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}