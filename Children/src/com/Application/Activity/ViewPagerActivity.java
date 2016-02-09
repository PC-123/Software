package com.Application.Activity;

import java.util.ArrayList;
import java.util.List;

import com.Application.Adapter.FraPagetAdapter;
import com.Application.children.R;
import com.Application.fragment.FragmentViewPager1;
import com.Application.fragment.FragmentViewPager2;
import com.Application.fragment.FragmentViewPager3;
import com.Application.fragment.FragmentViewPager4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class ViewPagerActivity extends FragmentActivity {


	private ViewPager viewpager;
	private List<Fragment>viewlist;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_pager);
		viewlist=new ArrayList<Fragment>();
		viewlist.add(new FragmentViewPager1());
		viewlist.add(new FragmentViewPager2());
		viewlist.add(new FragmentViewPager3());
		viewlist.add(new FragmentViewPager4());
		FraPagetAdapter adapter=new FraPagetAdapter(getSupportFragmentManager(), viewlist);
		viewpager=(ViewPager)findViewById(R.id.viewpager1);
		viewpager.setAdapter(adapter);
			
		
}
}