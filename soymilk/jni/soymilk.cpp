#include <jni.h>
#include <Logger.h>

extern "C"
{

JNIEXPORT void JNICALL Java_com_ytstudio_soymilk_SplashScreen_NativeInitialize(JNIEnv *env, jobject obj)
{
   LOGI("SplashScreen", "Testing");
   LOGI("SplashScreen", "Testing twice");
}

}
