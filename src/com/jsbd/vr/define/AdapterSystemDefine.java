package com.jsbd.vr.define;

public class AdapterSystemDefine {
	public static final String VERSION = "20180621v1.0";
	public static class ActionDo{
		/**
		 * 打断语音，比如当前在识别或者在语音任何交互时，让语音打断并退出界面
		 */
		public final static int VR_BREAK = 0;
		/**
		 * 打断语音同时，释放麦克风
		 */
		public final static int VR_MIC_RELEASED= 1;
		/**
		 * 恢复语音唤醒
		 */
		public final static int VR_REGAIN_AWAKE = 2;
		
		/**
		 * 语音唤醒
		 */
		public final static int VR_AWAKE = 3;
		
		
	}
	public static class VRStatus{
		/**
		 * 申请音频焦点
		 */
		public final static int AUDIOFOCUS_REQUEST = 0;
		/**
		 * 释放音频焦点
		 */
		public final static int AUDIOFOCUS_RELEASED = 1;
	}
	public static class FloatViewStatus{
		/**
		 * 显示图标
		 */
		public final static int SHOW = 1;
		
		/**
		 * 关闭图标
		 */
		public final static int CLOSE = 0;
		
	}
	
	public static class VREnable{
		/**
		 * 可以语音
		 */
		public final static int ENABLE = 1;
		
		/**
		 * 不可以语音
		 */
		public final static int UNENABLE = 0;
		
	}
}
