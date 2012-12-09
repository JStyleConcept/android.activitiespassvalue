package net.jstyleconcept.android.activitiespassvalue;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
	private TextView resultText1,resultText2;
	private Button backButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_secondactivity);
		resultText1=(TextView)findViewById(R.id.editText1);
		resultText2=(TextView)findViewById(R.id.editText2);
		backButton=(Button)findViewById(R.id.button1);
		backButton.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				SecondActivity.this.finish();
			}
		});
		Bundle bundle=getIntent().getExtras();
		resultText1.setText(bundle.getString("value1"));
		resultText2.setText(bundle.getString("value2"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.layout_secondactivity,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent=new Intent(SecondActivity.this,SecondActivity_Src.class);
		switch(item.getOrder()) {
			case 0:
				startActivity(intent);
				break;
			case 1:
				moveTaskToBack(true);
				break;
		}
		return super.onOptionsItemSelected(item);	
	}
}