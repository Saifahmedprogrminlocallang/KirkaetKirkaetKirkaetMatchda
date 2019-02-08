package com.testing.ahmed;

public class PlayGame {

	public static class Match {

		static int Matchscore;
		static int Matchwickets;
		static int ballsbowled;

		static int Currentscore;
		static int Currentwickets;		
		static String Matchstatistics;
		//static int matchesplayed;
		static int oversbowledbyeverybowlerinthematch[]={0,0,0,0};
		static int Currentmatchbowlerordersequence[]= {1,2,3,4};
		static int WinnerFlag;
		int i;

		public void intitializeMatch() {
			Currentscore=0;
			Currentwickets=0;
			Matchscore=40; // read from properties file 
			Matchwickets=3;
			ballsbowled=0;
			Matchstatistics="C:\\Kirkaet\\MatchStatsandmatchstatistics.xml";
			WinnerFlag=5;//match in progress
			System.out.println("Match sequence numbers data for bowlers generated for 2 matches only");
			//System.out.println("Matchstatistics Match Matchesplayed- "+matchesplayed);
			//matchesplayed=0; // read from property file
			i=0;
			/*******
			for(i=1;i<=4;i++) {
				Currentmatchbowlerordersequence[i]=Extrafunc.readcounterfromfile("oversbowled"+i, Matchstatistics);
			}
			*******/
	
			
		}

		
		//TWO COUNTERS - Match
		// AND oversbowled-i
	}


}
