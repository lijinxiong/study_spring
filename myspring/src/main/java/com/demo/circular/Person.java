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
@Data
@Component
@Accessors(chain = true)
public class Person {

	private Animal animal;

	public Person(Animal animal) {
		this.animal = animal;
	}
}
