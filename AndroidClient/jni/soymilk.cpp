#include <jni.h>
#include <unistd.h>
#include <Logger.h>

#include <../../src/soymilk.h>

#define TAG "Soymilk/Soymilk"

#ifdef __cplusplus
extern "C"
{
#endif

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* jvm, void* reserver)
{
	JNIEnv *env;

	if(jvm->GetEnv((void**)&env, JNI_VERSION_1_4) != JNI_OK){
		LOGE(TAG, "JNI Check failure");
		return JNI_ERR;
	}

	return JNI_VERSION_1_4;
}

JNIEXPORT jboolean JNICALL Java_com_ytstudio_soymilk_SplashScreen_NativeInitialize(JNIEnv *env, jobject obj)
{
    // sleep(10000);
    return Soymilk_Initialize();
}

#ifdef __cplusplus
}
#endif
