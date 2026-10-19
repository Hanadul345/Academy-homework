package com.kh.chap02.run;

import com.kh.chap02.model.dto.Bracelet;
import com.kh.chap02.model.dto.PrinceGoldCrown;
import com.kh.chap02.model.dto.SwedenGoldCrown;

public class Run {
	public static void main(String[] args) {
		
		PrinceGoldCrown pgc = new PrinceGoldCrown();
		pgc.setName("금관총 금관");
		System.out.println(pgc.getName());
		
		SwedenGoldCrown sgc = new SwedenGoldCrown("서국총 금관", 12, "18k", 10000);
		System.out.println(sgc.info());
		
		Bracelet b = new Bracelet("금팔찌", 10.0, "24k", "22cm");
		System.out.println(b.info());
	
	
	}
	
}
