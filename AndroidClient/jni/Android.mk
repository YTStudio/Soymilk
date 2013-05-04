LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

SOYMILK_LIB := ../../src

LOCAL_MODULE := soymilk
LOCAL_C_INCLUDES := $(SOYMILK_LIB)
LOCAL_SRC_FILES := soymilk.cpp
LOCAL_SRC_FILES += $(SOYMILK_LIB)/SplashScreen.cpp

LOCAL_LDLIBS := 
LOCAL_LDLIBS += -llog

include $(BUILD_SHARED_LIBRARY)
