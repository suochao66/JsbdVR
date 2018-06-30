package com.jsbd.vr.bean;

public class CarWindowControlBean {
	private static CarWindowControlBean self;
	private int num1 = 0x17;
	private int num2 = 0x01;
	private int airWindow = 0x00; // 天窗状态 2开，3关
	

	public static CarWindowControlBean getSelf() {
		return self;
	}


	public static void setSelf(CarWindowControlBean self) {
		CarWindowControlBean.self = self;
	}


	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}


	public int getAirWindow() {
		return airWindow;
	}


	public void setAirWindow(int airWindow) {
		this.airWindow = airWindow;
	}


	public static synchronized CarWindowControlBean getCarWindowControlBean(){
		if(self==null){
			self = new CarWindowControlBean();
		}else{
			self.init();
		}
		return self;
	}


	private void init() {
		num1 = 0x50;
		num2 = 0x01;
		airWindow = 0x00; // 天窗状态 2开，3关
	}
	public class Def{
		public static final int SUNROOF_ON = 2;
		public static final int SUNROOF_OFF = 3;
		
	}
}
