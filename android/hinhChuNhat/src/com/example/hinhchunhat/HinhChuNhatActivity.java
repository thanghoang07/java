package com.example.hinhchunhat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HinhChuNhatActivity extends Activity {
	Button btn1;
	TextView ketQua;
	EditText cDaiEdit, cRongEdit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hinh_chu_nhat);
		btn1 = (Button) findViewById(R.id.btnTinh);
		ketQua = (TextView) findViewById(R.id.textView1);
		cDaiEdit = (EditText) findViewById(R.id.editTextDai);
		cRongEdit = (EditText) findViewById(R.id.editTextRong);

		btn1.setOnClickListener(new View.OnClickListener() {
			int cDai, cRong, kQua;

			@Override
			public void onClick(View v) {
				try {
					// TODO Auto-generated method stub
					cDai = Integer.parseInt(cDaiEdit.getText().toString());
					cRong = Integer.parseInt(cRongEdit.getText().toString());
					if (cDai >= 0 && cRong >= 0) {
						kQua = cDai * cRong;
						Toast.makeText(getApplicationContext(), "Diện tích là " + ketQua, Toast.LENGTH_LONG).show();
						ketQua.setText("Diện tích HCH cần tìm là: " + kQua);
					}else{
						ketQua.setText("Chiều dài hoặc chiều rộng nhập vào có số nhỏ hơn số không");
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
		getMenuInflater().inflate(R.menu.hinh_chu_nhat, menu);
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
