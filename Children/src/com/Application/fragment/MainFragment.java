package com.Application.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Application.Activity.ViewPagerActivity;
import com.Application.children.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class MainFragment extends Fragment implements OnItemClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.main_activity1, container, false);
		gridview=(GridView)view.findViewById(R.id.gridView0);
		list=new ArrayList<Map<String,Object>>();
		simple=new SimpleAdapter(getActivity(), getdata(), R.layout.activity_main, new String[]{"icon","iconname"}, new int[]{R.id.imageview1,R.id.textview1});
		gridview.setAdapter(simple);
		gridview.setOnItemClickListener(this);
		return view;
	}
	private List<Map<String,Object>> getdata() {
		// TODO Auto-generated method stub
		for(int i=0;i<icon.length;i++)
		{
			Map<String,Object>map=new HashMap<String, Object>();
			map.put("icon",icon[i]);
			map.put("iconname", iconname[i]);
			list.add(map);
		}
		return list;
	}
	private List<Map<String,Object>>list;
	private SimpleAdapter simple;
	private GridView gridview;
	String []iconname=new String[]{"家具类","电器类","水果类","饮食类","动物类","植物类"};
	int[]icon=new int[]{R.drawable.ico1,R.drawable.ico2,R.drawable.ico3,R.drawable.ico3,R.drawable.ico3,R.drawable.ico3};
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(getActivity(), ViewPagerActivity.class);
		startActivity(intent);
	}

}
