#include<stdio.h>
#include<stdlib.h>
#include<jni.h>

// jstring表示String，可以在jni.h中找到
// JNIEnv* env：二级指针，java运行环境的指针，内存地址，虚拟机的内存地址	jobject this：调用这个方法的对象-MainActivity
jstring Java_com_exampl_jni_MainActivity_helloFromC(JNIEnv* env, jobject this) {
	// C语言的字符串
	char* cstr = "hello from c";
	// 把C语言的字符串转化成java的字符串
	jstring jstr = (*env)->NewStringUTF(env, cstr);
	return jstr;
}
