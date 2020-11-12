package com.jiangqi.test;

import java.util.HashMap;
import java.util.Map;

public class aaa {
	
	private HashMap<Integer, LiLv> liLv=new HashMap<Integer,LiLv>();
	private float benJing = 1017477.00f; // ��������
	private int nianXian = 10; // ��������
	private float fangZu=2400.00f;	//����
	private float fangDai=3797.25f;	//����
	
	//private float fangZu=0.00f;	//����
	//private float fangDai=3776.03f;	//����
	
	public aaa() {
		//��ʼ�����������ʱ�����������С����
		this.liLv.put(0, new LiLv(5,2.75f));	//5���궨������
		this.liLv.put(1, new LiLv(3,2.75f));	//3���궨������
		this.liLv.put(2, new LiLv(2,2.25f));	//2���궨������
		this.liLv.put(3, new LiLv(1,1.75f));	//1���궨������
	}
	
	/**
	 * ������ʺ����޶����п���������
	 */
	private void initLiLv() {
		for(int i=0;i<this.liLv.size();i++)
			((LiLv)this.liLv.get(i)).setCount(0);
	}
	
	/**
	 * ��ӡÿ�궨�����
	 */
	public void printDingQiCunKuan() {
		
		float NianCunKuan=(this.fangDai-this.fangZu)*12;
		
		float heJi=this.getAll(NianCunKuan, this.nianXian);
		System.out.println("����---------------");
		System.out.println(String.format("ÿ���%.2f��; ������ޣ�%d; �ϼƣ�%.2f��", NianCunKuan/10000,this.nianXian,heJi/10000));
		System.out.println();
		
	}
	

	/**
	 * ��ӡһ���Դ����е�����
	 */
	public void printSaveBank(){
		float tmp = getSaveBankSum(this.benJing,this.nianXian);
		System.out.println("���Դ�---------------");
		System.out.println(String.format("һ�δ�%.2f��; ������ޣ�%d; �ϼƣ�%.2f��", this.benJing/10000,this.nianXian,tmp/10000));
		System.out.println();
	}
	
	/**
	 * ����ָ�����ڴ������
	 * @param amt	�����
	 * @param count	�������
	 * @return
	 */
	private float getSaveBankSum(float amt,int count){
		
		LiLv tmp;
		int shengYvNianXian=count;
		
		//��ʼ�����ʺ����޶���
		this.initLiLv();
		
		//������궨����ÿ�ִ�����ڸ���
		for(int i=0;i<this.liLv.size();i++) {
			tmp=(LiLv) liLv.get(i);
			if(shengYvNianXian>=tmp.getNianXian()) {	
				tmp.setCount(this.getZhouQi(shengYvNianXian, tmp.getNianXian()));
				shengYvNianXian=shengYvNianXian%tmp.getNianXian();
			}
		}
		
		//������ʽ��������С������
		float heJi=amt;
		for(int i=0;i<this.liLv.size();i++) {
			tmp=this.liLv.get(i);
			
			//�����ڱ�Ϣ�ϼ� = ���� + ������������*����*����    
			for(int ii=0;ii<tmp.getCount();ii++) {
				heJi=heJi+tmp.getLiLv()/100*heJi*tmp.getNianXian();
			}
		}
		
		return heJi;
	}
	
	/**
	 * ���һ�������ڵĿ��ô������<br>
	 * @param nianXian  ���ȫ������
	 * @param zhouQi	���������
	 * @return	����������
	 */
	private int getZhouQi(int nianXian,int zhouQi) {
		
		if(nianXian<zhouQi)
			return 0;
		else
			return nianXian/zhouQi;

	}

	/**
	 * ���ÿ�궨�����ñ�����Ϣ�ϼ�
	 * @param dingCunJinE	ÿ�궨����
	 * @param cunKuanNianXian	�������
	 * @return
	 */
	private float getAll(float amt, int count) {

		float heJi = 0.00f; // ���صı�Ϣ�ϼƣ�
		
		Map<Integer,Float> total=new HashMap<Integer,Float>();
		
		//ѭ������ÿ�����ı��𵽴�����޺�ɵñ�����Ϣ�ϼ�
		float tmp=0.00f;
		for(int i=count;i>0;i--) {	
			tmp=this.getSaveBankSum(amt, i);
			total.put(i, tmp);
			heJi=heJi+tmp;
		}

		return heJi;
	}
	
	public static void main(String[] args) {

		aaa tmp=new aaa();
		tmp.printDingQiCunKuan();
		tmp.printSaveBank();
	}

};

/**
 * ������ʺ�����
 * @author Administrator
 *
 */
class LiLv{
	
	private int nianXian=0;	//�������
	private float liLv=0.00f;		//����
	private int count=0;		//����������
	
	public LiLv(int nianXian,float liLv) {
		this.nianXian=nianXian;
		this.liLv=liLv;
	}

	public int getNianXian() {
		return nianXian;
	}

	public void setNianXian(int nianXian) {
		this.nianXian = nianXian;
	}

	public float getLiLv() {
		return liLv;
	}

	public void setLiLv(float liLv) {
		this.liLv = liLv;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
