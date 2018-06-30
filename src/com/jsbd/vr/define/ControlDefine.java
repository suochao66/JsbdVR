package com.jsbd.vr.define;

public class ControlDefine {

	/**
	 * 媒体控制相关定义
	 * 
	 *
	 */
	public static class MediaDef{
	
		/**
		 * U盘音乐
		 */
		public static final int MUSIC_USB = 0;
		/**
		 * SD音乐
		 */
		public static final int MUSIC_SD = 1;
		/**
		 * iPod音乐
		 */
		public static final int MUSIC_IPOD = 2;
		/**
		 * 蓝牙音乐
		 */
		public static final int MUSIC_BT = 3;
		/**
		 * aux音乐
		 */
		public static final int MUSIC_AUX = 4;

		/**
		 * 单曲循环
		 */
		public static final int PLAY_REPEAT_SINGLE = 0;
		/**
		 * 顺序播放，当前列表只播放一次
		 */
		public static final int PLAY_ORDER = 1;
		/**
		 * 顺序循环
		 */
		public static final int PLAY_ORDER_REPEAT = 2;
		/**
		 * 随机播放
		 */
		public static final int PLAY_RANDOM = 3;
		/**
		 * 文件夹循环
		 */
		public static final int PLAY_FOLDER_REPEAT = 4;
		/**
		 * 全盘播放
		 */
		public static final int PLAY_ALL = 5;
		
		/**
		 * U盘模式
		 */
		public static final int MODEL_USB = 0;
		/**
		 * 收音机模式
		 */
		public static final int MODEL_RADIO = 1;
		/**
		 * 蓝牙模式
		 */
		public static final int MODEL_BT = 2;
		/**
		 * iPod模式
		 */
		public static final int MODEL_IPOD = 3;
		/**
		 * AUX模式
		 */
		public static final int MODEL_AUX = 4;
	}
	public class AirDef{
		// 空调模式 0:default 1:Face (吹脸) 2:Face and Foot(吹脸和脚)
		// 3:Foot (吹脚)4:Foot and Defrost(吹脚和前除霜) 5:mode
		// active 6: Defrost(前除霜)

		public static final int FAN_MODEL_DEFAULT = 0;
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
		
		/**
		 * 除霜打开
		 */
		public static final int DEFROST_ON =1;
		/**
		 * 除霜关闭
		 */
		public static final int DEFROST_OFF =2;
		/**
		 * 前除霜打开
		 */
		public static final int DEFROST_FRONT_ON =3;
		/**
		 * 前除霜关闭
		 */
		public static final int DEFROST_FRONT_OFF =4;
		/**
		 * 后除霜打开
		 */
		public static final int DEFROST_REAR_ON =5;
		/**
		 * 后除霜关闭
		 */
		public static final int DEFROST_REAR_OFF =6;
		
		/**
		 * 空调制冷
		 */
		public static final int MODEL_DEF = 0;
		/**
		 * 空调制热
		 */
		public static final int MODEL_HEAT = 1;
	}
	
	public class SeatDef{
		/**
		 * 座椅加热开
		 */
		public static final int HEAT_ON = 1;
		/**
		 * 座椅加热关
		 */
		public static final int HEAT_OFF = 2;
		/**
		 * 左座椅加热开
		 */
		public static final int HEAT_LEFT_ON = 3;
		/**
		 * 左座椅加热关
		 */
		public static final int HEAT_LEFT_OFF = 4;
		/**
		 * 右座椅加热开
		 */
		public static final int HEAT_RIGHT_ON = 5;
		/**
		 * 右座椅加热关
		 */
		public static final int HEAT_RIGHT_OFF = 6;
		/**
		 * 座椅通风开
		 */
		public static final int  VENTILA_ON = 7;
		/**
		 * 座椅通风关
		 */
		public static final int  VENTILA_OFF = 8;
		/**
		 * 左座椅通风开
		 */
		public static final int  VENTILA_LEFT_ON = 9;
		/**
		 * 左座椅通风关
		 */
		public static final int  VENTILA_LEFT_OFF = 10;
		/**
		 * 右座椅通风开
		 */
		public static final int  VENTILA_RIGHT_ON = 11;
		/**
		 * 右座椅通风关
		 */
		public static final int  VENTILA_RIGHT_OFF = 12;
		
		/**
		 * 不指定哪个座椅
		 */
		public static final int SEAT_TYPE_DEFAULT = 0;
		/**
		 * 左座椅
		 */
		public static final int SEAT_TYPE_LEFT = 1;
		/**
		 * 右座椅
		 */
		public static final int SEAT_TYPE_RIGHT = 2;
		
	}
	public static class SysDef{
		/**
		 * 最大音量
		 */
		public static final int VOL_MAX = 40;
		
		/**
		 * 最小音量
		 */
		public static final int VOL_MIN = 0;
		/**
		 * 最大亮度
		 */
		public static final int SCREEN_LIGHT_MAX = 8;
		/**
		 * 最小亮度
		 */
		public static final int SCREEN_LIGHT_MIN = 1;
		
	}
	
}
