package com.jiangqi.gof23.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局信息<p>
 * 环境(Context)类定义出: 变量到布尔值的一个映射
 * @author jiangqi
 *
 */
public class Context {

    private Map<Variable,Boolean> map = new HashMap<>();
    
    /**
     * 给变量设置布尔值
     * @param var 变量
     * @param value 设置的布尔值
     */
    public void assign(Variable var , boolean value){
        map.put(var, Boolean.valueOf(value));
    }
    
    /**
     * 查询变量的值
     * @param var 查询的变量
     * @return 变量的布尔值
     * @throws IllegalArgumentException
     */
    public boolean lookup(Variable var) {
        Boolean value = map.get(var);
        return value.booleanValue();
    }
}