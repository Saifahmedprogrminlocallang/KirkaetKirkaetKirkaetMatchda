package com.testing.ahmed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.testing.ahmed.PlayGame.Match;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Bowlingprogrambowlers_Bprgb {
	
	//PlayGame playgame = new PlayGame();
	
	public class PlayBallPlayMatchMatchStatistics {
		int statisticsbowlerover[]=new int[6];

		
	}
	
	
	public static class Bowlers {

		static int bowler1cntr[]={0,45,270,225,90,135,9,81,45};
		static int bowler2cntr[]={0,90,360,180,45,90,9,36,90};
		static int bowler3cntr[]={0,180,270,135,45,45,9,36,180};
		static int bowler4cntr[]={0,270,225,45,0,45,9,36,270};

	}

	// random number generator 1 of 8
/*	Kirat Boli 	4overs * (0*0.05 + 1*0.3 + 2*0.25+ 3*0.10+ 4*0.15+ 5*0.01 + 6*0.09)runs per over + 1wicket*0.05
	= 4 balls * 0 runs - 5 percent spread over 24 balls  
	+ 4 balls * 1 run
	+ 4 balls * 2 runs
	outcomes per ball in a over
	array of 8 and random number - Math.Random()*0.8

*/	
	private String name;
	private int runscoredperballandoutcomeperballinaOver;
	private int overbowlingnumberofballs;//6 balls per over

	/*
	name[0]="Kirat Boli";
	name[1]="N.S. Nodhi";
	name[2]="R Rumrah";
	name[3]="Shashi Henra";
	*/
	
	private void setName(String Bowlername)
	{
		name=Bowlername;	
	}

	private String getname()
	{
		return name;	
	}
	
	public void printScore(int option, int runsscored, int wickets, int batsmanflag) {
		
		if (batsmanflag==1) {
			System.out.println("bowler "+ option +"bowling. A ball is bowled. Batsman 1 is batting");
			System.out.println("The Score is - "+Match.Currentscore +"runs and "+ Match.Currentwickets + " wickets");
		} else if (batsmanflag==2) {
			System.out.println("bowler "+ option +"bowling. A ball is bowled. Batsman 2 is batting");
			System.out.println("The Score is - "+Match.Currentscore +"runs and "+ Match.Currentwickets + " wickets");
		} 
		if ((Match.Currentscore>=40) && (Match.Currentwickets<3) && (Match.ballsbowled<=36)) {
			System.out.println("Lengaburu wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.exit(0);
		} else if ((Match.Currentscore==40) && (Match.Currentwickets<=3) && (Match.ballsbowled<=36)) {
			System.out.println("ITS A TIE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.exit(0);
		} else if ((Match.Currentscore<40) && (Match.Currentwickets>=3) && (Match.ballsbowled<=36)) {
			System.out.println("Enchai Wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.exit(0);
		}
	}
	
	public int[] Matchplayball(int[] bowleroutcome, int overorderforeverybowler, int cntr, int bowler, int matchesplayed) {

		String Commentary="";
		int runsscored=0;
		int equationmatchscorerunsscoredwicketstakenwicketsremaining[]=new int[2];

		int matchscore=0;
		int wickets=0;
		int wicketstakenflag=0;
		int equationmatchscorerunsscored=40; // read from properties file
		int equationwicketstakenwicketsremaining=3;
		int i=0;
		int j=0;
		int overnumber[]=new int[4];
		int scoreandwicketsforover[]=new int[12]; //do read from properties file
		int option;
		option=bowler;
		
		/*for(i=0;i<4;i++) {
			overnumber[i]=Match.Currentmatchbowlerordersequence[i];
		}*/
			if (matchesplayed>0) {
				scoreandwicketsforover= readbowlersequence(overorderforeverybowler, bowleroutcome, matchesplayed); //Async -to read from generated file
			} else {
				scoreandwicketsforover= bowleroutcome;//Sync
			}
			
			int jcntr;
			jcntr=0;
			j=matchesplayed*6;
			int jcntrlength;
			jcntrlength=0;
			jcntrlength=j+6;
			int batsmanflag;
			batsmanflag=1;
			
			for (jcntr=j;jcntr<jcntrlength;jcntr++) {
				if (scoreandwicketsforover[jcntr]==0) {
					runsscored=runsscored+0;
					Match.Currentscore=Match.Currentscore+0;
					batsmanflag=1;
					equationmatchscorerunsscored=equationmatchscorerunsscored-0;
				printScore(option,runsscored,wickets,batsmanflag);
				}
				else if(scoreandwicketsforover[jcntr]==1) { 
					runsscored=runsscored+1;
					Match.Currentscore=Match.Currentscore+1;
					batsmanflag=2;
					equationmatchscorerunsscored=equationmatchscorerunsscored-1;
				printScore(option,runsscored,wickets,batsmanflag);
				}
				else if(scoreandwicketsforover[jcntr]==2) {
					runsscored=runsscored+2;
					Match.Currentscore=Match.Currentscore+2;
					batsmanflag=1;
					equationmatchscorerunsscored=equationmatchscorerunsscored-2;
				printScore(option,runsscored,wickets,batsmanflag);
				}
				else if(scoreandwicketsforover[jcntr]==3) {
					runsscored=runsscored+3;
					Match.Currentscore=Match.Currentscore+3;
					batsmanflag=2;
					equationmatchscorerunsscored=equationmatchscorerunsscored-3;
				printScore(option,runsscored,wickets,batsmanflag);
				}
				else if(scoreandwicketsforover[jcntr]==4) {
					runsscored=runsscored+4;
					Match.Currentscore=Match.Currentscore+4;
					batsmanflag=1;
					equationmatchscorerunsscored=equationmatchscorerunsscored-4;
				printScore(option,runsscored,wickets,batsmanflag);
				}
				else if(scoreandwicketsforover[jcntr]==5) {
					runsscored=runsscored+5;
					Match.Currentscore=Match.Currentscore+5;
					batsmanflag=2;
					equationmatchscorerunsscored=equationmatchscorerunsscored-5;
				printScore(option,runsscored,wickets,batsmanflag);
				}
				else if(scoreandwicketsforover[jcntr]==6) {
					runsscored=runsscored+6;
					Match.Currentscore=Match.Currentscore+6;
					batsmanflag=1;
					equationmatchscorerunsscored=equationmatchscorerunsscored-6;
				printScore(option,runsscored,wickets,batsmanflag);
				}
				else if(scoreandwicketsforover[jcntr]==-1) {
					wickets=wickets+1;
					Match.Currentwickets=Match.Currentwickets+1;
					batsmanflag=2;
					equationwicketstakenwicketsremaining=equationwicketstakenwicketsremaining-1;
				wicketstakenflag=1;
				printScore(option,runsscored,wickets,batsmanflag);
				}
				Match.ballsbowled=Match.ballsbowled+1;
			}	//for 1 over	
			
			if ((wicketstakenflag==1) && (Match.Currentwickets<3)) {
				equationmatchscorerunsscoredwicketstakenwicketsremaining[1]=Match.Currentwickets+equationmatchscorerunsscoredwicketstakenwicketsremaining[1];
			} else if (Match.Currentscore<40){
				equationmatchscorerunsscoredwicketstakenwicketsremaining[0]=Match.Currentscore+equationmatchscorerunsscoredwicketstakenwicketsremaining[0];
			}
			
			if ((Match.ballsbowled>=36) && (Match.Currentwickets<3) && (Match.Currentscore>=40)) {
				System.out.println("Match ends -- Lengaburu wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.exit(0);
			}
			
		//return false or true to indicate -- match should be continued or stopped - win or lose
		return equationmatchscorerunsscoredwicketstakenwicketsremaining;
	}
	
	public int CheckEQCcheckequation(int Currentscore, int Currentwickets, int icntr){
		
		int result;
		result=0;
		int runs;
		runs=Match.Currentscore;
		int wickets;
		wickets=Match.Currentwickets;
		
		if ((Match.Currentscore>=40) && (Match.Currentwickets<3) && (icntr<=4) && (Match.ballsbowled>=36)) {
			System.out.println("Lengaburu wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			result=1;	
		} else if ((Match.Currentscore==40) && (Match.Currentwickets<3) && (icntr<=4) && (Match.ballsbowled>=36)) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!ITS A TIE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			result=0;	
		} else if ((Match.Currentscore>=40) && (Match.Currentwickets<3) && (icntr<=4) && (Match.ballsbowled>=36)) {
			System.out.println("Lengaburu Wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			result=1;	
		} else if ((Match.Currentscore<40) && (Match.Currentwickets>=3) && (icntr<=4) && (Match.ballsbowled>=36)) {
			System.out.println("Enchai Wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			result=2;	
		} else if ((Match.Currentscore<40) && (Match.Currentwickets<=3) && (icntr<=4) && (Match.ballsbowled>=36)) {
			System.out.println("Enchai Wins!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			result=2;	
		}
		
		return result;

	}			

	
	//public int[] Matchgeneratebbowlersovers(int bowler, int over) {
	public int[] Matchgeneratebbowlersovers(int bowler, int over, int matchesplayed) {
		
		//int commentary = generatecommentary(bowlername, over);
		int  bowlingprowess[];
		double orderofrunscoredperballandoutcomeperballinaOver;
		/*	Player		dot ball	1 	2	3 	4	5	6	out
		Kirat Boli 		5			30	25	10	15	1	9	5
		N.S Nodhi		10			40	20	5	10	1 	4	10
		R Rumrah		20			30	15	5	5	1 	4	20
		Shashi Henra	30			25	5	0	5	1	4	30
	*/	
		int outcome[] = new int[3600];
	
	//orderofrunscoredperballandoutcomeperballinaOver=Math.random()*0.8*100;
		
		int bowlingcntr;
		bowlingcntr=1;
		
		double randombowlingoutcome;
		int seed;
		seed=8;

		int countersofbowler1[]={5,30,25,10,15,1,9,5};
		int countersofbowler2[]={10,40,20,5,10,1,4,10};
		int countersofbowler3[]={20,30,15,5,5,1,4,20};
		int countersofbowler4[]={30, 25,5,0,5,1,4,30};

		
		int passrunningover;
		passrunningover=over;
		
		/*
		 * int bowler1cntr[]={0,45,270,225,90,135,9,81,45}; int
		 * bowler2cntr[]={0,90,360,180,45,90,9,36,90}; int
		 * bowler3cntr[]={0,180,270,135,45,45,9,36,180}; int
		 * bowler4cntr[]={0,270,225,45,0,45,9,36,270};
		 */
		
		int bowlerselected[]= new int[9];
		//how to initialize bowlerselected

		int i;
		i=1;
		System.out.println("bowler -"+bowler);
		
		if (bowler==0){ //"Kirat Boli")) {
			for(i=0;i<=8;i++) {
				bowlerselected[i]=Bowlers.bowler1cntr[i];
			}
		} else if (bowler==1){//("N. S Nodhi")) {
			for(i=0;i<=8;i++) {
				bowlerselected[i]=Bowlers.bowler2cntr[i];
			}
		} else if (bowler==2){//("R Rumrah")) {
			for(i=0;i<=8;i++) {
				bowlerselected[i]=Bowlers.bowler3cntr[i];
			}
		} else if (bowler==3){//("Shashi Henra")) {
			for(i=0;i<=8;i++) {
				bowlerselected[i]=Bowlers.bowler4cntr[i];
			}
		}
		
		/******
		double bowlingcountergen;
		double randomnumbergen;
		*******/
		
		int bowlercntr;
		bowlercntr=1;
		
		/*****************
		long seedrandom;
		seedrandom = 3600; //make it 3600 for 4 bowlers 900 balls each to maintain random number like sequence
		double randomgenerated;
		
		Random generator = new Random(seedrandom);
		****************/
		int cntr;
		cntr=0;
		// bowler 1 sequence
		//static int cntr1, cntr2,cntr3, cntr4, cntr5, cntr6, cntr7, cntr8;
		String score;
		score="";
		
		score="<score>"+"<bowler>"+bowler+"</bowler>";
		
		String source;
		source="D:\\kirkaet\\MatchStatsandmatchstatistics.txt";
		
		int wickets;
		wickets=0;
		int matchscore;
		matchscore=0;
		int oversbowled;
		oversbowled=0;
		oversbowled=over;
		
		score=score+"<over>";
		
		//public static int cntr1=bowler1cntr[1];
		GenerateRandomNumber genRandomNumber = new GenerateRandomNumber();
		
		while (bowlercntr<=12) { //900
			/****************
			randomgenerated = generator.nextDouble();
			System.out.println("randomgenerated - "+randomgenerated);
			randomnumbergen=randomgenerated*100;
			System.out.println("randomnumbergen - "+randomgenerated);
			bowlingcntr = (int)randomnumbergen;//TO GENERATE RANDOM ORDER OF SCORE
			System.out.println("int randomnumber - "+bowlingcntr);
			*****/
			if (matchesplayed>0) {
				
			} else {
				bowlingcntr = genRandomNumber.generateRandomNumber();//TO GENERATE RANDOM ORDER OF SCORE
			}
			if ((bowlercntr>=6) && ((bowlercntr%6)==0)){//increment overs by 1

				oversbowled=oversbowled+1;
				score=score+oversbowled+"</over>";

			}
			
					if (bowlingcntr>=0 && bowlingcntr<12.5) {
						cntr=bowlerselected[1];
						if (cntr>0){
							outcome[bowlercntr]=0;//dot ball
							cntr=cntr-1;
							bowlerselected[1]=bowlerselected[1]-1;
						}
						//matchscore=matchscore+0;
						score=score+"<ball>"+bowlercntr+"</ball>";
						score=score+"<rorwoutcomeresult>"+0+"</rorwoutcomeresult>"; //runorwicketoutcomeresult
						} else if (bowlingcntr>=12.5 && bowlingcntr<25) {
							cntr=bowlerselected[2];
							//cntr=cntr-1;
							if (cntr>0){
								outcome[bowlercntr]=1;//1 run
								cntr=cntr-1;
								bowlerselected[2]=bowlerselected[2]-1;
							}
							//matchscore=matchscore+1;
							score=score+"<ball>"+bowlercntr+"</ball>";
							score=score+"<rorwoutcomeresult>"+1+"</rorwoutcomeresult>";
						} else if (bowlingcntr>=25 && bowlingcntr<37.5) {
							cntr=bowlerselected[3];
							//cntr=cntr-1;
							if (cntr>0){
								outcome[bowlercntr]=2;//2 run
								cntr=cntr-1;
								bowlerselected[3]=bowlerselected[3]-1;
							}
							//matchscore=matchscore+2;
							score=score+"<ball>"+bowlercntr+"</ball>";
							score=score+"<rorwoutcomeresult>"+2+"</rorwoutcomeresult>";
						} else if (bowlingcntr>=37.5 && bowlingcntr<50) {
							cntr=bowlerselected[4];
							//cntr=cntr-1;
							if (cntr>0){
								outcome[bowlercntr]=3;//3 run
								cntr=cntr-1;
								bowlerselected[4]=bowlerselected[4]-1;
							}
							//matchscore=matchscore+3;
							score=score+"<ball>"+bowlercntr+"</ball>";
							score=score+"<rorwoutcomeresult>"+3+"</rorwoutcomeresult>";				
						} else if (bowlingcntr>=50 && bowlingcntr<62.5) {
							cntr=bowlerselected[5];
							//cntr=cntr-1;
							if (cntr>0){
								outcome[bowlercntr]=4;//4 run
								cntr=cntr-1;
								bowlerselected[5]=bowlerselected[5]-1;
							}
							//matchscore=matchscore+4;
							score=score+"<ball>"+bowlercntr+"</ball>";
							score=score+"<rorwoutcomeresult>"+4+"</rorwoutcomeresult>";				
						} else if (bowlingcntr>=62.5 && bowlingcntr<75) {
							cntr=bowlerselected[6];
							//cntr=cntr-1;
							if (cntr>0){
								outcome[bowlercntr]=5;//5 run
								cntr=cntr-1;
								bowlerselected[6]=bowlerselected[6]-1;
							}
							//matchscore=matchscore+5;
							score=score+"<ball>"+bowlercntr+"</ball>";
							score=score+"<rorwoutcomeresult>"+5+"</rorwoutcomeresult>";				
						} else if (bowlingcntr>=75 && bowlingcntr<87.5) {
							cntr=bowlerselected[7];
							//cntr=cntr-1;
							if (cntr>0){
								outcome[bowlercntr]=6;//6 run
								cntr=cntr-1;
								bowlerselected[7]=bowlerselected[7]-1;
							}
							//matchscore=matchscore+6;
							score=score+"<ball>"+bowlercntr+"</ball>";
							score=score+"<rorwoutcomeresult>"+6+"</rorwoutcomeresult>";				
						} else if (bowlingcntr>=87.5 && bowlingcntr<100) {
							cntr=bowlerselected[8];
							//cntr=cntr-1;
							if (cntr>0){
								outcome[bowlercntr]=-1;//1 wicket
								cntr=cntr-1;
								bowlerselected[8]=bowlerselected[8]-1;
							}
							//wickets=wickets+1;
							score=score+"<ball>"+bowlercntr+"</ball>";
							score=score+"<rorwoutcomeresult>"+-1+"</rorwoutcomeresult>";
						}
			
			
			bowlercntr=bowlercntr+1;

		}

		score=score+"</score>";
		
		writematchstatisticsandoversforbowler(bowler, oversbowled, score, outcome);

		return outcome;
	}
	
	
	public void writematchstatisticsandoversforbowler(int bowler, int overbeingbowled, String score, int[] matchsequenceoutcome) {

		//PrintWriter outtest1= null;
		
		//write in file
/*		String workoutputfilestr = "C:\\Webserver\\Outputfileexcelsheet.csv";
		String counterfilecntr = "C:\\Webserver\\cntrfile_cntrfile.txt";
		String tempfiletmp = "C:\\Webserver\\tempfile_tmpfile.txt";
*/		
		
		int over;
		
		//String score;
		//score="";
		
		String sequencepatternstrfile;
		sequencepatternstrfile="";
		
		int int_counter_read_read;
		int_counter_read_read=0;
		//read the input sequence and pattern, if not null make it as 1
		
		int cntr_ctr;
		cntr_ctr=0;
		
		int cntrflag;
		cntrflag=0;
		int CurrentMatchOvericntr;
		CurrentMatchOvericntr=1;
		//CurrentMatchOvericntr=over;
		
	    File file =new File("C:\\kirkaet\\bowler"+bowler+"sequenceandpatternfile.txt");

	    try {

	    	FileWriter fw = new FileWriter(file,true);
		  	BufferedWriter bw = new BufferedWriter(fw);
		  	PrintWriter pw = new PrintWriter(bw);

		      if(!file.exists()){
		  	 	file.createNewFile();
		  	  }
	      
	  	  //normalize it to 900 balls for a bowler 
	  	  //Bowlingprogrambowlers_Bprgb bowlersprogrammatchgeneratebowlingsequence = new Bowlingprogrambowlers_Bprgb();
	  	  
				//score=score+"</score>";
				pw.print(score);
				pw.close();

	      } catch (IOException e) {
	  		  e.printStackTrace();
	  	  }
	      
	//return outcome;
	
	}
	
	public int[] readbowlersequence(int bowler, int[] bowleroutcome, int matchesplayed){
		//read from properties file - //do
		int oversbowled;
		//int matchesplayed;
		oversbowled=0;
		
		int counter;
		counter=0;
		
		counter=bowler;
		
		String bowlersequence;
		//check match statistics
		int overnumber[] = new int[4];//read from MatchStatsmatchstatistics.txt

		//matchesplayed=Match.matchesplayed;
		oversbowled=matchesplayed;
		
		int i;
		i=0;
		
		//do generate order of bowlers by reading from dest file as per this order
		for(i=0;i<4;i++) {
			overnumber[i]=Match.Currentmatchbowlerordersequence[i];//read from properties file or its equal to matchesplayed assuming 1 over for each bowler
		}
		
		int scoreandwickets[]=new int[12];//do read from properties

		String bowlersourceinput;
		bowlersourceinput="";
		bowlersourceinput="bowler"+bowler+"sequenceandpatternfile.txt";

		if (matchesplayed>0) {
			scoreandwickets=readbowleroverfromfilegenerateover(bowler, bowlersourceinput, oversbowled, matchesplayed);
		} else {
			scoreandwickets=bowleroutcome;
		}

		try {
	    String dest;
	    dest="";
	    dest ="C:\\kirkaet\\match"+matchesplayed+"matchresultscore.txt";
	    
	    File matchresultscorefile = new File(dest); //dest

	    FileWriter fwmrsfp = new FileWriter(matchresultscorefile,true);
	  	BufferedWriter bwmrsfp = new BufferedWriter(fwmrsfp);
	  	PrintWriter pwmrsfp = new PrintWriter(bwmrsfp);

	        if(!matchresultscorefile.exists()){
	    	  matchresultscorefile.createNewFile();
		  }
	        
	        String scoreoutcome;
	        String runsorwicketoutcome;
	        runsorwicketoutcome="";
	        scoreoutcome="<match><score>";
	        scoreoutcome="<bowler>"+bowler+"<bowler>";
	        int j;
	        int jcntr;
	        j=0;
	        jcntr=matchesplayed*6;
	        for(jcntr=j;jcntr<j;jcntr++) {
	        	runsorwicketoutcome="<runsorwicketoutcome>"+scoreandwickets[j]+"</runsorwicketoutcome>";
	        	j++;
	        }
	        scoreoutcome=scoreoutcome+runsorwicketoutcome+"<match/></score>";
	        pwmrsfp.print(scoreoutcome);
	        pwmrsfp.close();

	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		//generate bowler sequence
		//bowlersequence = 
		
		int currentgenerateMatchoverssequencecntr;
		currentgenerateMatchoverssequencecntr=matchesplayed;
		
		
		return scoreandwickets;
	}
	
	
	//read from genrated random numbers
	public int[] readbowleroverfromfilegenerateover(int bowler, String dest, int overnumber, int matchesplayed) {
		
		
		//dest bowler file where the random bowling sequence is generated
		//hardcoding the sequence pattern
		String bowlercntrfilesourcenoorplayBallMatchComeon = "bowler"+bowler+"sequenceandpatternfile.txt";	
		
		File cntr_f = new File(bowlercntrfilesourcenoorplayBallMatchComeon);
		
		File cntrNew_f = new File(bowlercntrfilesourcenoorplayBallMatchComeon);

		int scoreint_cntr_read_read[]=new int[6];
	
		int int_cntr_read_read;
		int_cntr_read_read=0;
		
		int cntr_read_readflag;
		cntr_read_readflag=0;
	
		int int_cntr_read_write_flag;
		int_cntr_read_write_flag=0;
	
	if (cntr_f.exists()) {
		
	try {
			StringBuilder cntrcontentBuilder = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader(bowlercntrfilesourcenoorplayBallMatchComeon));
			try {

				String scntrCurrentLine = null;
				while ((scntrCurrentLine = br.readLine()) != null) {
					cntrcontentBuilder.append(scntrCurrentLine);
					cntr_read_readflag=1;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			br.close();

			String cntr_read_read = null;
			cntr_read_read = cntrcontentBuilder.toString();
			System.out.println("cntr_read_read -" + cntr_read_read);			
			
			String regex = "";
			regex = "<over>"+ overnumber;

			int positionstartarray[] = new int[30000];//read number of overs in match from Match statistics static class
			int positionendarray[] = new int[30000];
			
		    try {

			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(cntr_read_read);
			System.out.println("cntr_read_read - " + cntr_read_read);
			int x;
			x=0;
			
			while (m.find()) {

				positionstartarray[x] = m.start(); // <counter> -- //bowler1cntr
				System.out.println("positionstartarray -" + positionstartarray[x]);

				System.out.println("positionstartarray - " + positionstartarray[x]);
		    	
				x = x + 1;

			}
			
            System.out.println("Pattern created: "+p.pattern());
        } catch (PatternSyntaxException ex) {
            System.out.println("This string could not compile: "+ex.getPattern());
            System.out.println(ex.getMessage());
        }
		    
		    
			String regexxmlend = "";
			regexxmlend = "</over>";

			int y;
			y=0;

		    try {			
		    	
			
			Pattern pclose = Pattern.compile(regexxmlend);
			Matcher mclose = pclose.matcher(cntr_read_read);
			System.out.println("cntr_read_read - " + cntr_read_read);
		
			while (mclose.find()) {

				positionendarray[y] = mclose.end()+1; // <counter> -- //bowler1cntr
				System.out.println("positionendarray -" + positionendarray[y]);

				y = y + 1;

			}
			
            System.out.println("Pattern created: "+pclose.pattern());

		    } catch (PatternSyntaxException ex) {
	            System.out.println("This string could not compile: "+ex.getPattern());
	            System.out.println(ex.getMessage());
	        }
		    
			String ballandrunscounterpropertystring;
			ballandrunscounterpropertystring="";
			int k;
			k=0;
			k=matchesplayed; //number of overs bowled
			//read the <ball> and <rorwoutcomeresult> result data into an array
			ballandrunscounterpropertystring=cntr_read_read.substring(positionendarray[k],positionstartarray[k+1]-1);

			int xcntr;
			xcntr=0;

//			while (xcntr<=6) {
			int positionstartarrayballsandruns[] = {0,0,0,0,0,0};//read the runs scored or wickets taken

				String regexballsandruns="";
				xcntr=xcntr+1;//balls
				regexballsandruns = "<rorwoutcomeresult>";
			    try {
	
				Pattern pballsandruns = Pattern.compile(regexballsandruns);
				Matcher mballsandruns = pballsandruns.matcher(ballandrunscounterpropertystring);
				System.out.println("ballandrunscounterpropertystring - " + ballandrunscounterpropertystring);
				
				while (mballsandruns.find() && xcntr<6) {
	
					positionstartarrayballsandruns[xcntr] = mballsandruns.end()+1; // <counter> -- //bowler1cntr
					System.out.println("positionstartarrayballsandruns -" + positionstartarrayballsandruns[xcntr]);
	
					System.out.println("positionstartarrayballsandruns - " + positionstartarrayballsandruns[xcntr]);
			    	
					xcntr = xcntr + 1;
	
				}

	            System.out.println("Pattern created: "+pballsandruns.pattern());
		        } catch (PatternSyntaxException ex) {
		            System.out.println("This string could not compile: "+ex.getPattern());
		            System.out.println(ex.getMessage());
		        }				
				int positionendarrayarrayballsandruns[] = {0,0,0,0,0,0};
				int ycntr;
				ycntr=0;
				String regexballsandrunsend="";
				ycntr=ycntr+1;//balls
				regexballsandrunsend = "</rorwoutcomeresult>";
				
			    try {
			    		   
					Pattern pballsandrunsend = Pattern.compile(regexballsandruns);
					Matcher mballsandrunsend = pballsandrunsend.matcher(ballandrunscounterpropertystring);
					System.out.println("ballandrunscounterendpropertystring - " + ballandrunscounterpropertystring);
					
					while (mballsandrunsend.find() && ycntr<6) {
		
						positionendarrayarrayballsandruns[ycntr] = mballsandrunsend.start()-1; // <counter> -- //bowler1cntr
						System.out.println("positionendarrayarrayballsandruns -" + positionendarrayarrayballsandruns[ycntr]);
		
						System.out.println("positionendarrayarrayballsandrunss - " + positionendarrayarrayballsandruns[ycntr]);
				    	
						ycntr = ycntr + 1;
		
					}

		            System.out.println("Pattern created: "+pballsandrunsend.pattern());
		            
			    } catch (PatternSyntaxException ex) {
		            System.out.println("This string could not compile: "+ex.getPattern());
		            System.out.println(ex.getMessage());
		        }
			int zcntr;
			zcntr=0;
			String runsorwicketandrunscounterproperty;
			runsorwicketandrunscounterproperty ="";			

			while (zcntr<6) {

				runsorwicketandrunscounterproperty=ballandrunscounterpropertystring.substring(positionstartarrayballsandruns[zcntr],positionendarrayarrayballsandruns[zcntr]-1);
				
				if (cntr_read_readflag==1) {
					scoreint_cntr_read_read[zcntr]= Integer.parseInt(runsorwicketandrunscounterproperty);						
				}else {
					scoreint_cntr_read_read[zcntr]=0;
				}
				zcntr=zcntr+1;
			}
	} catch (Exception e) {
		e.printStackTrace();	
	}
	
	} //end if cntr_f "bowler"+bowler+"sequenceandpatternfile.txt" file exists
	
		return scoreint_cntr_read_read;
		
		
	}

	
	
	
}
