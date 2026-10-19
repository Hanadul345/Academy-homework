package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.Gimbab;
import com.kh.chap04.service.GimbabFilter;

public class PorkFilter implements GimbabFilter {
	
	//재료에 제육이 포함되어 있는가?
	@Override
	public boolean filter(Gimbab g) {
		// TODO Auto-generated method stub
		return g.getMainMenu().contains("제육");
	}

}
