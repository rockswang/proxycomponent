package com.cellcom;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.roxstudio.proxycomponent.Proxied;

//网络视图控件
public class GridViewActivity extends Proxied<Activity> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_view);
		setTitle("网络视图控件GridView！");
		
		GridView gridView=(GridView)findViewById(R.id.grid_view);
		gridView.setAdapter(new ImageAdapter(this.asActivity()));
		
	}
	
	public class ImageAdapter extends BaseAdapter{

		private Context mContext;
		public ImageAdapter(Context context){
			mContext=context;
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mImageIds.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView;
			if(convertView==null){
				imageView=new ImageView(mContext);
				imageView.setLayoutParams(new GridView.LayoutParams(85,85));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(8, 8, 8, 8);
			}else{
				imageView=(ImageView)convertView;
			}
			imageView.setImageResource(mImageIds[position]);
			return imageView;
		}
		
	}
	
	
	
	private Integer[] mImageIds = {
            R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,R.drawable.sample_8,
            R.drawable.sample_9,R.drawable.sample_10,R.drawable.sample_11};

}
