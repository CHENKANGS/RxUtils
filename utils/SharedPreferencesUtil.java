package com.lanzhong.insuranceclaim.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * 
 * Copyright © 2015 蓝色互动. All rights reserved.
 * 
 * @Title :SharedPreferencesUtil.java
 * @Prject :YingWangTechnology
 * @Package com.bm.yingwang.utils
 * @Description : SharedPreferencesUtil工具类
 * @author : zhangbin
 * @date 2015-1-26
 * @version : 1.0
 */
public class SharedPreferencesUtil {

	private Editor editor;
	private SharedPreferences sp;

	public SharedPreferencesUtil(Context context, String sharedName) {

		sp = context.getSharedPreferences(sharedName, Context.MODE_PRIVATE);
		editor = sp.edit();
	}

	/**
	 * 保存一个字符串
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean saveString(String key, String value) {
		try {
			editor.putString(key, value);
			return editor.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 获得一个字符串
	 * 
	 * @param key
	 * @return
	 */
	public String getStringByKey(String key) {
		try {
			return sp.getString(key, "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 清空当前的SharedPreferences
	 * @author ZhuFan
	 * @Package com.bm.jinzaitong.utils 
	 * @return void
	 * @throws 
	 * @Date 2015-3-11 下午5:26:16
	 */
	public void clear() {
		sp.edit().clear().commit();
	}

}
