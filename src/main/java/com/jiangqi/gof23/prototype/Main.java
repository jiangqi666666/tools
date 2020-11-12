package com.jiangqi.gof23.prototype;

public class Main {

	/**
	 * ԭ��ģʽ Prototype
	 * ͨ����¡�����ʵ��ĸ���,��Ϊǳ���ƺ����
	 * ǳ���ƣ�����ʵ���а����Ķ���ʱ��ֻ������ָ�����ã�������ָ���Ӧ���ࣻ
	 * ��ƣ�����������ڵĶ��󶼸��ƣ���ע�⸴����ȺͶ�������ù�ϵ����ֹ�����ѭ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ǳ���ƶ���
		OneTest one=new OneTest();
		TwoTest two=new TwoTest();
		two.one=one;
		
		//��ƶ���
		AllOneTest allOne=new AllOneTest();
		AllTwoTest allTwo=new AllTwoTest();
		allTwo.one=allOne;
		
		try {
			//ǳ����
			TwoTest test1=(TwoTest)two.clone();
			//���
			AllTwoTest test2=(AllTwoTest)allTwo.clone();
			
			//����ǰȡֵ
			System.out.println("ǳ���Ƹ���ǰȡֵ------------");
			System.out.println(test1.i);
			System.out.println(test1.one.i);
			System.out.println("��Ƹ���ǰȡֵ------------");
			System.out.println(test2.i);
			System.out.println(test2.one.i);
			
			//�޸�ԭ�������ݣ���֤�������
			two.i="����ǳ���ƶ���One�޸�ֵ����";
			two.one.i="����ǳ���ƶ���Two�޸�ֵ����";
			allTwo.i="������ƶ���One�޸�ֵ����";
			allTwo.one.i="������ƶ���Two�޸�ֵ����";
						
			//���ƺ�ȡֵ
			System.out.println("ǳ���Ƹ��ƺ�ȡֵ------------");
			System.out.println(test1.i);
			System.out.println(test1.one.i);
			System.out.println("��Ƹ��ƺ�ȡֵ------------");
			System.out.println(test2.i);
			System.out.println(test2.one.i);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
