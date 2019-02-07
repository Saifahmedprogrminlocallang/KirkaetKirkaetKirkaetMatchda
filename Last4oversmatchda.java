package com.testing.ahmed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.lang.Math;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;
import java.lang.ClassNotFoundException;

import com.testing.ahmed.PlayGame.Match;
import com.testing.ahmed.ExtraFunctionsandMethods;

public class Last4oversmatchda {

	public String getPropertiesFile(String filename) {

		String str; 
		str="";
    	
		try { 
			
			 //File file = new File("D:\\Kirkaet\\MatchStatsandmatchstatistics.txt");  

			 Reader in = new FileReader("D:\\Kirkaet\\MatchStatsandmatchstatistics.txt");
			 //BufferedReader br = new BufferedReader(in);
			 //BufferredReader br = new BufferredReader(fr);

	    try {

	    	
            int data = in.read();  

            while (data != -1) {  
                str=str+(char) data;
                data = in.read();  
            }
            
            System.out.print(str);  
            in.close();  

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return str;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		
		//Math.Random
/*		double testrandom = Math.random()*100;
		System.out.println("testrandom - "+testrandom);
*/
		Last4oversmatchda Last4overmatchdaMatch = new Last4oversmatchda();
		
		ExtraFunctionsandMethods ExtrafuncTestPlayMatch = new ExtraFunctionsandMethods();
		
		String propertiesfilepath;
		propertiesfilepath="D:\\Kirkaet\\MatchStatsandmatchstatistics.xml";
		
		String propertycounterStringread="";
		propertycounterStringread=Last4overmatchdaMatch.getPropertiesFile(propertiesfilepath);		
		System.out.println("propertycounterStringread - read from properties file - "+propertycounterStringread);
		
		int counterreadsuccess;
		counterreadsuccess=1;
		counterreadsuccess=ExtrafuncTestPlayMatch.readcounterfromfile("Match", propertiesfilepath);

		if((counterreadsuccess)==-1) {
			System.out.println("Counter file read failed -------------------- SHMUCK!");
		} else {
			System.out.println("Counter file read SUCCESS ----------------- YABADABADOOOOOOOO!");
		} 
		
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
			//equationsrunsscoredwicketsremaining[0]=40;
			//equationsrunsscoredwicketsremaining[1]=3;
			
			
			int i;
			i=0;
			int icntr;
			icntr=0;
			int matchesplayed;
			matchesplayed=0;
			
			Bowlingprogrambowlers_Bprgb bowlingprogrammatchsequence = new Bowlingprogrambowlers_Bprgb(); 

			String propertyMatch;
			propertyMatch="Match";
			
			//matchesplayed=ExtrafuncTestPlayMatch.readcounterfromfile(propertyMatch, propertiesfilepath);
			
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
				bowleroutcome= bowlingprogrammatchsequence.Matchgeneratebbowlersovers(bowlerselected, icntr, matchesplayed);
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! PLAY MATCH !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("Number ----- press any number to continue 5 to exit----- ");
			optioncontinue = Integer.parseInt(s.nextLine().trim());
			
			//PlayGame playgameplaymatchMatch947119429741144254119 = new PlayGame(); 
			if ((icntr>=0) && (icntr<4)) {

				equationsrunsscoredwicketsremaining=bowlingprogrammatchsequence.Matchplayball(bowleroutcome,overorderforeverybowler[option],icntr,option, matchesplayed); //bowler bowling order and over

			} 
		
			
				icntr=icntr+1;
			}
			
						
			if (bowlingprogrammatchsequence.CheckEQCcheckequation(Match.Currentscore,Match.Currentwickets,icntr)==1) {
				System.out.println("Match Ends - Lengaburu wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			} else if (bowlingprogrammatchsequence.CheckEQCcheckequation(Match.Currentscore,Match.Currentwickets,icntr)==0) {
				System.out.println("Match Ends - ITS A TIE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			} else if (bowlingprogrammatchsequence.CheckEQCcheckequation(Match.Currentscore,Match.Currentwickets,icntr)==2) {
				System.out.println("Match Ends - Enchai Wins !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
			

			if(ExtrafuncTestPlayMatch.writecountertofile(propertyMatch,propertiesfilepath,1)) {
				System.out.println("wrote to file MatchStatsmatchstatistics.txt");
			} else {
				System.out.println("did not write to file MatchStatsmatchstatistics.txt");
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

