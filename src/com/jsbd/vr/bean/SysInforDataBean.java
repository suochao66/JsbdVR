package com.jsbd.vr.bean;

public class SysInforDataBean {

	/**
	 * ��������ֵ
	 */
	private int volValue;
	/**
	 * ������Ļ����
	 */
	private int screenLight;
	/**
	 * ����������״̬
	 */
	private boolean radioOn;
	
	public int getVolValue() {
		return volValue;
	}
	public void setVolValue(int volValue) {
		this.volValue = volValue;
	}
	public int getScreenLight() {
		return screenLight;
	}
	public void setScreenLight(int screenLight) {
		this.screenLight = screenLight;
	}
	public boolean isRadioOn() {
		return radioOn;
	}
	public void setRadioOn(int radioOn) {
		this.radioOn = ((radioOn&1) == 1);
	}
	
	
}
