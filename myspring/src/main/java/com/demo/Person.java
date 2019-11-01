package com.demo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by lijinxiong on 2019/10/29
 *
 * @author lijinxiong
 * @Description //TODO .
 */
@Data
@Accessors(chain = true)
public class Person {

	private String name;


	public Person(String name) {
		this.name = name;
	}


}
