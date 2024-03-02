package com.tnsif.project.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<Laptop>();
		
		laps.add(new Laptop("dell",120000,3));
		laps.add(new Laptop("apple",130000,4));
		laps.add(new Laptop("hp",110000,8));
		
		Collections.sort(laps);
		
		for(Laptop l:laps) {
			System.out.println(l);
		}
	}
	
}
