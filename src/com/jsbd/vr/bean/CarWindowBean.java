package com.jsbd.vr.bean;

public class CarWindowBean {
	/**
	 * �촰״̬����
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
		 * ��Чλ��
		 */
		public static final int IDLE = 0;
		/**
		 * ��ȫ�ر�λ��
		 */
		public static final int CLOSE = 1;
		/**
		 * ��ȫ��λ��
		 */
		public static final int OPEN = 2;
		/**
		 * �������
		 */
		public static final int UNWARPPING = 3;
		/**
		 * ��ȫ����
		 */
		public final int UNWARPPED = 4;
		/**
		 * ����ر���λ��
		 */
		public static final int UNWARPCLOSING = 0;
		/**
		 * ����λ��
		 */
		public static final int COMFORT = 0;
	}
	
}
