package com.wangwei.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data //进行set和get注入
@SuppressWarnings("serial") //表示可以进行序列化
@NoArgsConstructor //这个表示生成空构造器
@Accessors(chain=true)
public class Dept  implements Serializable{

	private Long deptno;
	private String dname;
	private String db_source;

	public Long getDeptno() {
		return deptno;
	}

	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
}
