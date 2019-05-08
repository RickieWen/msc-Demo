package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable// entity --orm--- db_table
{
	public Long 	deptno; // 主键
	public String 	dname; // 部门名称
	public String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	
	
	/**
	 * 
	 */
	public Dept() {
	}

	public Dept(String dname)
	{
		super();
		this.dname = dname;
	}

	/**
	 * @return the deptno
	 */
	public Long getDeptno() {
		return deptno;
	}

	/**
	 * @param deptno the deptno to set
	 */
	public Dept setDeptno(Long deptno) {
		this.deptno = deptno;
		return this;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param dname the dname to set
	 */
	public Dept setDname(String dname) {
		this.dname = dname;
		return this;
	}

	/**
	 * @return the db_source
	 */
	public String getDb_source() {
		return db_source;
	}

	/**
	 * @param db_source the db_source to set
	 */
	public Dept setDb_source(String db_source) {
		this.db_source = db_source;
		return this;
	}
	
	
}
