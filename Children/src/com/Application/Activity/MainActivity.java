package com.Application.Activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Application.children.R;
import com.Application.fragment.MainFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public  class MainActivity extends MainLayout{



	@Override
	protected Fragment createfragment1() {
		// TODO Auto-generated method stub
		return new MainFragment();
	}

	@Override
	protected Fragment createfragment2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Fragment createfragment3() {
		// TODO Auto-generated method stub
		return null;
	}

	


	
}
