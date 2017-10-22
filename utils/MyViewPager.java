/**
 * @Author 尹银川(yinyc@p2m.com.cn) 
 * @date 2015-5-28 下午1:08:02
 * @Class MyViewPager
 */
package com.lanzhong.insuranceclaim.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @Description 主界面的ViewPage
 * @date 2015-6-18 上午10:50:58
 * @Class cn.com.p2m.mornstar.jtjy.view.MyViewPager
 * @Author
 *
 */
public class MyViewPager extends ViewPager {

	private Context context;
	// 是否滑动 ;默认启动
	private boolean scrollble = true;

	public MyViewPager(Context context) {
		super(context);
		this.context = context;
	}

	public MyViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
	}

	@Override
	public boolean onTouchEvent(MotionEvent arg0) {
		if (scrollble) {
			return super.onTouchEvent(arg0);
		} else {
			return false;
		}
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent arg0) {
		if (scrollble) {
			return super.onInterceptTouchEvent(arg0);
		} else {
			return false;
		}

	}

	public boolean isScrollble() {
		return scrollble;
	}

	public void setScrollble(boolean scrollble) {
		this.scrollble = scrollble;
	}

	@Override
	public void setCurrentItem(int item, boolean smoothScroll) {
		super.setCurrentItem(item, smoothScroll);
	}

	@Override
	public void setCurrentItem(int item) {
		super.setCurrentItem(item, false);
	}



}
