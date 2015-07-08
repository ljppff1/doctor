package com.ljppff.doctor;

import com.ljppff.doctor.util.AppManager;
import com.ljppff.doctor.util.Util;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.webdesign688.hksla.R;

public class WhatActivity extends BaseActivity {
	private boolean flag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_what);
		 flag =	Util.isPad(getApplicationContext());
		 
		//flag =true;
			if(flag){
				startActivity(new Intent(getApplicationContext(), SpendActivityP.class));
			}else{
			startActivity(new Intent(getApplicationContext(), SpendActivity.class));
			}
			AppManager.getAppManager().finishActivity();
	}

}
