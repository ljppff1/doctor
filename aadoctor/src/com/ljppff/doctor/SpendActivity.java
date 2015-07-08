package com.ljppff.doctor;

import com.ljppff.doctor.util.AppManager;
import com.ljppff.doctor.util.Util;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.webdesign688.hksla.R;

public class SpendActivity extends BaseActivity {
	private RelativeLayout mRlSpendLayout;
	private TextView mTvSpendText;

	// 定义动画效果
    private int downa=5;
	private boolean flag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spend);
		initView();
		 flag =	Util.isPad(getApplicationContext());
	//	boolean flag1=	Util.isTabletDevice(getApplicationContext());
		

        new MyThread().start();
	}

	class MyThread extends Thread {
		@Override
		public void run() {
		    for(int i=0;i<5;i++){
		    	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		    	if(i==4){
		    		downa--;
		    		handler.sendEmptyMessage(2);
		    	
		    	}else{
		    		downa--;
		    	handler.sendEmptyMessage(1);
		    	}
		    }
			super.run();
		}
	}

	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			switch (msg.what) {
			case 1:
				mTvSpendText.setText(downa+"");

				break;
			case 2:
				mTvSpendText.setText(downa+"");
				startActivity(new Intent(getApplicationContext(), MainActivity.class));
				AppManager.getAppManager().finishActivity();
				break;

			default:
				break;
			}
		}
	};

	private void initView() {
		mRlSpendLayout = (RelativeLayout) this
				.findViewById(R.id.mRlSpendLayout);
		mTvSpendText = (TextView) this.findViewById(R.id.mTvSpendText);

		
	}

	@Override
	protected void onStart() {
		super.onStart();
	
	}

}
