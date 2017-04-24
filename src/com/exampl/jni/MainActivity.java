package com.exampl.jni;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	static {
		// 加载打包好的so类库，类库名在Hello.c中定义
		System.loadLibrary("hello");
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	
	public void click(View view) {
		Toast.makeText(this, helloFromC(), Toast.LENGTH_LONG).show();
	}
	
	// 定义一个本地方法，方法体由C语言实现
	public native String helloFromC();

}
