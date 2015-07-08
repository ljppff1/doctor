package com.ljppff.doctor;

import java.util.ArrayList;
import java.util.List;

import com.ljppff.doctor.util.AppManager;
import com.ljppff.doctor.util.Info;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.FlagToString;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.webdesign688.hksla.R;


public class MainActivityP extends BaseActivity1 {

    private Button mBtmain2;
	private Button mBtmain1;
    private List<Info> list =new ArrayList<Info>();    
    private List<Info> list1 =new ArrayList<Info>();    
	private String[] strname =new String[]{"醫生","護士","探熱","血","傷風","打針","痛","病","消化","藥水",
			"藥丸","睏","衰弱","不適","發燒","大便","小便","嘔吐","肚瀉","手術"
			,"面色蒼白","耳鳴","見物件移動","鼻鼾","癱瘓","昏厥","昏迷","暈眩","中暑","苦澀味","吞嚥困難","打嗝","食慾不振","噁心","焦慮"
			,"胸悶","抑鬱症","中毒","擴散","自殺傾向","胃氣脹","腹腔咕嚕聲","肌肉抽筋","麻痺","尿頻"
			,"便秘","性無能","脫臼","容易全身無力","幻覺"};
	private String[] strnameu =new String[]{"Doctor","Nurse","Take temperature","Blood","Cold",
			"Injection","Pain","Sick","Digection","Liquid medicine",
			"Pill","Drowsy","Weakness","Uncomfortable","Fever",
			"Stool","Urine","Vomit","Diarrhea","Operation",
			"Pale face","Ringing in my ears","See things moving","Snore","Paralysis",
			"Black Out","Coma","Dizzy","Heatstroke","Biter taste on my tongue",
			"Difficulty in swallowing","Hiccup","Lost of appetite","Nausea","Anxiety",
			"Chest feels tight","Depression","Poisoning","Radiating","Suicidal tendency",
			"Bloated","Gurgling sound in my abdomen","Muscle spasm","Numb","Urinate frequently",
			"Constipation","Impotence","Dislocation","Fatigues easily","Hallucination"};
	private String[] strurl =new String[] {
			    "http://www.signlanguage.com.hk/medical/a01.mp4",
				"http://www.signlanguage.com.hk/medical/a02.mp4",
				"http://www.signlanguage.com.hk/medical/a03.mp4",
				"http://www.signlanguage.com.hk/medical/a04.mp4",
				"http://www.signlanguage.com.hk/medical/a05.mp4",
				"http://www.signlanguage.com.hk/medical/a06.mp4",
				"http://www.signlanguage.com.hk/medical/a07.mp4",
				"http://www.signlanguage.com.hk/medical/a08.mp4",
				"http://www.signlanguage.com.hk/medical/a09.mp4",
				"http://www.signlanguage.com.hk/medical/a10.mp4",
				"http://www.signlanguage.com.hk/medical/a11.mp4",
				"http://www.signlanguage.com.hk/medical/a12.mp4",
				"http://www.signlanguage.com.hk/medical/a13.mp4",
				"http://www.signlanguage.com.hk/medical/a14.mp4",
				"http://www.signlanguage.com.hk/medical/a15.mp4",
				"http://www.signlanguage.com.hk/medical/a16.mp4",
				"http://www.signlanguage.com.hk/medical/a17.mp4",
				"http://www.signlanguage.com.hk/medical/a18.mp4",
				"http://www.signlanguage.com.hk/medical/a19.mp4",
				"http://www.signlanguage.com.hk/medical/a20.mp4",
				"http://www.signlanguage.com.hk/medical/001.mp4",
				"http://www.signlanguage.com.hk/medical/002.mp4",
				"http://www.signlanguage.com.hk/medical/003.mp4",
				"http://www.signlanguage.com.hk/medical/004.mp4",
				"http://www.signlanguage.com.hk/medical/005.mp4",
				"http://www.signlanguage.com.hk/medical/006.mp4",
				"http://www.signlanguage.com.hk/medical/007.mp4",
				"http://www.signlanguage.com.hk/medical/008.mp4",
				"http://www.signlanguage.com.hk/medical/009.mp4",
				"http://www.signlanguage.com.hk/medical/010.mp4",
				"http://www.signlanguage.com.hk/medical/011.mp4",
				"http://www.signlanguage.com.hk/medical/012.mp4",
				"http://www.signlanguage.com.hk/medical/013.mp4",
				"http://www.signlanguage.com.hk/medical/014.mp4",
				"http://www.signlanguage.com.hk/medical/015.mp4",
				"http://www.signlanguage.com.hk/medical/016.mp4",
				"http://www.signlanguage.com.hk/medical/017.mp4",
				"http://www.signlanguage.com.hk/medical/018.mp4",
				"http://www.signlanguage.com.hk/medical/019.mp4",
				"http://www.signlanguage.com.hk/medical/020.mp4",
				"http://www.signlanguage.com.hk/medical/021.mp4",
				"http://www.signlanguage.com.hk/medical/022.mp4",
				"http://www.signlanguage.com.hk/medical/023.mp4",
				"http://www.signlanguage.com.hk/medical/024.mp4",
				"http://www.signlanguage.com.hk/medical/025.mp4",
				"http://www.signlanguage.com.hk/medical/026.mp4",
				"http://www.signlanguage.com.hk/medical/027.mp4",
				"http://www.signlanguage.com.hk/medical/028.mp4",
				"http://www.signlanguage.com.hk/medical/029.mp4",
				"http://www.signlanguage.com.hk/medical/030.mp4",
	};
	private GridView mLvmain1;
	private Button mBtmain1Bottom;
	private boolean flag =true;
	private MyAdapter adapter;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainp);
        flag =true;
        initData();
        initView();
        
    }




	private void initData() {
		for(int i=0;i<20;i++){
				Info info =new Info();
				info.setNameZh(strname[i]);
				info.setNameUS(strnameu[i]);
				info.setUrl(strurl[i]);
				list.add(info);
		}
		for(int i=20;i<50;i++){
			Info info =new Info();
			info.setNameZh(strname[i]);
			info.setNameUS(strnameu[i]);
			info.setUrl(strurl[i]);
			list1.add(info);
	}

	}




	private void initView() {
		mBtmain1 =(Button)this.findViewById(R.id.mBtmain1);
		mBtmain2 =(Button)this.findViewById(R.id.mBtmain2);
		mBtmain1.setOnClickListener(listener);
		mBtmain2.setOnClickListener(listener);		
		mLvmain1 =(GridView)this.findViewById(R.id.mLvmain1);
		adapter =new MyAdapter();
	       mLvmain1.setAdapter(adapter);		
	
	}
     
	class MyAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			int a =0;
			if(flag){
				a =list.size();
			}else{
				a=list1.size();
			}
			return a;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		 @SuppressLint("ViewHolder") @Override
		public View getView(final int position, View convertView, ViewGroup parent) {

			Holder holder = null;
			if (convertView == null) {
				convertView = LayoutInflater.from(getApplicationContext())
						.inflate(R.layout.item_main2, null);
				holder = new Holder();
				holder.button1 = (Button) convertView
						.findViewById(R.id.mBtmainItem1);
				convertView.setTag(holder);

			} else {
				holder = (Holder) convertView.getTag();
			}
			if(flag){
			holder.button1.setText(list.get(position).getNameZh());
            holder.button1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					Intent intent=new Intent(MainActivityP.this,PlayActivity.class);
					intent.putExtra("name", list.get(position).getNameZh());
					ArrayList<String> urls =new ArrayList<String>();
					urls.add( list.get(position).getUrl());
					intent.putStringArrayListExtra("url", urls);
					startActivity(intent);
                  
				}
			});
			}else{
				holder.button1.setText(list1.get(position).getNameZh());
	            holder.button1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						
						Intent intent=new Intent(MainActivityP.this,PlayActivity.class);
						intent.putExtra("name", list1.get(position).getNameZh());
						ArrayList<String> urls =new ArrayList<String>();
						urls.add( list1.get(position).getUrl());
						intent.putStringArrayListExtra("url", urls);

						intent.putExtra("url",urls);
						startActivity(intent);

					}
				});

			}
			return convertView;

			
		}
		
	}
	class Holder {
		Button button1;
	}

	OnClickListener listener =new OnClickListener() {
		
		@Override
		public void onClick(View v) {
		switch (v.getId()) {
		case R.id.mBtmain1:
			flag= true;
			adapter.notifyDataSetChanged();
			
			break;
		case R.id.mBtmain2:
			flag =false;
			adapter.notifyDataSetChanged();

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
