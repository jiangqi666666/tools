package com.jiangqi.test;

import java.util.HashMap;
import java.util.Map;

public class aaa {
	
	private HashMap<Integer, LiLv> liLv=new HashMap<Integer,LiLv>();
	private float benJing = 1017477.00f; // 购房本金
	private int nianXian = 10; // 贷款年限
	private float fangZu=2400.00f;	//房租
	private float fangDai=3797.25f;	//房贷
	
	//private float fangZu=0.00f;	//房租
	//private float fangDai=3776.03f;	//房贷
	
	public aaa() {
		//初始化利定存利率表，按大周期往小排序
		this.liLv.put(0, new LiLv(5,2.75f));	//5五年定存利率
		this.liLv.put(1, new LiLv(3,2.75f));	//3五年定存利率
		this.liLv.put(2, new LiLv(2,2.25f));	//2五年定存利率
		this.liLv.put(3, new LiLv(1,1.75f));	//1五年定存利率
	}
	
	/**
	 * 清空利率和年限对象中可用周期数
	 */
	private void initLiLv() {
		for(int i=0;i<this.liLv.size();i++)
			((LiLv)this.liLv.get(i)).setCount(0);
	}
	
	/**
	 * 打印每年定存情况
	 */
	public void printDingQiCunKuan() {
		
		float NianCunKuan=(this.fangDai-this.fangZu)*12;
		
		float heJi=this.getAll(NianCunKuan, this.nianXian);
		System.out.println("定存---------------");
		System.out.println(String.format("每年存款：%.2f万; 存款年限：%d; 合计：%.2f万", NianCunKuan/10000,this.nianXian,heJi/10000));
		System.out.println();
		
	}
	

	/**
	 * 打印一次性存银行的收益
	 */
	public void printSaveBank(){
		float tmp = getSaveBankSum(this.benJing,this.nianXian);
		System.out.println("次性存---------------");
		System.out.println(String.format("一次存款：%.2f万; 存款年限：%d; 合计：%.2f万", this.benJing/10000,this.nianXian,tmp/10000));
		System.out.println();
	}
	
	/**
	 * 计算指定金额定期存款收益
	 * @param amt	存款金额
	 * @param count	存款年限
	 * @return
	 */
	private float getSaveBankSum(float amt,int count){
		
		LiLv tmp;
		int shengYvNianXian=count;
		
		//初始化利率和年限对象
		this.initLiLv();
		
		//计算此年定存金额每种存款周期个数
		for(int i=0;i<this.liLv.size();i++) {
			tmp=(LiLv) liLv.get(i);
			if(shengYvNianXian>=tmp.getNianXian()) {	
				tmp.setCount(this.getZhouQi(shengYvNianXian, tmp.getNianXian()));
				shengYvNianXian=shengYvNianXian%tmp.getNianXian();
			}
		}
		
		//复利方式，按大往小周期排
		float heJi=amt;
		for(int i=0;i<this.liLv.size();i++) {
			tmp=this.liLv.get(i);
			
			//单周期本息合计 = 本金 + 本周期年利率*本金*年数    
			for(int ii=0;ii<tmp.getCount();ii++) {
				heJi=heJi+tmp.getLiLv()/100*heJi*tmp.getNianXian();
			}
		}
		
		return heJi;
	}
	
	/**
	 * 获得一个年限内的可用存款周期<br>
	 * @param nianXian  存款全部年限
	 * @param zhouQi	计算的周期
	 * @return	可用周期数
	 */
	private int getZhouQi(int nianXian,int zhouQi) {
		
		if(nianXian<zhouQi)
			return 0;
		else
			return nianXian/zhouQi;

	}

	/**
	 * 获得每年定存所得本金利息合计
	 * @param dingCunJinE	每年定存金额
	 * @param cunKuanNianXian	存款年限
	 * @return
	 */
	private float getAll(float amt, int count) {

		float heJi = 0.00f; // 返回的本息合计；
		
		Map<Integer,Float> total=new HashMap<Integer,Float>();
		
		//循环计算每年存入的本金到存款年限后可得本金利息合计
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
 * 存款利率和年限
 * @author Administrator
 *
 */
class LiLv{
	
	private int nianXian=0;	//存款年限
	private float liLv=0.00f;		//利率
	private int count=0;		//可用周期数
	
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
