package com.jsbd.vr.bean;

import com.jsbd.debug.DebugLog;


/**
* @ClassName: CarAirControlBean
* @Description: TODO(主要用来存储空调控制的数据结构，和一些常量值的定义
* 这里主要封装了Can的数据协议)
* 
* @author suochao
* @date 2018年6月28日
*
*/
public class CarAirControlBean {
	private static CarAirControlBean self;
	// 改用新协议裸发
		int num1 = 0x14;
		int num2 = 0x01;
		
		int voiceActiveControl = 1;// 语音激活状态
		int acSwitchRequest = 0xFF;// 压缩机开关请求1：AC OFF (压缩机关闭/制热) 2：AC ON
									// (压缩机打开/制冷)
		int airCondition = 0xFF;// 空调状态 1关，2开
		int autoStatus = 0xFF;// 自动模式 1关，2开
		int cycleStaus = 0xFF;// 内外循环状态 1，外，2，内
		int frontDefrost = 0xFF;// 前除霜 1关，2开
		int reardefrost = 0xFF;// 后除霜 1关，2开
		int acMax = 0xFF;// 最大制冷 1关，2开
		int hotMax = 0xFF;// 最大制热 1关，2开
		int temperatureRequest = 0xFF;// 温度增量 1up, 2down，是否有温度增加多少
		int windSpeedRequest = 0xFF;// 风速增量 1up, 2down
		int hvacModel = 0xFF;// 空调模式 0:default 1:Face (吹脸) 2:Face and Foot(吹脸和脚)
								// 3:Foot (吹脚)4:Foot and Defrost(吹脚和前除霜) 5:mode
								// active 6: Defrost(前除霜)
		int dualStatus = 0xFF;// 双联动 1关，2开
		int dataTypeNum = 0xFF;// 众泰18-32 吉利17-32 确定下温度值转换方式
		int selfTestActive = 0xFF;// 自检状态
		int fanSpeedLevel = 0xFF;// 风量等级 1-7
		int driverSeat = 0xFF;// 多区空调区域0: driver seat 1: passenger seat 2: back
		int tempeleElecAirCondition = 0xFF;// 电动空调温度档位 15个
		int heating = 0xFF;// 座椅加热
		int airing = 0xFF;// 座椅通风
		int autoCyle = 0xFF;// 自动内外循环 1 noactive, 2 active
		int anion = 0xFF;// 负离子功能开关 1 noactive, 2 active
		int pm25 = 0xFF;// PM2.5显示开关 1 noactive, 2 active
		int frontHeat = 0xFF;// 前风挡加热 1 noactive, 2 active
		int temperatureProvince = 0xFF;// 温度分区控制开关 1 noactive, 2 active
		int data25 = 0xFF;
		
		
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
		public int getVoiceActiveControl() {
			return voiceActiveControl;
		}
		public void setVoiceActiveControl(int voiceActiveControl) {
			this.voiceActiveControl = voiceActiveControl;
		}
		public int getAcSwitchRequest() {
			return acSwitchRequest;
		}
		public void setAcSwitchRequest(int acSwitchRequest) {
			this.acSwitchRequest = acSwitchRequest;
		}
		public int getAirCondition() {
			return airCondition;
		}
		public void setAirCondition(int airCondition) {
			this.airCondition = airCondition;
		}
		public int getAutoStatus() {
			return autoStatus;
		}
		public void setAutoStatus(int autoStatus) {
			this.autoStatus = autoStatus;
		}
		public int getCycleStaus() {
			return cycleStaus;
		}
		public void setCycleStaus(int cycleStaus) {
			this.cycleStaus = cycleStaus;
		}
		public int getFrontDefrost() {
			return frontDefrost;
		}
		public void setFrontDefrost(int frontDefrost) {
			this.frontDefrost = frontDefrost;
		}
		public int getReardefrost() {
			return reardefrost;
		}
		public void setReardefrost(int reardefrost) {
			this.reardefrost = reardefrost;
		}
		public int getAcMax() {
			return acMax;
		}
		public void setAcMax(int acMax) {
			this.acMax = acMax;
		}
		public int getHotMax() {
			return hotMax;
		}
		public void setHotMax(int hotMax) {
			this.hotMax = hotMax;
		}
		public int getTemperatureRequest() {
			return temperatureRequest;
		}
		public void setTemperatureRequest(int temperatureRequest) {
			this.temperatureRequest = temperatureRequest;
		}
		public int getWindSpeedRequest() {
			return windSpeedRequest;
		}
		public void setWindSpeedRequest(int windSpeedRequest) {
			this.windSpeedRequest = windSpeedRequest;
		}
		public int getHvacModel() {
			return hvacModel;
		}
		public void setHvacModel(int hvacModel) {
			this.hvacModel = hvacModel;
		}
		public int getDualStatus() {
			return dualStatus;
		}
		public void setDualStatus(int dualStatus) {
			this.dualStatus = dualStatus;
		}
		public int getDataTypeNum() {
			return dataTypeNum;
		}
		public void setDataTypeNum(int dataTypeNum) {
			this.dataTypeNum = dataTypeNum;
		}
		public int getSelfTestActive() {
			return selfTestActive;
		}
		public void setSelfTestActive(int selfTestActive) {
			this.selfTestActive = selfTestActive;
		}
		public int getFanSpeedLevel() {
			return fanSpeedLevel;
		}
		public void setFanSpeedLevel(int fanSpeedLevel) {
			this.fanSpeedLevel = fanSpeedLevel;
		}
		public int getDriverSeat() {
			return driverSeat;
		}
		public void setDriverSeat(int driverSeat) {
			this.driverSeat = driverSeat;
		}
		public int getTempeleElecAirCondition() {
			return tempeleElecAirCondition;
		}
		public void setTempeleElecAirCondition(int tempeleElecAirCondition) {
			this.tempeleElecAirCondition = tempeleElecAirCondition;
		}
		public int getHeating() {
			return heating;
		}
		public void setHeating(int heating) {
			this.heating = heating;
		}
		public int getAiring() {
			return airing;
		}
		public void setAiring(int airing) {
			this.airing = airing;
		}
		public int getAutoCyle() {
			return autoCyle;
		}
		public void setAutoCyle(int autoCyle) {
			this.autoCyle = autoCyle;
		}
		public int getAnion() {
			return anion;
		}
		public void setAnion(int anion) {
			this.anion = anion;
		}
		public int getPm25() {
			return pm25;
		}
		public void setPm25(int pm25) {
			this.pm25 = pm25;
		}
		public int getFrontHeat() {
			return frontHeat;
		}
		public void setFrontHeat(int frontHeat) {
			this.frontHeat = frontHeat;
		}
		public int getTemperatureProvince() {
			return temperatureProvince;
		}
		public void setTemperatureProvince(int temperatureProvince) {
			this.temperatureProvince = temperatureProvince;
		}
		public int getData25() {
			return data25;
		}
		public void setData25(int data25) {
			this.data25 = data25;
		}
		
		public static synchronized CarAirControlBean getControlBean(){
			if(self==null){
				self = new CarAirControlBean();
			}else{
				self.initData();
			}
			return self;
		}
		/**
		 * 重置数据
		 */
		public void initData(){
			this.num1 = 0x14;
			this.num2 = 0x01;
			
			this.voiceActiveControl = 1;// 语音激活状态
			this.acSwitchRequest = 0xFF;// 压缩机开关请求1：AC OFF (压缩机关闭/制热) 2：AC ON
										// (压缩机打开/制冷)
			this.airCondition = 0xFF;// 空调状态 1关，2开
			this.autoStatus = 0xFF;// 自动模式 1关，2开
			this.cycleStaus = 0xFF;// 内外循环状态 1，外，2，内
			this.frontDefrost = 0xFF;// 前除霜 1关，2开
			this.reardefrost = 0xFF;// 后除霜 1关，2开
			this.acMax = 0xFF;// 最大制冷 1关，2开
			this.hotMax = 0xFF;// 最大制热 1关，2开
			this.temperatureRequest = 0xFF;// 温度增量 1up, 2down，是否有温度增加多少
			this.windSpeedRequest = 0xFF;// 风速增量 1up, 2down
			this.hvacModel = 0xFF;// 空调模式 0:default 1:Face (吹脸) 2:Face and Foot(吹脸和脚)
									// 3:Foot (吹脚)4:Foot and Defrost(吹脚和前除霜) 5:mode
									// active 6: Defrost(前除霜)
			this.dualStatus = 0xFF;// 双联动 1关，2开
			this.dataTypeNum = 0xFF;// 众泰18-32 吉利17-32 确定下温度值转换方式
			this.selfTestActive = 0xFF;// 自检状态
			this.fanSpeedLevel = 0xFF;// 风量等级 1-7
			this.driverSeat = 0xFF;// 多区空调区域0: driver seat 1: passenger seat 2: back
			this.tempeleElecAirCondition = 0xFF;// 电动空调温度档位 15个
			this.heating = 0xFF;// 座椅加热
			this.airing = 0xFF;// 座椅通风
			this.autoCyle = 0xFF;// 自动内外循环 1 noactive, 2 active
			this.anion = 0xFF;// 负离子功能开关 1 noactive, 2 active
			this.pm25 = 0xFF;// PM2.5显示开关 1 noactive, 2 active
			this.frontHeat = 0xFF;// 前风挡加热 1 noactive, 2 active
			this.temperatureProvince = 0xFF;// 温度分区控制开关 1 noactive, 2 active
			this.data25 = 0xFF;
			DebugLog.d("airData has init");
		}
		
		public void switchFanModel(int currentFanModel){
			switch(currentFanModel){
			case 2://吹面
				this.hvacModel = 2;
				break;
			case 3://吹面和脚
				this.hvacModel = 3;
				break;
			case 1://吹脚
				this.hvacModel = 4;
				break;
			case 5://吹玻璃和脚
				this.hvacModel = 6;
				break;
			case 4://除霜
				this.hvacModel = 1;
				break;
			default:
				break;
			}
		}
		
	public static class Def{
			public static final int AIRCONDITION_ON = 2;
			public static final int AIRCONDITION_OFF = 1;
			public static final int TEMP_MAX = 32;
			public static final int TEMP_MIN = 18;
			public static final int TEMP_UP = 1;
			public static final int TEMP_DOWN = 2;
			public static final int FAN_UP = 1;
			public static final int FAN_DOWN = 2;
			public static final int AC_ON = 2;
			public static final int AC_OFF = 1;
			public static final int AC_MAX_ON = 2;
			public static final int AC_MAX_OFF = 1;
			public static final int HOT_MAX_ON = 2;
			public static final int HOT_MAX_OFF = 1;
			
			
			public static final int FRONT_DEFROST_ON = 2;
			public static final int FRONT_DEFROST_OFF = 1;
			public static final int REAR_DEFROST_ON = 2;
			public static final int REAR_DEFROST_OFF = 1;
			public static final int AUTO_ON = 2;
			public static final int AUTO_OFF = 1;
			public static final int ANION_ON = 2;
			public static final int ANION_OFF = 1;
			public static final int FRONTHEAT_ON = 2;
			public static final int FRONTHEAT_OFF = 1;
			
			public static final int CYCLE_IN = 2;
			public static final int CYCLE_OUT = 1;
			
			public static final int FAN_MAX = 7;
			public static final int FAN_MIN = 1;
			public static final int FAN_LEVEL_UP = 1;
			public static final int FAN_LEVEL_DOWN = 2;
     
			public static final int DUAL_ON = 2;
			public static final int DUAL_OFF = 1;
			/**
			 * 默认
			 */
			public static final int FAN_MODEL_DEFAULT = 0xFF;
			/**
			 * 吹脸
			 */
			public static final int FAN_MODEL_FACE = 1;
			/**
			 * 吹脸和脚
			 */
			public static final int FAN_MODEL_FACE_AND_FOOT = 2;
			/**
			 * 吹脚
			 */
			public static final int FAN_MODEL_FOOT = 3;
			/**
			 * 吹脚和前除霜
			 */
			public static final int FAN_MODEL_FOOT_AND_DEFROST = 4;
			/**
			 * 吹前除霜
			 */
			public static final int FAN_MODEL_EFROST = 6;
		}
}
