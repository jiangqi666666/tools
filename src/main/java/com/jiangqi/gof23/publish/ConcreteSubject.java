package com.jiangqi.gof23.publish;

/**
 * ����ʵ����
 * @author jiangqi
 * @see Subject
 */
public class ConcreteSubject extends Subject {
	//���屻�۲���״̬
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
}
