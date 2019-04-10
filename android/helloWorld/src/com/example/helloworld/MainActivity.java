package com.example.helloworld;

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
	EditText tex1;
	TextView vet1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.button1);
		tex1 = (EditText) findViewById(R.id.edittext1);
		vet1 = (TextView) findViewById(R.id.textView1);

		btn1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				double radius = 0, chuVi = 0;
				try {
					radius = Double.parseDouble(tex1.getText().toString());
					Log.d("tag", "du lieu: " + tex1.getText().toString());
					Toast.makeText(getApplicationContext(), "Dữ liệu: " + tex1.getText().toString(), Toast.LENGTH_LONG)
							.show();

					chuVi = 2 * radius * Math.PI;

					vet1.setText("Chu vi hình tròn cần tính là: " + chuVi);
				} catch (Exception e) {
					Toast.makeText(getApplicationContext(), "Lỗi nhập chữ " + tex1.getText().toString(), Toast.LENGTH_LONG)
							.show();

					vet1.setText("Lỗi nhập chữ, xin hãy nhập lại");
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
