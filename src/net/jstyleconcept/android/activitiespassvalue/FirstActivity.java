package net.jstyleconcept.android.activitiespassvalue;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends Activity {
	private EditText edit1,edit2;
	private Button sendButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_firstactivity);
		edit1=(EditText)findViewById(R.id.editText1);
		edit2=(EditText)findViewById(R.id.editText2);
		sendButton=(Button)findViewById(R.id.button1);
		sendButton.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
				Bundle bundle=new Bundle();
				bundle.putString("value1",edit1.getText().toString());
				bundle.putString("value2",edit2.getText().toString());
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout_firstactivity, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent=new Intent(FirstActivity.this,FirstActivity_Src.class);
		switch(item.getOrder()) {
			case 0:
				startActivity(intent);
				break;
		}
		return super.onOptionsItemSelected(item);
	}
}