package com.jsbd.vr.define;

public class AdapterSystemDefine {
	public static final String VERSION = "20180621v1.0";
	public static class ActionDo{
		/**
		 * ������������統ǰ��ʶ������������κν���ʱ����������ϲ��˳�����
		 */
		public final static int VR_BREAK = 0;
		/**
		 * �������ͬʱ���ͷ���˷�
		 */
		public final static int VR_MIC_RELEASED= 1;
		/**
		 * �ָ���������
		 */
		public final static int VR_REGAIN_AWAKE = 2;
		
		/**
		 * ��������
		 */
		public final static int VR_AWAKE = 3;
		
		
	}
	public static class VRStatus{
		/**
		 * ������Ƶ����
		 */
		public final static int AUDIOFOCUS_REQUEST = 0;
		/**
		 * �ͷ���Ƶ����
		 */
		public final static int AUDIOFOCUS_RELEASED = 1;
	}
	public static class FloatViewStatus{
		/**
		 * ��ʾͼ��
		 */
		public final static int SHOW = 1;
		
		/**
		 * �ر�ͼ��
		 */
		public final static int CLOSE = 0;
		
	}
	
	public static class VREnable{
		/**
		 * ��������
		 */
		public final static int ENABLE = 1;
		
		/**
		 * ����������
		 */
		public final static int UNENABLE = 0;
		
	}
}
