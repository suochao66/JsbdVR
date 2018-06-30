package com.jsbd.vr.bean;

public class CarWindowBean {
	/**
	 * 天窗状态数据
	 */
	private int sunRoof;

	public int getSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(int sunRoofdata) {
		
		this.sunRoof = (sunRoofdata&0x0F);
	}
	
	public boolean sunRoofCloseOFF(){
		return  (this.sunRoof == SunRoofPositionDef.OPEN);	
	}
	
	public static class SunRoofPositionDef{
		/**
		 * 无效位置
		 */
		public static final int IDLE = 0;
		/**
		 * 完全关闭位置
		 */
		public static final int CLOSE = 1;
		/**
		 * 完全打开位置
		 */
		public static final int OPEN = 2;
		/**
		 * 翘起打开中
		 */
		public static final int UNWARPPING = 3;
		/**
		 * 完全翘起
		 */
		public final int UNWARPPED = 4;
		/**
		 * 翘起关闭中位置
		 */
		public static final int UNWARPCLOSING = 0;
		/**
		 * 舒适位置
		 */
		public static final int COMFORT = 0;
	}
	
}
