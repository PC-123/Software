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
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class FragmentViewPager1 extends Fragment implements OnClickListener{
	private ViewPager viewpager;
	private ImageButton imagebutton1,imagebutton2,imagebutton3
	,imagebutton4,imagebutton5,imagebutton6
	,imagebutton7,imagebutton8,imagebutton9;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.v("key", "点状已经发股份大概看了就分开国际妇fdgagkjkljfdkgjdkgjkfgjgfjgkg科");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-genera ted method stub
		Log.v("key", "点状已经发股份大概看了就分开国际妇科");
		View view=inflater.inflate(R.layout.activity_view_pager1,container,false);
		viewpager=(ViewPager)view.findViewById(R.id.viewpager1);
		viewpager.setBackgroundResource(R.drawable.icon1);
		imagebutton1=(ImageButton)view.findViewById(R.id.ImageButton1);
		imagebutton2=(ImageButton)view.findViewById(R.id.ImageButton2);
		imagebutton3=(ImageButton)view.findViewById(R.id.ImageButton3);
		imagebutton4=(ImageButton)view.findViewById(R.id.ImageButton4);
		imagebutton5=(ImageButton)view.findViewById(R.id.ImageButton5);
		imagebutton6=(ImageButton)view.findViewById(R.id.ImageButton6);
		imagebutton7=(ImageButton)view.findViewById(R.id.ImageButton7);
		imagebutton8=(ImageButton)view.findViewById(R.id.ImageButton8);
		imagebutton9=(ImageButton)view.findViewById(R.id.ImageButton9);
		imagebutton1.setOnClickListener(this);
		imagebutton2.setOnClickListener(this);
		imagebutton3.setOnClickListener(this);
		imagebutton4.setOnClickListener(this);
		imagebutton5.setOnClickListener(this);
		imagebutton6.setOnClickListener(this);
		imagebutton7.setOnClickListener(this);
		imagebutton8.setOnClickListener(this);
		imagebutton9.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.ImageButton1:
			Toast.makeText(getActivity(), "你点中第一个",Toast.LENGTH_SHORT).show();
			break;
		case R.id.ImageButton2:
			Toast.makeText(getActivity(), "你点中第2个",Toast.LENGTH_SHORT).show();
			break;
		case R.id.ImageButton3:
			Toast.makeText(getActivity(), "你点中第3个",Toast.LENGTH_SHORT).show();
			break;
		case R.id.ImageButton4:
			Toast.makeText(getActivity(), "你点中第4个",Toast.LENGTH_SHORT).show();
			break;
		case R.id.ImageButton5:
			Toast.makeText(getActivity(), "你点中第5个",Toast.LENGTH_SHORT).show();
			break;
		case R.id.ImageButton6:
			Toast.makeText(getActivity(), "你点中第6个",Toast.LENGTH_SHORT).show();
			break;
		case R.id.ImageButton7:
			Toast.makeText(getActivity(), "你点中第7个",Toast.LENGTH_SHORT).show();
			break;
		case R.id.ImageButton8:
			Toast.makeText(getActivity(), "你点中第8个",Toast.LENGTH_SHORT).show();
			break;
		case R.id.ImageButton9:
			Toast.makeText(getActivity(), "你点中第9个",Toast.LENGTH_SHORT).show();
			break;
		}
	}

	
	

	
}
