package com.exampl.jni;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	static {
		// ���ش���õ�so��⣬�������Hello.c�ж���
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
	
	// ����һ�����ط�������������C����ʵ��
	public native String helloFromC();

}
