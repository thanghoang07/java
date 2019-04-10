package com.example.tongsotn;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button btn1;
	TextView day, tong;
	EditText nhapN;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.button1);
		day = (TextView) findViewById(R.id.textView2);
		tong = (TextView) findViewById(R.id.textView3);
		nhapN = (EditText) findViewById(R.id.editText1);

		btn1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					int soN = Integer.parseInt(nhapN.getText().toString()), tongN = 0;
					String chuoiS = "";
					if (soN <= 0) {
						Log.d("tag", "du lieu: " + nhapN.getText().toString());
						Toast.makeText(getApplicationContext(), "Dữ liệu: " + nhapN.getText().toString(),
								Toast.LENGTH_LONG).show();
						day.setText("Dãy S = 0");
						tong.setText("Tổng " + soN + " la: " + tongN);
					} else {
						for (int i = 1; i <= soN; i++) {
							tongN += i;
							chuoiS += String.valueOf(i);
							chuoiS += (i != soN) ? " + " : "";
						}
						Log.d("tag", "du lieu: " + nhapN.getText().toString());
						Toast.makeText(getApplicationContext(), "Dữ liệu: " + nhapN.getText().toString(),
								Toast.LENGTH_LONG).show();
						day.setText("Dãy S = " + chuoiS);
						tong.setText("Tổng " + soN + " la: " + tongN);
					}
				} catch (Exception e) {
					Log.d("tag", "du lieu: " + nhapN.getText().toString());
					Toast.makeText(getApplicationContext(), "Lỗi nhập chữ " + nhapN.getText().toString(),
							Toast.LENGTH_LONG).show();

					day.setText("Lỗi nhập chữ, xin hãy nhập lại");
					tong.setText("Lỗi nhập chữ, xin hãy nhập lại");
				}
			}
		});
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
