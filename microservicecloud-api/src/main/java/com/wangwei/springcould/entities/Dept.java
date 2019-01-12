package com.wangwei.springcould.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data //进行set和get注入
@SuppressWarnings("serial") //表示可以进行序列化
@NoArgsConstructor //这个表示生成空构造器
@Accessors(chain=true)
public class Dept  implements Serializable{

	private Long deptno;
	private String dname;
	private String db_source;
	
}
