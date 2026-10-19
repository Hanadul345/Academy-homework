package com.kh.chap04.service;

import com.kh.chap04.model.dto.Gimbab;

public class ExpensiveFilter implements GimbabFilter {

	@Override
	public boolean filter(Gimbab g) {
		return g.getPrice() >= 2000;
		
	}
	
}
