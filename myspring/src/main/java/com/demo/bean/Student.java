package com.demo.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author 29752
 */
@Data
@Accessors(chain = true)
public class Student {

    private String name;

    private int age;


}