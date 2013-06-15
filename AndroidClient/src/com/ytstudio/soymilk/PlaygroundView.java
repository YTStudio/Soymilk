package com.ytstudio.soymilk;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

import android.content.Context;
import android.graphics.PixelFormat;
import android.opengl.GLSurfaceView;

public class PlaygroundView extends GLSurfaceView {

	private static String TAG = "PlaygroundView";
	public PlaygroundView(Context context) {
		super(context);
		init(false, 0, 0);
	}
	
	private void init(boolean translucent, int depth, int stencil) 
	{
		if (translucent) {
			this.getHolder().setFormat(PixelFormat.TRANSLUCENT);
		}
		
		this.setEGLContextFactory(new PlaygroundContextFactory());
	}
	
	private class PlaygroundContextFactory implements GLSurfaceView.EGLContextFactory {

		private int EGL_CONTENT_CLIENT_VERSION = 0x3098;
		
		@Override
		public EGLContext createContext(EGL10 egl, EGLDisplay display,
				EGLConfig eglConfig) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void destroyContext(EGL10 egl, EGLDisplay display,
				EGLContext context) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
