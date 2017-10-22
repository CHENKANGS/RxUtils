package com.lanzhong.insuranceclaim.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ExpandableListView;

/**
 * @Class
 * @Description (实现的主要功能)
 * @Date Administratoron 2015/10/15 16:31
 * @Upate 修改者:;修改日期:;修改内容:.
 */
public class MyExpdListview extends ExpandableListView{


    public MyExpdListview(Context context) {
        super(context);
    }

    public MyExpdListview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyExpdListview(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    /**
     * 重写该方法，达到使ListView适应ScrollView的效果
     *
     */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

//        public MyExpdListview(Context context, AttributeSet attrs) {
//            super(context, attrs);
//            // TODO Auto-generated constructor stub
//        }
//
//        @Override
//        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//            // TODO Auto-generated method stub
//            int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
//
//                    MeasureSpec.AT_MOST);
//
//            super.onMeasure(widthMeasureSpec, expandSpec);
//        }

}
