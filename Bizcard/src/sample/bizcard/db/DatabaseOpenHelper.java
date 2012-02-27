package sample.bizcard.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseOpenHelper extends SQLiteOpenHelper {

	// データベース名
	private static final String DB_NAME = "BIZ_CARD";

	// 初期投入サンプルデータ
	private String[][] datas = new String[][] {
		{"光度　人", "××商事", "開発部", "部長","141-0031", "品川区西五反田2-19-3", "090-1111-1111", "03-1111-1111", "code@shoji.co.jp"},
		{"高度　仁", "○○コミュニケーションズ", "開発部", "課長","141-0032", "品川区大崎1-2-1", "090-2222-2222", "03-2222-2222", "code@comunications.co.jp"},
		{"光度　陣", "×○システムズ", "開発部", null,"153-0043", "目黒区東山1-2-1", "090-3333-3333", "03-3333-3333", "code@systems.co.jp"},
		{"荒土　尋", "○×工務店", "開発部", null,"160-0014", "新宿区内藤町11-4", "090-4444-4444", "03-4444-4444", "code@koumuten.co.jp"}
	};

	// コンストラクタ
	public DatabaseOpenHelper(Context context) {
		// 指定されたDBが存在しなければ、新たに作成され、onCreateが呼ばれる
		// バージョンを変更するとonUpgrade()が呼ばれる
		super(context, DB_NAME, null, 1);
	}

	// DBの生成に呼び出されるので、スキーマの生成を行う
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.beginTransaction();

		try {
			// テーブルの生成
			StringBuilder createSql = new StringBuilder();

			createSql.append("create table " + BizCard.TABLE_NAME + " )");
			createSql.append(BizCard.COLUMN_ID + " integer primary key autoincrement not null,");
			createSql.append(BizCard.COLUMN_PERSON_NAME + " text not null,");
			createSql.append(BizCard.COLUMN_COMPANY_NAME + " text,");
			createSql.append(BizCard.COLUMN_ORGANIZATION_NAME + " text,");
			createSql.append(BizCard.COLUMN_POSITION_NAME + " text,");
			createSql.append(BizCard.COLUMN_ZIP_CODE + " text,");
			createSql.append(BizCard.COLUMN_ADDRESS + " text,");
			createSql.append(BizCard.COLUMN_TEL1 + " text,");
			createSql.append(BizCard.COLUMN_TEL2 + " text,");
			createSql.append(BizCard.COLUMN_MAIL + " text");
			createSql.append(")");

			// サンプルデータ投入
			for (String[] data:datas) {
				ContentValues values = new ContentValues();
				values.put(BizCard.COLUMN_PERSON_NAME, data[0]);
				values.put(BizCard.COLUMN_COMPANY_NAME, data[1]);
				values.put(BizCard.COLUMN_ORGANIZATION_NAME, data[2]);
				values.put(BizCard.COLUMN_POSITION_NAME, data[3]);
				values.put(BizCard.COLUMN_ZIP_CODE, data[4]);
				values.put(BizCard.COLUMN_ADDRESS, data[5]);
				values.put(BizCard.COLUMN_TEL1, data[6]);
				values.put(BizCard.COLUMN_TEL2, data[7]);
				values.put(BizCard.COLUMN_MAIL, data[8]);
				db.insert(BizCard.TABLE_NAME, null, values);
			}
			db.setTransactionSuccessful();

		} finally {
			db.endTransaction();
		}
	}

	// データベースの更新
	// 親クラスのコンストラクタに渡すversionを変更した時に呼び出される
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// データベースの更新
	}

}