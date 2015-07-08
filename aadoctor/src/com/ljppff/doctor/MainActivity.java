package com.ljppff.doctor;


import com.webdesign688.hksla.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends BaseActivity {

    private Button mBtmain2;
	private Button mBtmain1;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

	private void initView() {
		mBtmain2 =(Button)findViewById(R.id.mBtmain2);
		mBtmain1 =(Button)findViewById(R.id.mBtmain1);
		mBtmain1.setOnClickListener(listener);
		mBtmain2.setOnClickListener(listener);
		
		
	}
     
	OnClickListener listener =new OnClickListener() {
		
		@Override
		public void onClick(View v) {
		switch (v.getId()) {
		case R.id.mBtmain2:
			 startActivity(new Intent(getApplicationContext(), MainActivity2.class));		

			break;

		case R.id.mBtmain1:
	 startActivity(new Intent(getApplicationContext(), MainActivity1.class));		
			break;

		default:
			break;
		}
			
		}
	};
	private long exitTime;

	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		if(event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_BACK){
			if((System.currentTimeMillis() - exitTime) > 2000){
				Toast.makeText(getApplicationContext(), "再按一次退出程序", 1).show();
				exitTime = System.currentTimeMillis();
				}else{
					com.ljppff.doctor.util.AppManager.getAppManager().AppExit(getApplicationContext());
					android.os.Process.killProcess(android.os.Process.myPid());
				}
			return true;
			}
		return super.dispatchKeyEvent(event);
	}
	
}
