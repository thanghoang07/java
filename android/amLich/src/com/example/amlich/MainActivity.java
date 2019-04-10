package com.example.amlich;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button btn1, btn2, btn3;
	TextView ketQua;
	EditText nam;
	RelativeLayout bgroud;
	int[] dsHinh = { R.drawable.h1, R.drawable.h2, R.drawable.h3, R.drawable.h4, R.drawable.h5, R.drawable.h6,
			R.drawable.h7, R.drawable.h8, R.drawable.h9, R.drawable.h10, R.drawable.h11, R.drawable.h12 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		btn3 = (Button) findViewById(R.id.button3);
		nam = (EditText) findViewById(R.id.editText1);
		ketQua = (TextView) findViewById(R.id.textView1);
		bgroud = (RelativeLayout) findViewById(R.id.manHinh);

		btn1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tinhLichAm();
			}
		});

		btn2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				nam.setText("");
				ketQua.setText("Kết quả: ");
				bgroud.setBackgroundColor(Color.WHITE);
			}
		});

		btn3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				tinhNamNhuan();
			}
		});
	}

	public void tinhLichAm() {
		try {
			int namD = Integer.parseInt(nam.getText().toString()), chiaX, chiaXII;
			String amLich = "";
			chiaX = namD % 10;
			chiaXII = namD % 12;
			switch (chiaX) {
			case 0:
				amLich = "Canh";
				break;
			case 1:
				amLich = "Tân";
				break;
			case 2:
				amLich = "Nhâm";
				break;
			case 3:
				amLich = "Quý";
				break;
			case 4:
				amLich = "Giáp";
				break;
			case 5:
				amLich = "Ất";
				break;
			case 6:
				amLich = "Bính";
				break;
			case 7:
				amLich = "Đinh";
				break;
			case 8:
				amLich = "Mậu";
				break;
			case 9:
				amLich = "Kỳ";
				break;

			default:
				break;
			}
			switch (chiaXII) {
			case 0:
				amLich += " Thân";
				bgroud.setBackgroundResource(dsHinh[0]);
				break;
			case 1:
				amLich += " Dậu";
				bgroud.setBackgroundResource(dsHinh[1]);
				break;
			case 2:
				amLich += " Tuất";
				bgroud.setBackgroundResource(dsHinh[2]);
				break;
			case 3:
				amLich += " Hợi";
				bgroud.setBackgroundResource(dsHinh[3]);
				break;
			case 4:
				amLich += " Tý";
				bgroud.setBackgroundResource(dsHinh[4]);
				break;
			case 5:
				amLich += " Sữu";
				bgroud.setBackgroundResource(dsHinh[5]);
				break;
			case 6:
				amLich += " Dần";
				bgroud.setBackgroundResource(dsHinh[6]);
				break;
			case 7:
				amLich += " Mão";
				bgroud.setBackgroundResource(dsHinh[7]);
				break;
			case 8:
				amLich += " Thìn";
				bgroud.setBackgroundResource(dsHinh[8]);
				break;
			case 9:
				amLich += " Tỵ";
				bgroud.setBackgroundResource(dsHinh[9]);
				break;
			case 10:
				amLich += " Ngọ";
				bgroud.setBackgroundResource(dsHinh[10]);
				break;
			case 11:
				amLich += " Mùi";
				bgroud.setBackgroundResource(dsHinh[11]);
				break;
			default:
				break;
			}
			Log.d("tag", "du lieu: " + nam.getText().toString());
			Toast.makeText(getApplicationContext(), "Dữ liệu: " + nam.getText().toString(), Toast.LENGTH_LONG).show();
			ketQua.setText("năm " + namD + " là năm " + amLich);
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(), "Lỗi nhập chữ " + nam.getText().toString(), Toast.LENGTH_LONG)
					.show();

			ketQua.setText("Lỗi nhập chữ, xin hãy nhập lại");
		}
	}

	public void tinhNamNhuan() {
		try {
			int namD = Integer.parseInt(nam.getText().toString());
			if (namD % 100 != 0) {
				if (namD % 4 == 0) {
					Log.d("tag", "du lieu: " + nam.getText().toString());
					Toast.makeText(getApplicationContext(), "Dữ liệu: " + nam.getText().toString(), Toast.LENGTH_LONG)
							.show();
					ketQua.setText("năm " + namD + " là năm nhuận");
					bgroud.setBackgroundColor(Color.CYAN);
				} else {
					Log.d("tag", "du lieu: " + nam.getText().toString());
					Toast.makeText(getApplicationContext(), "Dữ liệu: " + nam.getText().toString(), Toast.LENGTH_LONG)
							.show();
					ketQua.setText("năm " + namD + " không là năm nhuận");
				}
			} else {
				Log.d("tag", "du lieu: " + nam.getText().toString());
				Toast.makeText(getApplicationContext(), "Dữ liệu: " + nam.getText().toString(), Toast.LENGTH_LONG)
						.show();
				ketQua.setText("năm " + namD + " không là năm nhuận");
			}
		} catch (Exception e) {
			Log.d("tag", "du lieu: " + nam.getText().toString());
			Toast.makeText(getApplicationContext(), "Lỗi nhập chữ " + nam.getText().toString(), Toast.LENGTH_LONG)
					.show();

			ketQua.setText("Lỗi nhập chữ, xin hãy nhập lại");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
