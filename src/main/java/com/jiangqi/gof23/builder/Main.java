package com.jiangqi.gof23.builder;

public class Main {

	/**
	 * ������ģʽ��Builder
	 * �ڴ������Ӷ�����㷨Ӧ�ö����ڸö������ɲ����Լ����ǵ���װ��ʽʱ���ã�
	 * ��Щ�����ڲ�������Ĺ���˳��ͨ�����ȶ��ģ��������ڲ��Ĺ���ͨ�����ٸ��ӵı仯��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director dir=new Director(); //����������
		Builder b1=new ConcreteBuilder1(); //�������칤��1
		Builder b2=new ConcreteBuilder2(); //�������칤��1
		
		//������ʹ�ý��칤��1������Ʒ
		dir.construct(b1);
		Product p1=dir.getResult();
		p1.Show();
		
		//������ʹ�ý��칤��2������Ʒ
		dir.construct(b2);
		Product p2=dir.getResult();
		p2.Show();
	}

}
