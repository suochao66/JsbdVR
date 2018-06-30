package com.jsbd.vr.bean;

import com.jsbd.debug.DebugLog;


/**
* @ClassName: CarAirControlBean
* @Description: TODO(��Ҫ�����洢�յ����Ƶ����ݽṹ����һЩ����ֵ�Ķ���
* ������Ҫ��װ��Can������Э��)
* 
* @author suochao
* @date 2018��6��28��
*
*/
public class CarAirControlBean {
	private static CarAirControlBean self;
	// ������Э���㷢
		int num1 = 0x14;
		int num2 = 0x01;
		
		int voiceActiveControl = 1;// ��������״̬
		int acSwitchRequest = 0xFF;// ѹ������������1��AC OFF (ѹ�����ر�/����) 2��AC ON
									// (ѹ������/����)
		int airCondition = 0xFF;// �յ�״̬ 1�أ�2��
		int autoStatus = 0xFF;// �Զ�ģʽ 1�أ�2��
		int cycleStaus = 0xFF;// ����ѭ��״̬ 1���⣬2����
		int frontDefrost = 0xFF;// ǰ��˪ 1�أ�2��
		int reardefrost = 0xFF;// ���˪ 1�أ�2��
		int acMax = 0xFF;// ������� 1�أ�2��
		int hotMax = 0xFF;// ������� 1�أ�2��
		int temperatureRequest = 0xFF;// �¶����� 1up, 2down���Ƿ����¶����Ӷ���
		int windSpeedRequest = 0xFF;// �������� 1up, 2down
		int hvacModel = 0xFF;// �յ�ģʽ 0:default 1:Face (����) 2:Face and Foot(�����ͽ�)
								// 3:Foot (����)4:Foot and Defrost(���ź�ǰ��˪) 5:mode
								// active 6: Defrost(ǰ��˪)
		int dualStatus = 0xFF;// ˫���� 1�أ�2��
		int dataTypeNum = 0xFF;// ��̩18-32 ����17-32 ȷ�����¶�ֵת����ʽ
		int selfTestActive = 0xFF;// �Լ�״̬
		int fanSpeedLevel = 0xFF;// �����ȼ� 1-7
		int driverSeat = 0xFF;// �����յ�����0: driver seat 1: passenger seat 2: back
		int tempeleElecAirCondition = 0xFF;// �綯�յ��¶ȵ�λ 15��
		int heating = 0xFF;// ���μ���
		int airing = 0xFF;// ����ͨ��
		int autoCyle = 0xFF;// �Զ�����ѭ�� 1 noactive, 2 active
		int anion = 0xFF;// �����ӹ��ܿ��� 1 noactive, 2 active
		int pm25 = 0xFF;// PM2.5��ʾ���� 1 noactive, 2 active
		int frontHeat = 0xFF;// ǰ�絲���� 1 noactive, 2 active
		int temperatureProvince = 0xFF;// �¶ȷ������ƿ��� 1 noactive, 2 active
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
		 * ��������
		 */
		public void initData(){
			this.num1 = 0x14;
			this.num2 = 0x01;
			
			this.voiceActiveControl = 1;// ��������״̬
			this.acSwitchRequest = 0xFF;// ѹ������������1��AC OFF (ѹ�����ر�/����) 2��AC ON
										// (ѹ������/����)
			this.airCondition = 0xFF;// �յ�״̬ 1�أ�2��
			this.autoStatus = 0xFF;// �Զ�ģʽ 1�أ�2��
			this.cycleStaus = 0xFF;// ����ѭ��״̬ 1���⣬2����
			this.frontDefrost = 0xFF;// ǰ��˪ 1�أ�2��
			this.reardefrost = 0xFF;// ���˪ 1�أ�2��
			this.acMax = 0xFF;// ������� 1�أ�2��
			this.hotMax = 0xFF;// ������� 1�أ�2��
			this.temperatureRequest = 0xFF;// �¶����� 1up, 2down���Ƿ����¶����Ӷ���
			this.windSpeedRequest = 0xFF;// �������� 1up, 2down
			this.hvacModel = 0xFF;// �յ�ģʽ 0:default 1:Face (����) 2:Face and Foot(�����ͽ�)
									// 3:Foot (����)4:Foot and Defrost(���ź�ǰ��˪) 5:mode
									// active 6: Defrost(ǰ��˪)
			this.dualStatus = 0xFF;// ˫���� 1�أ�2��
			this.dataTypeNum = 0xFF;// ��̩18-32 ����17-32 ȷ�����¶�ֵת����ʽ
			this.selfTestActive = 0xFF;// �Լ�״̬
			this.fanSpeedLevel = 0xFF;// �����ȼ� 1-7
			this.driverSeat = 0xFF;// �����յ�����0: driver seat 1: passenger seat 2: back
			this.tempeleElecAirCondition = 0xFF;// �綯�յ��¶ȵ�λ 15��
			this.heating = 0xFF;// ���μ���
			this.airing = 0xFF;// ����ͨ��
			this.autoCyle = 0xFF;// �Զ�����ѭ�� 1 noactive, 2 active
			this.anion = 0xFF;// �����ӹ��ܿ��� 1 noactive, 2 active
			this.pm25 = 0xFF;// PM2.5��ʾ���� 1 noactive, 2 active
			this.frontHeat = 0xFF;// ǰ�絲���� 1 noactive, 2 active
			this.temperatureProvince = 0xFF;// �¶ȷ������ƿ��� 1 noactive, 2 active
			this.data25 = 0xFF;
			DebugLog.d("airData has init");
		}
		
		public void switchFanModel(int currentFanModel){
			switch(currentFanModel){
			case 2://����
				this.hvacModel = 2;
				break;
			case 3://����ͽ�
				this.hvacModel = 3;
				break;
			case 1://����
				this.hvacModel = 4;
				break;
			case 5://�������ͽ�
				this.hvacModel = 6;
				break;
			case 4://��˪
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
			 * Ĭ��
			 */
			public static final int FAN_MODEL_DEFAULT = 0xFF;
			/**
			 * ����
			 */
			public static final int FAN_MODEL_FACE = 1;
			/**
			 * �����ͽ�
			 */
			public static final int FAN_MODEL_FACE_AND_FOOT = 2;
			/**
			 * ����
			 */
			public static final int FAN_MODEL_FOOT = 3;
			/**
			 * ���ź�ǰ��˪
			 */
			public static final int FAN_MODEL_FOOT_AND_DEFROST = 4;
			/**
			 * ��ǰ��˪
			 */
			public static final int FAN_MODEL_EFROST = 6;
		}
}
