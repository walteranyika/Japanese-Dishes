package com.walter.nihondishes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {
	TextView tvTitle, tvDesc;
	ImageView img;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		tvTitle = (TextView) findViewById(R.id.tvTitle);
		tvDesc = (TextView) findViewById(R.id.tvDesc);
		img = (ImageView) findViewById(R.id.ivImage);
		
		int pos = getIntent().getExtras().getInt("pos");
		
		Dish d = Utility.getAllDishes().get(pos);
		
		tvTitle.setText(d.getTitle());
		tvDesc.setText(d.getDesc());
		img.setImageResource(d.getImage());
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}

}
