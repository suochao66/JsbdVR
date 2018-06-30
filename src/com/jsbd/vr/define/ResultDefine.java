package com.jsbd.vr.define;

public class ResultDefine {
	public static class  Status{
		/**
		 * 表示不支持语音控制
		 */
		public static final int DISABLE = 3;
		/**
		 * 执行动作与当前状态相同
		 */
		public static final int SAME = 1;
		/**
		 * 执行动作与当前状态不相同
		 */
		public static final int DIFF = 2;
		/**
		 * 通常表示拿不到当前状态,状态无效
		 */
		public static final int IDLE = 0;
		/**
		 * 通常表示后加自定义语句，语音要播报
		 */
		public static final int MSSAGE = 4;
		
	}
}
