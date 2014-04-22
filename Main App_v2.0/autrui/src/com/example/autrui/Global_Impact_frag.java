package com.example.autrui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */

public class Global_Impact_frag extends Fragment implements OnClickListener {

	Intent intent = new Intent();
	public Global_Impact_frag() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.global_impact_frag,
				container, false);
	}
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);

		
		Button globalImpactView = (Button) getActivity().findViewById(R.id.bglobalImpactView);
		globalImpactView.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int ides=v.getId();
		if(ides==R.id.bglobalImpactView)
		{
			intent = new Intent(v.getContext(), GlobalImpactWebView.class);
			startActivityForResult(intent, 0);
		}
	}

}
