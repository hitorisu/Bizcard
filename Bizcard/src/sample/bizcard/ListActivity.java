package sample.bizcard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends Activity {
    /** Called when the activity is first created. */

	// listView の定義
	private ListView listView = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // R.java からlistの値を取得
        listView = (ListView) findViewById(R.id.list);

        // ListViewに表示する要素を保持するアダプタ作成
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        // アダプタに要素追加
        arrayAdapter.add("新規追加");

        // listViewにアダプタを設定
        listView.setAdapter(arrayAdapter);
    }
}