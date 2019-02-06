package com.testing.ahmed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.testing.ahmed.Bowlingprogrambowlers_Bprgb.Match;

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
	
	public static class Match {
		
		static String Matchstatistics="C:\\kirkaet\\MatchStatsmatchstatistics.txt";
		static int matchesplayed=0;
		static int oversbowledbyeverybowlerinthematch[]={0,0,0,0};
		static int Currentmatchbowlerordersequence[]= {1,2,3,4};
		
		
		public void intitializeMatch() {
			matchesplayed=Bowlingprogrambowlers_Bprgb.readcounterfromfile("Match", Matchstatistics);
			int i;
			i=0;
			for(i=1;i<=4;i++) {
				oversbowledbyeverybowlerinthematch[i]=Bowlingprogrambowlers_Bprgb.readcounterfromfile("oversbowled"+i, Matchstatistics);
			}
		}

		
		//TWO COUNTERS - Match
		// AND oversbowled-i
	}

	
	
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
	
	public int[] Matchplayball(int overorderforeverybowler,int cntr) {

		String Commentary="";
		int runsscored=0;
		int equationmatchscorerunsscoredwicketstakenwicketsremaining[]=new int[2];
		
		int matchscore=0;
		int wickets=0;
		int wicketstakenflag=0;
		int equationmatchscorerunsscored=37;
		int equationwicketstakenwicketsremaining=4;
		int i=0;
		int j=0;
		int overnumber[]=new int[4];
		int scoreandwicketsforover[]=new int[6];
		for(i=0;i<4;i++) {
			overnumber[i]=Match.Currentmatchbowlerordersequence[i];
			scoreandwicketsforover= readbowlersequence(overorderforeverybowler);
			
			//PlayBallPlayMatchMatchStatistics.statisticsbowlerover=scoreandwicketsforover;//write statistics to file
			//writematchstatistics(scoreandwicketsforover, Match.matchesplayed);
			
			
			for (j=0;j<6;j++) {
				if (scoreandwicketsforover[j]==0) 
					runsscored=runsscored+0;
				else if(scoreandwicketsforover[j]==1) 
					runsscored=runsscored+1;
				else if(scoreandwicketsforover[j]==2) 
					runsscored=runsscored+2;
				else if(scoreandwicketsforover[j]==3) 
					runsscored=runsscored+3;
				else if(scoreandwicketsforover[j]==4) 
					runsscored=runsscored+4;
				else if(scoreandwicketsforover[j]==5) 
					runsscored=runsscored+5;
				else if(scoreandwicketsforover[j]==6) 
					runsscored=runsscored+6;
				else if(scoreandwicketsforover[j]==-1) {
					wickets=wickets+1;
				wicketstakenflag=1;
				}
			}		
			
			if ((wicketstakenflag==1) && wickets<4) {
				equationmatchscorerunsscoredwicketstakenwicketsremaining[1]=wickets+equationmatchscorerunsscoredwicketstakenwicketsremaining[1];
			} else if (runsscored<=37){
				equationmatchscorerunsscoredwicketstakenwicketsremaining[0]=runsscored+equationmatchscorerunsscoredwicketstakenwicketsremaining[0];
			}
			
		}
		
		//return false or true to indicate -- match should be continued or stopped - win or lose
		return equationmatchscorerunsscoredwicketstakenwicketsremaining;
	}
	
	
	//public int[] Matchgeneratebbowlersovers(int bowler, int over) {
	public void Matchgeneratebbowlersovers(int bowler, int over) {
		
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
		
		if (bowler==1){ //"Kirat Boli")) {
			for(i=0;i<=8;i++) {
				bowlerselected[i]=Bowlers.bowler1cntr[i];
			}
		} else if (bowler==2){//("N. S Nodhi")) {
			for(i=0;i<=8;i++) {
				bowlerselected[i]=Bowlers.bowler2cntr[i];
			}
		} else if (bowler==3){//("R Rumrah")) {
			for(i=0;i<=8;i++) {
				bowlerselected[i]=Bowlers.bowler3cntr[i];
			}
		} else if (bowler==4){//("Shashi Henra")) {
			for(i=0;i<=8;i++) {
				bowlerselected[i]=Bowlers.bowler4cntr[i];
			}
		}
		
		double bowlingcountergen;
		double randomnumbergen;
		int bowlercntr;
		bowlercntr=1;
		
		long seedrandom;
		seedrandom = 3600; //make it 3600 for 4 bowlers 900 balls each to maintain random number like sequence
		double randomgenerated;
		
		Random generator = new Random(seedrandom);
		int cntr;
		cntr=0;
		// bowler 1 sequence
		//static int cntr1, cntr2,cntr3, cntr4, cntr5, cntr6, cntr7, cntr8;
		String score;
		
		score="<score>"+"<bowler>"+bowler+"</bowler>";
		
		String source;
		source="C:\\kirkaet\\cntrfile_cntrfile.txt";
		
		int wickets;
		wickets=0;
		int matchscore;
		matchscore=0;
		int oversbowled;
		oversbowled=1;
		
		score=score+"<over>";
		
		//public static int cntr1=bowler1cntr[1];

		while (bowlercntr<=900) { //900
			randomgenerated = generator.nextDouble();
			System.out.println("randomgenerated - "+randomgenerated);
			randomnumbergen=randomgenerated*100;
			System.out.println("randomnumbergen - "+randomgenerated);
			bowlingcntr = (int)randomnumbergen;//TO GENERATE RANDOM ORDER OF SCORE
			System.out.println("int randomnumber - "+bowlingcntr);

			
			if ((bowlingcntr>=6) && ((bowlingcntr%6)==0)){

				score=score+oversbowled+"</over>";
				oversbowled=oversbowled+1;
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
			
			score=score+"</score>";
			writematchstatisticsandoversforbowler(bowler, score, outcome);

		}

		
	}
	
	
	public void writematchstatisticsandoversforbowler(int bowler, String score, int[] matchsequenceoutcome) {

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
	  	  
				score=score+"</score>";
				pw.print(score);
				pw.close();

	      } catch (IOException e) {
	  		  e.printStackTrace();
	  	  }
	      
	//return outcome;
	
	}
	
	public int[] readbowlersequence(int bowler){
		//read from properties file - // todo
		int oversbowled;
		int matchesplayed;
		oversbowled=0;
		matchesplayed=0;
		
		int counter;
		counter=0;
		
		counter=bowler;
		
		String bowlersequence;
		//check match statistics
		int overnumber[] = new int[4];//read from MatchStatsmatchstatistics.txt

		matchesplayed=Match.matchesplayed;
		oversbowled=matchesplayed;
		
		int i;
		i=0;
		
		//todo generate order of bowlers by reading from dest file as per this order
		for(i=0;i<4;i++) {
			overnumber[i]=Match.Currentmatchbowlerordersequence[i];
		}
		
		int scoreandwickets[]=new int[6];

		String dest;
		dest="";
		dest="bowler"+bowler+"sequenceandpatternfile.txt";
		scoreandwickets=readbowleroverfromfilegenerateover(bowler, dest, matchesplayed);
		
		//generate bowler sequence
		//bowlersequence = 
		
		int currentgenerateMatchoverssequencecntr;
		currentgenerateMatchoverssequencecntr=matchesplayed;
		
		
		return scoreandwickets;
	}
	
	
	
	public int[] readbowleroverfromfilegenerateover(int bowler, String dest, int overnumber) {
		
		
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

			int positionstartarray[] = new int[900];//read number of overs in match from Match statistics static class
			int positionendarray[] = new int[900];
			
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
			k=Match.matchesplayed; //number of overs bowled
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

	//read counter
	public static int readcounterfromfile(String patternmatch, String cntrfilesourcenoorlightplayBallMatch) {
		
		String counterfilecntr = "C:\\kirkaet\\cntrfile_cntrfile.txt";	
		
		File cntr_f = new File(cntrfilesourcenoorlightplayBallMatch);
		
		File cntrNew_f = new File(cntrfilesourcenoorlightplayBallMatch);
	
		int int_cntr_read_read;
		int_cntr_read_read=0;
		
		int cntr_read_readflag;
		cntr_read_readflag=0;
	
		int int_cntr_read_write_flag;
		int_cntr_read_write_flag=0;
	
	if (cntr_f.exists()) {
		
	try {
			StringBuilder cntrcontentBuilder = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader(cntrfilesourcenoorlightplayBallMatch));
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
			regex = "<"+ patternmatch +">";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(cntr_read_read);
			System.out.println("cntr_read_read - " + cntr_read_read);
			int x;
			int y;
			x=0;
			y=0;
			
			int positionstartarray = 0;
			int positionendarray = 0;
			while (m.find()) {

				positionstartarray = m.start() + regex.length()-1; // <counter> -- //bowler1cntr
				System.out.println("positionstartarray -" + positionstartarray);

				System.out.println("positionstartarray - " + positionstartarray);
		    	
				x = x + 1;

			}
			
			
			String regexxmlend = "";
			regexxmlend = "</"+ patternmatch +">";
			Pattern pclose = Pattern.compile(regexxmlend);
			Matcher mclose = pclose.matcher(cntr_read_read);
			System.out.println("cntr_read_read - " + cntr_read_read);
		
			while (mclose.find()) {

				positionendarray = mclose.start()-1; // <counter> -- //bowler1cntr
				System.out.println("positionendarray -" + positionendarray);

				y = y + 1;

			}
			
			String counterproperty;
			counterproperty="";
			
			counterproperty=cntr_read_read.substring(positionstartarray,positionendarray);
			
			if (cntr_read_readflag==1) {
				int_cntr_read_read= Integer.parseInt(counterproperty);						
			}else {
				int_cntr_read_read =0;
			}
			//int_cntr_read_read=int_cntr_read_read-1; //decrement counter by 1 till its greater than 0
	
	
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
	
	return int_cntr_read_read;
	
	}
	
	//write counter to file and return success - true or false -
	public boolean writecountertofile(String counter, String dest) {
	
	String counterfilecntr = "C:\\Webserver\\cntrfile_cntrfile.txt";	
	
	File cntr_f = new File(counterfilecntr);
	
	File cntrNew_f = new File(counterfilecntr);

	int cntr_read_readflag;
	cntr_read_readflag=0;

	int int_cntr_read_write_flag;
	int_cntr_read_write_flag=0;
	
	if (cntr_f.exists()) {
		
		try {
			StringBuilder cntrcontentBuilder = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader(counterfilecntr));
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
			int int_cntr_read_read =0;
			cntr_read_read = cntrcontentBuilder.toString();
			System.out.println("cntr_read_read -" + cntr_read_read);			
			
			String regex = "";
			regex = "<"+ counter +">";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(cntr_read_read);
			System.out.println("cntr_read_read - " + cntr_read_read);
			int x;
			int y;
			x=0;
			y=0;
			
			int positionstartarray = 0;
			int positionendarray = 0;
			while (m.find()) {

				positionstartarray = m.start() + counter.length()+2; // <counter> -- //bowler1cntr
				System.out.println("positionstartarray -" + positionstartarray);

				System.out.println("positionstartarray - " + positionstartarray);
		    	
				x = x + 1;

			}
			
			
			String regexxmlend = "";
			regex = "</"+ counter +">";
			Pattern pclose = Pattern.compile(regexxmlend);
			Matcher mclose = pclose.matcher(cntr_read_read);
			System.out.println("cntr_read_read - " + cntr_read_read);
		
			while (mclose.find()) {

				positionstartarray = mclose.start()-1; // <counter> -- //bowler1cntr
				System.out.println("positionendarray -" + positionendarray);

				System.out.println("positionendarray - " + positionendarray);
		    	
				y = y + 1;

			}
			
			String counterproperty;
			counterproperty="";
			
			counterproperty=cntr_read_read.substring(positionstartarray,positionendarray);
			
			if (cntr_read_readflag==1) {
				int_cntr_read_read= Integer.parseInt(counterproperty);						
			}else {
				int_cntr_read_read =0;
			}
			/******* DECREMENT COUNTER *********/
			int_cntr_read_read=int_cntr_read_read-1; //decrement counter by 1 till its greater than 0
	
	if (cntrNew_f.createNewFile()) {
		PrintWriter outcntrtestfile2 = new PrintWriter(counterfilecntr);
		outcntrtestfile2.print("<"+ counter +">"+int_cntr_read_read+"</"+ counter +">");
		int_cntr_read_write_flag=1;
		outcntrtestfile2.close();
	}
	
	
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
	if (int_cntr_read_write_flag==1) {
		return true;
	} else {
		return false;
	}
	
	}
	
	
	
	
}
