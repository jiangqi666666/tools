package com.jiangqi.gof23.prototype;

public class Main {

	/**
	 * ԭ��ģʽ Prototype
	 * ͨ����¡�����ʵ��ĸ���,��Ϊǳ���ƺ����
	 * ǳ���ƣ�����ʵ���а����Ķ���ʱ��ֻ������ָ�����ã�������ָ���Ӧ���ࣻ
	 * ��ƣ�����������ڵĶ��󶼸��ƣ���ע�⸴����ȺͶ�������ù�ϵ����ֹ�����ѭ��
	 */
	public static void main(String[] args) {
		
		//ǳ���ƶ���
		OneTest one=new OneTest();
		TwoTest two=new TwoTest();
		two.setOne(one);
		
		//��ƶ���
		AllOneTest allOne=new AllOneTest();
		AllTwoTest allTwo=new AllTwoTest();
		allTwo.setOne(allOne);
		
		try {
			//ǳ����
			TwoTest test1=(TwoTest)two.clone();
			//���
			AllTwoTest test2=(AllTwoTest)allTwo.clone();
			
			//����ǰȡֵ
			System.out.println("ǳ���Ƹ���ǰȡֵ------------");
			System.out.println(test1.getI());
			System.out.println(test1.getOne().getI());
			System.out.println("��Ƹ���ǰȡֵ------------");
			System.out.println(test2.getI());
			System.out.println(test2.getOne().getI());
			
			//�޸�ԭ�������ݣ���֤�������
			two.setI("����ǳ���ƶ���One�޸�ֵ����");
			
			two.getOne().setI("����ǳ���ƶ���Two�޸�ֵ����");
			allTwo.setI("������ƶ���One�޸�ֵ����");
			allTwo.getOne().setI("������ƶ���Two�޸�ֵ����");
						
			//���ƺ�ȡֵ
			System.out.println("ǳ���Ƹ��ƺ�ȡֵ------------");
			System.out.println(test1.getI());
			System.out.println(test1.getOne().getI());
			System.out.println("��Ƹ��ƺ�ȡֵ------------");
			System.out.println(test2.getI());
			System.out.println(test2.getOne().getI());
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
