package com.jsbd.vr.bean;

/**
* @ClassName: CarSeatControlBean
* @Description: TODO(这里主要用来存储车)
* @author suochao
* @date 2018年6月28日
*
*/
public class CarSeatControlBean {
	private static CarSeatControlBean self;
	private int num1 = 0x50;
	private int num2 = 0x01;
	private int num3 = 0xFF;
	private int leftSeatAirControl = 0xFF;// 1，2，3 通风等级
	private int rightSeatAirControl = 0xFF;// 1，2，3 通风等级
	private int leftSeatHeat = 0xFF;// 1，2，3 加热等级
	private int rightSeatHeat = 0xFF;// 1，2，3 加热等级
	private int num8 = 0xFF;
	private int num9 = 0x02;// 表示语音控制 0x01按键控制
	private int whitchSeat = 0x01;// 1左座椅，2右座椅
	private int num11 = 0xFF;//
	
	
	public static CarSeatControlBean getSelf() {
		return self;
	}


	public static void setSelf(CarSeatControlBean self) {
		CarSeatControlBean.self = self;
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


	public int getNum3() {
		return num3;
	}


	public void setNum3(int num3) {
		this.num3 = num3;
	}


	public int getLeftSeatAirControl() {
		return leftSeatAirControl;
	}


	public void setLeftSeatAirControl(int leftSeatAirControl) {
		this.leftSeatAirControl = leftSeatAirControl;
	}


	public int getRightSeatAirControl() {
		return rightSeatAirControl;
	}


	public void setRightSeatAirControl(int rightSeatAirControl) {
		this.rightSeatAirControl = rightSeatAirControl;
	}


	public int getLeftSeatHeat() {
		return leftSeatHeat;
	}


	public void setLeftSeatHeat(int leftSeatHeat) {
		this.leftSeatHeat = leftSeatHeat;
	}


	public int getRightSeatHeat() {
		return rightSeatHeat;
	}


	public void setRightSeatHeat(int rightSeatHeat) {
		this.rightSeatHeat = rightSeatHeat;
	}


	public int getNum8() {
		return num8;
	}


	public void setNum8(int num8) {
		this.num8 = num8;
	}


	public int getNum9() {
		return num9;
	}


	public void setNum9(int num9) {
		this.num9 = num9;
	}


	public int getWhitchSeat() {
		return whitchSeat;
	}


	public void setWhitchSeat(int whitchSeat) {
		this.whitchSeat = whitchSeat;
	}


	public int getNum11() {
		return num11;
	}


	public void setNum11(int num11) {
		this.num11 = num11;
	}


	public static synchronized CarSeatControlBean getSeatControlBean(){
		if(self==null){
			self = new CarSeatControlBean();
		}else{
			self.init();
		}
		return self;
	}


	private void init() {
		num1 = 0x50;
		num2 = 0x01;
		num3 = 0xFF;
		leftSeatAirControl = 0xFF;// 1，2，3 通风等级
		rightSeatAirControl = 0xFF;// 1，2，3 通风等级
		leftSeatHeat = 0xFF;// 1，2，3 加热等级
		rightSeatHeat = 0xFF;// 1，2，3 加热等级
		num8 = 0xFF;
		num9 = 0x02;// 表示语音控制 0x01按键控制
		whitchSeat = 0x01;// 1左座椅，2右座椅
		num11 = 0xFF;//
	}
}
