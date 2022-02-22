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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.lang.ClassNotFoundException;

import com.testing.ahmed.PlayGame.Match;
import com.testing.ahmed.Bowlingprogrambowlers_Bprgb;

public class Last4oversmatchda {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		
		//Math.Random
/*		double testrandom = Math.random()*100;
		System.out.println("testrandom - "+testrandom);

		Last4oversmatchda Last4overmatchdaMatch = new Last4oversmatchda();
*/
		Bowlingprogrambowlers_Bprgb bowlingprogrammatchsequence = new Bowlingprogrambowlers_Bprgb(); 

		//Bowlingprogrambowlers_Bprgb bowlingbowler = new Bowlingprogrambowlers_Bprgb();
		//ExtraFunctionsandMethods ExtrafuncTestPlayMatch = new ExtraFunctionsandMethods();
		
		String propertiesfilepath;
		propertiesfilepath=Match.Matchstatistics;
		
		String propertycounterStringread;
		propertycounterStringread="";
		propertycounterStringread=Last4overmatchdaMatch.getPropertiesFile(propertiesfilepath);		
		System.out.println("propertycounterStringread - read from properties file - "+propertycounterStringread);
		String counterproperty;
		counterproperty="";
		counterproperty="Match";
		
		int Matchcounterproperty;
		Matchcounterproperty=0;
		//Matchcounterproperty=Last4overmatchdaMatch.getcounterProperty(propertycounterStringread,counterproperty);

			
		int counterreadsuccess;
		counterreadsuccess=1;
		//counterreadsuccess=bowlingprogrammatchsequence.readcounterfromfile(counterproperty, propertiesfilepath);
		counterreadsuccess=Matchcounterproperty;
		
		if(counterreadsuccess==-1) {
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

			String propertyMatch;
			propertyMatch="Match";
			
			//matchesplayed=ExtrafuncTestPlayMatch.readcounterfromfile(propertyMatch, propertiesfilepath);
			
			int bowleroutcome[] = new int[12];
			int overorderforeverybowler[]=new int[4];
			
			//generate bowling for the bowlers
			while (icntr<4) {
				
				System.out.println("Starting match -- select bowler -- generate match sequence and statistics - 5 to exit");

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
			System.out.println("Number ----- press any number to see commentary to continue and 5 to exit----- ");
			optioncontinue = Integer.parseInt(s.nextLine().trim());
			
			//PlayGame playgameplaymatchMatch947119429741144254119 = new PlayGame(); 
			if ((icntr>=0) && (icntr<4)) {

				equationsrunsscoredwicketsremaining=bowlingprogrammatchsequence.Matchplayball(bowleroutcome,overorderforeverybowler[option],icntr,option, matchesplayed); //bowler bowling order and over

			} 
		
				icntr=icntr+1;
			}
			
			if (Match.WinnerFlag==5) {
				System.out.println("Match in progress.....");
			} else {
				if (bowlingprogrammatchsequence.CheckEQCcheckequation(Match.Currentscore,Match.Currentwickets,icntr)==1) {
					System.out.println("Match Ends - Lengaburu wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				} else if (bowlingprogrammatchsequence.CheckEQCcheckequation(Match.Currentscore,Match.Currentwickets,icntr)==0) {
					System.out.println("Match Ends - ITS A TIE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				} else if (bowlingprogrammatchsequence.CheckEQCcheckequation(Match.Currentscore,Match.Currentwickets,icntr)==2) {
					System.out.println("Match Ends - Enchai Wins !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				}
			}

			if(bowlingprogrammatchsequence.writecountertofile(propertyMatch,propertiesfilepath,1)==true) {
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
	
	//read the counter property Match
	public int getcounterProperty(String patternmatch, String str) {
		String cntr_read_read;
		cntr_read_read = str;
		int cntr_read_readflag;
		cntr_read_readflag=0;
		int int_cntr_read_read;
		int_cntr_read_read=0;
		
		if (str=="") {
			cntr_read_readflag=0;
		} else {
			cntr_read_readflag=1;
		}
		
		String regex = "";
		regex = "<"+ patternmatch +">";
		int positionstartarray;
		positionstartarray=0;
		int positionendarray;
		positionendarray=0;
		int x;
		int y;
		x=0;
		y=0;

		try {
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(cntr_read_read);

			System.out.println("cntr_read_read - " + cntr_read_read);
			
			if (m.find()) {

				positionstartarray = m.end()+1; // <counter> -- <Match>
				System.out.println("positionstartarray -" + positionstartarray);

				System.out.println("positionstartarray - " + positionstartarray);
		    	
				x = x + 1;

			}
		} catch (PatternSyntaxException pse) {
			pse.getMessage();
		}
		
		
		String regexxmlend = "";
		regexxmlend = "</"+ patternmatch +">";

		try {
			Pattern pclose = Pattern.compile(regexxmlend);
			Matcher mclose = pclose.matcher(cntr_read_read);
			System.out.println("cntr_read_read - " + cntr_read_read);
		
			if (mclose.find()) { //while (mclose.find()) { //check if this is not working because of file regexxmlend till end of cntr_read_read file

				positionendarray = mclose.start(); // <counter> -- //</Match>
				System.out.println("positionendarray -" + positionendarray);

				y = y + 1;

			}
		} catch (PatternSyntaxException pse) {
			pse.getMessage();
		}
		
		String counterpropertybeginremoved;
		counterpropertybeginremoved="";
		String counterpropertyendremoved;
		counterpropertyendremoved="";
		
		//counterproperty=cntr_read_read.substring(positionstartarray,positionendarray-1);
		String regexxmlbeginningcounter=regex;
		String regexxmlendcounter=regexxmlend;	
		String replacement="";
		
		//counterpropertybeginremoved=cntr_read_read.replaceFirst(regexxmlbeginningcounter, replacement);
		
		try {
			Pattern pbeginremoved=Pattern.compile(regex);
			Matcher mbeginremoved=pbeginremoved.matcher(cntr_read_read);
			counterpropertybeginremoved = mbeginremoved.replaceFirst(replacement);
		} catch (PatternSyntaxException pse) {
			pse.getMessage();
		}
		
		try {
			Pattern pendremoved=Pattern.compile(regexxmlend);
			Matcher mendremoved=pendremoved.matcher(cntr_read_read);
			counterpropertyendremoved = mendremoved.replaceFirst(replacement);
		} catch (PatternSyntaxException pse) {
			pse.getMessage();
		}		
		
		System.out.println("counterproperty begin removed - " + "- " + counterpropertybeginremoved);
		System.out.println("counterproperty end removed - " + "- " + counterpropertyendremoved);
		//counterpropertyendremoved=counterpropertybeginremoved.replaceFirst(regexxmlendcounter, replacement);
		
		if (counterpropertyendremoved=="") {
			int_cntr_read_read=-1;
		}else {
			int_cntr_read_read=Integer.parseInt(counterpropertyendremoved);
		}
		
		//int_cntr_read_read=int_cntr_read_read-1; //decrement counter by 1 till its greater than 0
		System.out.println("counter read - "+patternmatch + " property - "+int_cntr_read_read);
		
	
	return int_cntr_read_read;
	
		
	}
	
	//to read the properties file MatchStatsandmatchstatistics.txt
	public String getPropertiesFile(String filename) {

		String str; 
		str="";
    	
		try { 
			
			 //File file = new File("D:\\useful observations projects\\KirkaetAccountMatchROda\\MatchStatsandmatchstatistics.txt");  

			 Reader in = new FileReader(filename);
			 BufferedReader br = new BufferedReader(in);
			 //BufferredReader br = new BufferredReader(fr);

	    try {

	    	
            int data = br.read();  

            while (data != -1) {  
                str=str+(char) data;
                data = br.read();  
            }
            
            System.out.print(str);  
            in.close();  
            br.close();

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
	
	}

