package com.example.logisticele;

import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    public abstract Object instantiateItem(ViewGroup container, int position);

    public abstract int getCount();

    public abstract boolean isViewFromObject(View view, Object obj);

    public abstract void destroyItem(ViewGroup container, int position, Object object);
}
