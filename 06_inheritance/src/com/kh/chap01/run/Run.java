package com.kh.chap01.run;

import com.kh.chap01.model.dto.GoldBracelet;
import com.kh.chap01.model.dto.PrinceTombGoldCrown;
import com.kh.chap01.model.dto.SwedenTombGoldCrown;

public class Run {
	public static void main(String[] args) {
		
		GoldBracelet gb = new GoldBracelet("경주금팔찌", 20, "24k", 8.3);
		
		PrinceTombGoldCrown pg = new PrinceTombGoldCrown("금봉총 금관", 27, "24k", "신라");
		
		SwedenTombGoldCrown sg = new SwedenTombGoldCrown("서봉총 금관", 10.0, "14k");
	}
}
