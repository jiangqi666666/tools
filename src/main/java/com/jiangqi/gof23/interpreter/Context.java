package com.jiangqi.gof23.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * ȫ����Ϣ<p>
 * ����(Context)�ඨ���: ����������ֵ��һ��ӳ��
 * @author jiangqi
 *
 */
public class Context {

    private Map<Variable,Boolean> map = new HashMap<>();
    
    /**
     * ���������ò���ֵ
     * @param var ����
     * @param value ���õĲ���ֵ
     */
    public void assign(Variable var , boolean value){
        map.put(var, Boolean.valueOf(value));
    }
    
    /**
     * ��ѯ������ֵ
     * @param var ��ѯ�ı���
     * @return �����Ĳ���ֵ
     * @throws IllegalArgumentException
     */
    public boolean lookup(Variable var) {
        Boolean value = map.get(var);
        return value.booleanValue();
    }
}