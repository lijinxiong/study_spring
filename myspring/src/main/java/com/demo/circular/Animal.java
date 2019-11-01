package com.demo.circular;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

/**
 * Created by lijinxiong on 2019/10/31
 *
 * @author lijinxiong
 * @Description //TODO .
 */
@Component
@Data
@Accessors(chain = true)
public class Animal {

	private Person person;

	public Animal(Person person) {
		this.person = person;
	}
}
