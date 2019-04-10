package com.example.timsonhonhat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TimMinActivity extends Activity {
	Button btn1;
	TextView ketQua;
	EditText soThuNhat, soThuHai;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tim_min);
		btn1 = (Button) findViewById(R.id.btnTinh);
		ketQua = (TextView) findViewById(R.id.textView1);
		soThuNhat = (EditText) findViewById(R.id.eTSTNhat);
		soThuHai = (EditText) findViewById(R.id.eTSTHai);

		btn1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				double soA, soB;
				try {
					soA = Double.parseDouble(soThuNhat.getText().toString());
					soB = Double.parseDouble(soThuHai.getText().toString());
					if (soA < soB) {
						ketQua.setText("min: " + soA);
					} else {
						ketQua.setText("min: " + soB);
					}
				} catch (Exception e) {
					Toast.makeText(getApplicationContext(), "Lỗi nhập chữ ", Toast.LENGTH_LONG).show();
					ketQua.setText("Lỗi nhập chữ, xin hãy nhập lại");
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tim_min, menu);
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
