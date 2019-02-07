package com.testing.ahmed;

import java.util.Random;

import com.testing.ahmed.PlayGame.Match;

public class GenerateRandomNumber {

	long seedrandom;
	double randomgenerated;

	GenerateRandomNumber(){
		seedrandom = 3600; //make it 3600 for 4 bowlers 900 balls each to maintain random number like sequence
		randomgenerated=0;
	}

	Random generator = new Random();
	//Random generator = new Random(seedrandom);

	public int generateRandomNumber() { 
	
		int randomnumbergen;
		randomnumbergen=0;

		randomgenerated = generator.nextDouble();
		System.out.println("randomgenerated - "+randomgenerated);
		randomnumbergen=(int) (randomgenerated*100);
		System.out.println("randomgenerated - "+randomnumbergen);
		return randomnumbergen;
	}
	
}
