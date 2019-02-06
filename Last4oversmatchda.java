package com.testing.ahmed;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.Scanner;

import com.testing.ahmed.Bowlingprogrambowlers_Bprgb.Match;

public class Last4oversmatchda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		
		//Math.Random
/*		double testrandom = Math.random()*100;
		System.out.println("testrandom - "+testrandom);
*/
		String name[]= new String[5];
		name[0] = "test template bowler";
		name[1] = "Kirat Boli";
		name[2] = "N.S. Nodhi";
		name[3] = "R Rumrah";
		name[4] = "Shashi Henra";
		
		int bowler[] = {1,2,3,4}; 
		
		int over[] = new int[4];
		over[0] = 1;
		over[1] = 2;
		over[2] = 3;
		over[3] = 4;

		try { 
			
		
			Scanner s = new Scanner(System.in);
			
			System.out.println("select the bowler to bowl the over"); 
			System.out.println("0.	name[0]  Kirat Boli");
			System.out.println("1.	name[1]  N.S. Nodhi");
			System.out.println("2.  name[2]  R Rumrah");
			System.out.println("3.  name[3]  Shashi Henra");
			
			System.out.println("User Input - 0, 1, 2, 3");	
			  
			int option;
			option=0;
			int optioncontinue;
			optioncontinue=0;
			int bowlerselected;
			int equationsrunsscoredwicketsremaining[] = new int[2];
			//equationsrunsscoredwicketsremaining[0]=37;
			//equationsrunsscoredwicketsremaining[1]=4;
			
	/*		option = Integer.parseInt(s.nextLine().trim());
			System.out.println("option" + option);
			
			int bowlerselected;
			bowlerselected=1;*/
			
			int i;
			i=0;
			int icntr;
			icntr=0;
	
			Bowlingprogrambowlers_Bprgb bowlingprogrammatchsequence = new Bowlingprogrambowlers_Bprgb(); 
			int bowleroutcome[] = new int[12];
			int overorderforeverybowler[]=new int[4];
			
			//generate bowling for the bowlers
			while (icntr<4) {
				
				System.out.println("Starting match -- generate match sequence and statistics - 5 to exit");

				option = Integer.parseInt(s.nextLine().trim());
				
				if (icntr==4) {
					//icntr=icntr-1;
					System.exit(0);
				} else { 
					overorderforeverybowler[icntr]=option;
				}
				System.out.println("option" + option);
				
				bowlerselected=option;
				// write to the "bowler"+bowler+"sequenceandpatternfile.txt files 4 files should be generated
				bowleroutcome= bowlingprogrammatchsequence.Matchgeneratebbowlersovers(bowlerselected, icntr);
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! PLAY MATCH !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("Number ----- press any number to continue 5 to exit----- ");
			optioncontinue = Integer.parseInt(s.nextLine().trim());
			
			//PlayGame playgameplaymatchMatch947119429741144254119 = new PlayGame(); 
			if ((option>=0) && (option<4)) {

				equationsrunsscoredwicketsremaining=bowlingprogrammatchsequence.Matchplayball(bowleroutcome,overorderforeverybowler[option],icntr,option); //bowler bowling order and over
	
				if (bowlingprogrammatchsequence.CheckEQCcheckequation(equationsrunsscoredwicketsremaining,icntr)==1) {
					System.out.println("Match Ends - Lengaburu wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				} else if (bowlingprogrammatchsequence.CheckEQCcheckequation(equationsrunsscoredwicketsremaining,icntr)==0) {
					System.out.println("Match Ends - ITS A TIE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				} else if (bowlingprogrammatchsequence.CheckEQCcheckequation(equationsrunsscoredwicketsremaining,icntr)==2) {
					System.out.println("Match Ends - Enchai Wins !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				}

			} 
				icntr=icntr+1;
			}
			
			System.out.println("Number ----- press any number to continue 5 to exit----- ");
			optioncontinue = Integer.parseInt(s.nextLine().trim());
			if (optioncontinue==5){		
				System.exit(0);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	}

