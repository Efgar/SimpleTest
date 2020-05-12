package com.efgh.core.simpletest;

public class EntryPoint {

	
	public static void main(String[] args) {
		Lotto lotto = new AssignmentLotto();
		System.out.println("Lets solve " + lotto.getRandomLottoValue());
	}
}
