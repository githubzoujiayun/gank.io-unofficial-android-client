package com.hotbitmapgg.studyproject.hcc.base;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Tips:
 * 这里没有使用V4包下的Fragment 使用了V13下的Fragment
 * 都是可以向下兼容的
 */
public abstract class LazyFragment extends Fragment
{

    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        rootView = inflater.inflate(getLayoutId(), container, false);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {

        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        initViews();
    }

    @Override
    public void onDetach()
    {

        super.onDetach();
    }

    public abstract int getLayoutId();

    public abstract void initViews();
}
