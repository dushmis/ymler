package com.dushyant.test;

import com.dushyant.xml.Age;
import com.dushyant.yml.YmlException;
import com.dushyant.yml.Ymler;

public class TestAge {
	public static void main(String[] args) {
		try {

			for (int i = 0; i < 10; i++) {
				Ymler<Age> ymler_ = new Ymler<Age>();
				final Age age = ymler_.get(Age.class);
				age.setA(age.getA() + 1);
				ymler_.save(age);
			}
		} catch (YmlException e) {
			e.printStackTrace();
		}
	}
}
