package com.Application.fragment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Application.children.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class FragmentViewPager4 extends Fragment {
	private ViewPager viewpager;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.v("key", "��״�Ѿ����ɷݴ�ſ��˾ͷֿ����ʸ�fdgagkjkljfdkgjdkgjkfgjgfjgkg��");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-genera ted method stub
		Log.v("key", "��״�Ѿ����ɷݴ�ſ��˾ͷֿ����ʸ���");
		View view=inflater.inflate(R.layout.activity_view_pager4,container,false);
		return view;
	}

	
	

	
}
