package com.ljppff.doctor.util;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

public class Util {
	public static final boolean DBG_H = true;
	private static final String TAG = "Utils";
	public static void logh(String tag, String msg) {
		if(DBG_H) 
			if(!TextUtils.isEmpty(msg))
			Log.d(tag, msg);
	}
	
    public static boolean isEmpty(CharSequence str) {
        if (str == null || str.length() == 0||str.equals("null"))
            return true;
        else
            return false;
    }
    /** 
     * �ж��Ƿ�Ϊƽ�� ͨ���ֱ���
     *  
     * @return 
     */  
    public static boolean isPad(Context context) {  
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);  
        Display display = wm.getDefaultDisplay();  
        // ��Ļ���  
        float screenWidth = display.getWidth();  
        // ��Ļ�߶�  
        float screenHeight = display.getHeight();  
        DisplayMetrics dm = new DisplayMetrics();  
        display.getMetrics(dm);  
        double x = Math.pow(dm.widthPixels / dm.xdpi, 2);  
        double y = Math.pow(dm.heightPixels / dm.ydpi, 2);  
        // ��Ļ�ߴ�  
        double screenInches = Math.sqrt(x + y);  
        // ����6�ߴ���ΪPad  
        if (screenInches >= 6.0) {  
            return true;  
        }  
        return false;  
    }
    public static boolean isTabletDevice(Context mContext) {
    	boolean flag =false;
        TelephonyManager telephony = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);
        int type = telephony.getPhoneType();
        if (type == TelephonyManager.PHONE_TYPE_NONE) {
           // Log.i("is Tablet!");
        	flag =true;
        } else {
        	// Log.i("is phone!");
        	 flag =false;
        }
        return flag;
    }
}
