package com.ljppff.doctor.util;

import java.util.Stack;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;


public class AppManager {

	private static Stack<Activity> activityStack;
	private static AppManager instance;

	private AppManager() {
	}

	/**
	 * 单一实例
	 */
	public static AppManager getAppManager() {
		if (instance == null) {
			instance = new AppManager();
		}
		return instance;
	}
	
	public static boolean isAppmanager(){
		boolean flag =false;
		if(instance==null){
			flag =true;
		}
		return flag;
	}

	/**
	 * 添加Activity到堆栈
	 */
	public void addActivity(Activity activity) {
		if (activityStack == null) {
			activityStack = new Stack<Activity>();
		}
		activityStack.add(activity);
		Util.logh("AppManager", "addActivity:"+activityStack.toString());
	}

	/**
	 * 获取当前Activity（堆栈中最后一个压入的）
	 */
	public Activity currentActivity() {
		Activity activity = activityStack.lastElement();
		return activity;
	}

	/**
	 * 结束当前Activity（堆栈中最后一个压入的）
	 */
	public void finishActivity() {
		Activity activity = activityStack.lastElement();
		finishActivity(activity);
		Util.logh("AppManager", "finishActivity:"+activity.toString());
	}
	public boolean hasActivity(Class<?> cls){
	   boolean flag =false;
		if(activityStack!=null){
		for (Activity activity : activityStack) {
			if (activity.getClass().equals(cls)) {
				flag =true;
			}
		}
		}
     return flag;
	}
	public void finishActivityJob4() {
		for(int i=0;i<2;i++){
		Activity activity = activityStack.lastElement();
		finishActivity(activity);
		Util.logh("AppManager", "finishActivity:"+activity.toString());
		}
	}
	public void finishActivityJob3() {
		for(int i=0;i<3;i++){
		Activity activity = activityStack.lastElement();
		finishActivity(activity);
		Util.logh("AppManager", "finishActivity:"+activity.toString());
		}
	}
	public void finishActivity5() {
		for(int i=0;i<4;i++){
		Activity activity = activityStack.lastElement();
		
		finishActivity(activity);
		Util.logh("AppManager", "finishActivity:"+activity.toString());
		}
	}


	/**
	 * 结束当前Activity（堆栈中最后一个压入的）
	 */

	/**
	 * 结束指定的Activity
	 */
	public void finishActivity(Activity activity) {
		if (activity != null) {
			activityStack.remove(activity);
			activity.finish();
			activity = null;
		}
	}

	/**
	 * 结束指定类名的Activityn
	 */
	public void finishActivity(Class<?> cls) {
		if(activityStack!=null){
		for (Activity activity : activityStack) {
			if (activity.getClass().equals(cls)) {
				finishActivity(activity);
			}
		}
		}
	}
	

	/**
	 * 结束所有Activity
	 */
	public void finishAllActivity() {
		if(activityStack!=null){
		for (int i = 0, size = activityStack.size(); i < size; i++) {
			if (null != activityStack.get(i)) {
				activityStack.get(i).finish();
			}
		}
		activityStack.clear();
		activityStack=null;
		}
	}

	/**
	 * 退出应用程序
	 */
	public void AppExit(Context context) {
		try {
			finishAllActivity();
			ActivityManager activityMgr = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
			activityMgr.restartPackage(context.getPackageName());
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
