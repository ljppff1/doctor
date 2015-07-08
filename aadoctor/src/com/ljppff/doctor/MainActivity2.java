package com.ljppff.doctor;

import java.util.ArrayList;
import java.util.List;

import com.ljppff.doctor.MainActivity1.Holder;
import com.ljppff.doctor.util.AppManager;
import com.ljppff.doctor.util.Info;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import com.webdesign688.hksla.R;


public class MainActivity2 extends BaseActivity {

    private Button mBtmain2;
	private Button mBtmain1;
    private List<Info> list =new ArrayList<Info>();    
	private String[] strname =new String[]{"√Ê…´…n∞◊","∂˙¯Q","“äŒÔº˛“∆Ñ”","±«˜˝","∞cØà","ªËÿ ","ªË√‘","ïû—£","÷– Ó","ø‡ù≠Œ∂","ÕÃá≤¿ßÎy","¥Ú‡√"," ≥ëj≤ª’Ò","áf–ƒ","Ωπë]"
			,"–ÿêû","“÷Ùd÷¢","÷–∂æ","îU…¢","◊‘ö¢ÉAœÚ","Œ∏ö‚√õ","∏π«ªπæá£¬ï","º°»‚≥ÈΩÓ","¬ÈØw","ƒÚÓl"
			,"±„√ÿ","–‘üoƒ‹","√ìæ ","»›“◊»´…Ìüo¡¶","ª√”X"};
	private String[] strnameu =new String[]{
			"Pale face","Ringing in my ears","See things moving","Snore","Paralysis",
			"Black Out","Coma","Dizzy","Heatstroke","Biter taste on my tongue",
			"Difficulty in swallowing","Hiccup","Lost of appetite","Nausea","Anxiety",
			"Chest feels tight","Depression","Poisoning","Radiating","Suicidal tendency",
			"Bloated","Gurgling sound in my abdomen","Muscle spasm","Numb","Urinate frequently",
			"Constipation","Impotence","Dislocation","Fatigues easily","Hallucination"};
	private String[] strurl =new String[] {
			   
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
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        initData();
        initView();
        
        
        
        
        
        
    }




	private void initData() {
		for(int i=1;i<=30;i++){
			if(i%2==1){
				Info info =new Info();
				info.setNameZh(strname[(i+1)/2-1]);
				info.setNameUS(strnameu[(i+1)/2-1]);
				info.setUrl(strurl[(i+1)/2-1]);
				list.add(info);
			}else{
				Info info =new Info();
				info.setNameZh(strname[(i+1)/2+14]);
				info.setNameUS(strnameu[(i+1)/2+14]);
				info.setUrl(strurl[(i+1)/2+14]);
				list.add(info);
			}
			
		}
		
	}




	private void initView() {
		mLvmain1 =(GridView)this.findViewById(R.id.mLvmain1);
	       mLvmain1.setAdapter(new MyAdapter());		
	       mBtmain1Bottom =(Button)this.findViewById(R.id.mBtmain1Bottom);
	       mBtmain1Bottom.setOnClickListener(listener);
/*		mLvmain1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent=new Intent();
				intent.putExtra("name", list.get(position).getNameZh());
				intent.putExtra("url", list.get(position).getUrl());
				startActivity(new Intent(MainActivity2.this, PlayActivity.class));

				
			}
		});
*/	}
     
	class MyAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
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
				holder.button1.setText(list.get(position).getNameZh());
                holder.button1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent intent=new Intent(MainActivity2.this, PlayActivity1.class);
						intent.putExtra("name", list.get(position).getNameZh());
						ArrayList<String> urls =new ArrayList<String>();
						urls.add( list.get(position).getUrl());
						intent.putStringArrayListExtra("url", urls);
						startActivity(intent);

					}
				});
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
		case R.id.mBtmain1Bottom:
			AppManager.getAppManager().finishActivity();
			break;

		default:
			break;
		}
			
		}
	};

}
