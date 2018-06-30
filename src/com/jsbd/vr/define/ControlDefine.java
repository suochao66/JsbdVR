package com.jsbd.vr.define;

public class ControlDefine {

	/**
	 * ý�������ض���
	 * 
	 *
	 */
	public static class MediaDef{
	
		/**
		 * U������
		 */
		public static final int MUSIC_USB = 0;
		/**
		 * SD����
		 */
		public static final int MUSIC_SD = 1;
		/**
		 * iPod����
		 */
		public static final int MUSIC_IPOD = 2;
		/**
		 * ��������
		 */
		public static final int MUSIC_BT = 3;
		/**
		 * aux����
		 */
		public static final int MUSIC_AUX = 4;

		/**
		 * ����ѭ��
		 */
		public static final int PLAY_REPEAT_SINGLE = 0;
		/**
		 * ˳�򲥷ţ���ǰ�б�ֻ����һ��
		 */
		public static final int PLAY_ORDER = 1;
		/**
		 * ˳��ѭ��
		 */
		public static final int PLAY_ORDER_REPEAT = 2;
		/**
		 * �������
		 */
		public static final int PLAY_RANDOM = 3;
		/**
		 * �ļ���ѭ��
		 */
		public static final int PLAY_FOLDER_REPEAT = 4;
		/**
		 * ȫ�̲���
		 */
		public static final int PLAY_ALL = 5;
		
		/**
		 * U��ģʽ
		 */
		public static final int MODEL_USB = 0;
		/**
		 * ������ģʽ
		 */
		public static final int MODEL_RADIO = 1;
		/**
		 * ����ģʽ
		 */
		public static final int MODEL_BT = 2;
		/**
		 * iPodģʽ
		 */
		public static final int MODEL_IPOD = 3;
		/**
		 * AUXģʽ
		 */
		public static final int MODEL_AUX = 4;
	}
	public class AirDef{
		// �յ�ģʽ 0:default 1:Face (����) 2:Face and Foot(�����ͽ�)
		// 3:Foot (����)4:Foot and Defrost(���ź�ǰ��˪) 5:mode
		// active 6: Defrost(ǰ��˪)

		public static final int FAN_MODEL_DEFAULT = 0;
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
		
		/**
		 * ��˪��
		 */
		public static final int DEFROST_ON =1;
		/**
		 * ��˪�ر�
		 */
		public static final int DEFROST_OFF =2;
		/**
		 * ǰ��˪��
		 */
		public static final int DEFROST_FRONT_ON =3;
		/**
		 * ǰ��˪�ر�
		 */
		public static final int DEFROST_FRONT_OFF =4;
		/**
		 * ���˪��
		 */
		public static final int DEFROST_REAR_ON =5;
		/**
		 * ���˪�ر�
		 */
		public static final int DEFROST_REAR_OFF =6;
		
		/**
		 * �յ�����
		 */
		public static final int MODEL_DEF = 0;
		/**
		 * �յ�����
		 */
		public static final int MODEL_HEAT = 1;
	}
	
	public class SeatDef{
		/**
		 * ���μ��ȿ�
		 */
		public static final int HEAT_ON = 1;
		/**
		 * ���μ��ȹ�
		 */
		public static final int HEAT_OFF = 2;
		/**
		 * �����μ��ȿ�
		 */
		public static final int HEAT_LEFT_ON = 3;
		/**
		 * �����μ��ȹ�
		 */
		public static final int HEAT_LEFT_OFF = 4;
		/**
		 * �����μ��ȿ�
		 */
		public static final int HEAT_RIGHT_ON = 5;
		/**
		 * �����μ��ȹ�
		 */
		public static final int HEAT_RIGHT_OFF = 6;
		/**
		 * ����ͨ�翪
		 */
		public static final int  VENTILA_ON = 7;
		/**
		 * ����ͨ���
		 */
		public static final int  VENTILA_OFF = 8;
		/**
		 * ������ͨ�翪
		 */
		public static final int  VENTILA_LEFT_ON = 9;
		/**
		 * ������ͨ���
		 */
		public static final int  VENTILA_LEFT_OFF = 10;
		/**
		 * ������ͨ�翪
		 */
		public static final int  VENTILA_RIGHT_ON = 11;
		/**
		 * ������ͨ���
		 */
		public static final int  VENTILA_RIGHT_OFF = 12;
		
		/**
		 * ��ָ���ĸ�����
		 */
		public static final int SEAT_TYPE_DEFAULT = 0;
		/**
		 * ������
		 */
		public static final int SEAT_TYPE_LEFT = 1;
		/**
		 * ������
		 */
		public static final int SEAT_TYPE_RIGHT = 2;
		
	}
	public static class SysDef{
		/**
		 * �������
		 */
		public static final int VOL_MAX = 40;
		
		/**
		 * ��С����
		 */
		public static final int VOL_MIN = 0;
		/**
		 * �������
		 */
		public static final int SCREEN_LIGHT_MAX = 8;
		/**
		 * ��С����
		 */
		public static final int SCREEN_LIGHT_MIN = 1;
		
	}
	
}
