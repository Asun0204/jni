#include<stdio.h>
#include<stdlib.h>
#include<jni.h>

// jstring��ʾString��������jni.h���ҵ�
// JNIEnv* env������ָ�룬java���л�����ָ�룬�ڴ��ַ����������ڴ��ַ	jobject this��������������Ķ���-MainActivity
jstring Java_com_exampl_jni_MainActivity_helloFromC(JNIEnv* env, jobject this) {
	// C���Ե��ַ���
	char* cstr = "hello from c";
	// ��C���Ե��ַ���ת����java���ַ���
	jstring jstr = (*env)->NewStringUTF(env, cstr);
	return jstr;
}
