package com.jiangqi.gof23.command;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * ÃüÁî²ÎÊıPojo
 * @author jiangqi
 */
public class CommandInfo implements   Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7592630755956814031L;
	private long id;
	private String par1;
	private String par2;
}
