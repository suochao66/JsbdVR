package com.jsbd.vr.bean;

public class CarAirDataBean {
	/**
	 * 空调数据
	 */
	private byte[] mucData;
	
	/**
	 * 前排空调风速
	 */
	private int fanSpeed;
	/**
	 * 左温度
	 */
	private int leftTemp;
	/**
	 * 右温度
	 */
	private int rightTemp;
	/**
	 * 车内温度
	 */
	private int inCarTemp;
	/**
	 * 后排空调温度
	 */
	private int rearAirTemp;
	/**
	 * 后排空调风速
	 */
	private int rearAirFanSpeed;
	/**
	 * 加热等级
	 */
	private int seatHotLevel;
	/**
	 * 座椅通风等级
	 */
	private int seatFanLevel;
	
	/**
	 * 空调当前吹风模式
	 */
	private int airFanModel;
	
	/**
	 * 空调是否打开
	 */
	private boolean isAirOn;
	
	public int getLeftTemp() {
		return leftTemp;
	}

	public void setLeftTemp(int leftTemp) {
		this.leftTemp = leftTemp;
	}

	public int getRightTemp() {
		return rightTemp;
	}

	public void setRightTemp(int rightTemp) {
		this.rightTemp = rightTemp;
	}

	public int getInCarTemp() {
		return inCarTemp;
	}

	public void setInCarTemp(int inCarTemp) {
		this.inCarTemp = inCarTemp;
	}

	public int getRearAirTemp() {
		return rearAirTemp;
	}

	public void setRearAirTemp(int rearAirTemp) {
		this.rearAirTemp = rearAirTemp;
	}

	public int getRearAirFanSpeed() {
		return rearAirFanSpeed;
	}

	public void setRearAirFanSpeed(int rearAirFanSpeed) {
		this.rearAirFanSpeed = rearAirFanSpeed;
	}

	public void setFanSpeed(int fanSpeed) {
		this.fanSpeed = fanSpeed;
	}


	public byte[] getMucData() {
		return mucData;
	}


	//空调
	/*if (CarInfor.carAirStatus != null) {
		
		// CarInfor.carAirStatus.setFanSpeed(fanSpeed);
		// CarInfor.carAirStatus.getTemperature(fanSpeed);
		int fanspeed = data[7];// 右边四位 风速 0-7 0:不显示 8:风速自动，左边四位 风向
		
		// int temperature = data[12];
		int lefttemp = data[8];// 左温度
		int righttemp = data[9];// 右温度
		int intemp = data[12];// 车内温度
		Log.e("srcanair", "mcu to voice airstatu:fanspeed,lefttemp,righttemp,intemp:"
				+ Integer.toBinaryString(fanspeed) + "," + lefttemp + "," + righttemp + "," + intemp);
		CarInfor.carAirStatus.setFan(fanspeed);
		CarInfor.carAirStatus.setAcModeFlagData(data[6] & 0xFF);
		Log.d("vair", data[6] + ";");
		if (Constant.projecId == Constant.PROJECT_ID.ZT_B11A_C) {
			// 该项目取的车内温度
			CarInfor.carAirStatus.setLeftTemperature(intemp);
			CarInfor.carAirStatus.setRightTemperature(intemp);
			
		} else if (Constant.projecId == Constant.PROJECT_ID.ZT_B11B
				|| Constant.projecId == Constant.PROJECT_ID.ZT_B11F
				|| Constant.projecId == Constant.PROJECT_ID.ZT_B11F_IMAX6) {
			//CarInfor.carAirStatus.setLeftTemperature(lefttemp);
			//	CarInfor.carAirStatus.setRightTemperature(righttemp);
			
		} else if (Constant.projecId == Constant.PROJECT_ID.ZT_B11C) {
			int aftertemp = data[18];// 后排温度
			int aftertfanspeed = data[19];// 后驱空调，吹风模式和风速Bit3-Bit0位风速
			//CarInfor.carAirStatus.setLeftTemperature(lefttemp);
			//CarInfor.carAirStatus.setRightTemperature(righttemp);
			//	CarInfor.carAirStatus.setAfterTemperature(aftertemp);
			//CarInfor.carAirStatus.setAfterfan(aftertfanspeed);
		}
	}*/
	public void setMucData(byte[] data) {
		if(data.length<7){return;}
		this.mucData = data;
		this.fanSpeed = (data[7]&0xFF)&0x0F;
		//this.inCarTemp = (data[8]&0xFF)；
		this.leftTemp =  (data[8]&0xFF);
		this.rightTemp = (data[9]&0xFF);
		this.rearAirFanSpeed = (data[19]&0xFF);
		this.rearAirTemp = (data[18]&0xFF);
		this.isAirOn = (((data[6]&0xFF)& 128)==0);
		this.airFanModel = ((data[7]&0xFF)>>4);
	}
	
	public int getFanSpeed(){
		return this.fanSpeed;
	}

	public int getSeatHotLevel() {
		return seatHotLevel;
	}

	public void setSeatHotLevel(int seatHotLevel) {
		this.seatHotLevel = (seatHotLevel&0xFF);
	}

	public int getSeatFanLevel() {
		return seatFanLevel;
	}

	public void setSeatFanLevel(int seatFanLevel) {
		this.seatFanLevel =  (seatFanLevel&0xFF); ;
	}

	public boolean isAirOn() {
		return isAirOn;
	}

	public int getAirFanModel() {
		return airFanModel;
	}

	public void setAirFanModel(int airFanModel) {
		this.airFanModel = airFanModel;
	}
}
