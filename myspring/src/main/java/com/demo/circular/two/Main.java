package com.demo.circular.two;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijinxiong on 2019/10/31
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class Main {

	public static void main(String[] args) {


		List<String> strings = new ArrayList<>();
		strings.add("a");
		strings.add("a");
		strings.add("a");
		strings.add("a");


		TestListSize testListSize = new TestListSize();
		testListSize.list = strings;

		for (int i = 0; i < testListSize.getList().size(); i++) {
			System.out.println(i);
		}
	}


	public static class TestListSize {

		List<String> list;

		public List<String> getList() {
			return list;
		}

		public void setList(List<String> list) {
			this.list = list;
		}
	}
}
