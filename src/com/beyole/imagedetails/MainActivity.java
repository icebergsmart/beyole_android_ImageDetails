package com.beyole.imagedetails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.beyole.view.ImageDetailsView;
import com.beyole.view.ImageDetailsView.ImageDetailsViewListener;

public class MainActivity extends Activity {

	private ImageDetailsView detailsView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		detailsView = (ImageDetailsView) findViewById(R.id.id_imageDetailsView);
		detailsView.setImageDetailsViewOnclickListener(new ImageDetailsViewListener() {
			@Override
			public void onclick() {
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				startActivity(intent);
				// Toast.makeText(MainActivity.this, "点击了自定义view",
				// Toast.LENGTH_LONG).show();
			}
		});
	}
}
