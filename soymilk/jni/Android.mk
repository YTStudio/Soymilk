LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := soymilk
LOCAL_SRC_FILES := soymilk.cpp

LOCAL_LDLIBS := 
LOCAL_LDLIBS += -llog

include $(BUILD_SHARED_LIBRARY)
