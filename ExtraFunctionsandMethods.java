package com.testing.ahmed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.testing.ahmed.PlayGame.Match;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Writer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class ExtraFunctionsandMethods {

	
	/*******
	//Match Statistic file = "c:\\kirkaet\\MatchStatsmatchstatistics.txt";
	
		//read counter
	
	//public int readcounterfromfile(String patternmatch, String cntrfilesourcenoorlightplayBallMatchfilepath) {
	public int readcounterfromfile(String patternmatch, String cntrfilesourcenoorlightplayBallMatchfilepath) {
		
		
		String str; 
		str="";
    	
		try { 
			
			 //File file = new File("D:\\Kirkaet\\MatchStatsandmatchstatistics.txt");  

			 Reader in = new FileReader(Match.Matchstatistics);
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


			String cntr_read_read;
			cntr_read_read = str;
			int cntr_read_readflag;
			cntr_read_readflag=0;
			int int_cntr_read_read;
			int_cntr_read_read=0;
			
			if (str.isEmpty()) {
				cntr_read_readflag=0;
			} else {
				cntr_read_readflag=0;
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
			
			String counterproperty;
			counterproperty="";
			
			counterproperty=cntr_read_read.substring(positionstartarray-1,positionendarray);
			System.out.println("counterproperty - "+patternmatch + "- "+counterproperty);
			
			if (counterproperty.isEmpty()) {
				int_cntr_read_read=-1;
			}else {
				int_cntr_read_read=Integer.parseInt(counterproperty);
			}
			
			//int_cntr_read_read=int_cntr_read_read-1; //decrement counter by 1 till its greater than 0
			System.out.println("counter read - "+patternmatch + " property - "+int_cntr_read_read);
			
		
		return int_cntr_read_read;
		
}	
	
	
	//write counter to file and return success - true or false -
	public boolean writecountertofile(String counter, String propertyfilepath, int inc) {
	
	File propertyfile= new File(propertyfilepath);
	
	//propertiesfile
	//Match Statistics file	"D:\\kirkaet\\MatchStatsandmatchstatistics.txt"
		
	File counterfilecntr = propertyfile;	
	
	File cntr_f = counterfilecntr;
	
	File cntrNew_f = counterfilecntr;
	File writecntr_f = new File(propertyfilepath);
	
	File writecntrNew_f =  new File(propertyfilepath);

	
	File writecounterfilecntrfile=new File (propertyfilepath);

	int cntr_read_readflag;
	cntr_read_readflag=0;

	int incordec;
	incordec=1; //1 means increment, -1 means decrement
	incordec=inc;
	
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

			String cntr_read_read ="";
			int int_cntr_read_read =0;
			cntr_read_read = cntrcontentBuilder.toString();
			System.out.println("cntr_read_read -" + cntr_read_read);			
			
			String regex = "";
			regex = "<"+ counter +">";
			int x;
			int y;
			x=0;
			y=0;
			
			int positionstartarray = 0;
			int positionendarray = 0;

			try {
				
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(cntr_read_read);
				System.out.println("cntr_read_read - " + cntr_read_read);
				if (m.find()) {
	
					positionstartarray = m.end()+1; // <counter> -- //bowler1cntr
					System.out.println("read function positionstartarray -" + positionstartarray);
	
					System.out.println("read function positionstartarray - " + positionstartarray);
			    	
					x = x + 1;
	
				}
			
			} catch (PatternSyntaxException pse) {
				pse.getMessage();
			}

			String regexxmlend = "";
			regexxmlend = "</"+ counter +">";
			try {
				Pattern pclose = Pattern.compile(regexxmlend);
				Matcher mclose = pclose.matcher(cntr_read_read);
				System.out.println("cntr_read_read - " + cntr_read_read);
			
				if (mclose.find()) {
	
					positionstartarray = mclose.start()-1; // <counter> -- //Match
					System.out.println("write function positionendarray -" + positionendarray);
	
					System.out.println("write function positionendarray - " + positionendarray);
			    	
					y = y + 1;
	
				}
			
			} catch (PatternSyntaxException pse) {
				pse.getMessage();
			}

			String counterproperty;
			counterproperty="";
			
			counterproperty=cntr_read_read.substring(positionstartarray,positionendarray);
			
			if (cntr_read_readflag==1) {
				int_cntr_read_read= Integer.parseInt(counterproperty);						
			}else {
				int_cntr_read_read =0;
			}
			int old_int_cntr_read_read;
			old_int_cntr_read_read=0;
			
			if (incordec==1) {
				old_int_cntr_read_read=int_cntr_read_read;
				int_cntr_read_read=int_cntr_read_read+1; //decrement counter by 1 till its greater than 0
			} else if (incordec==-1) {
				old_int_cntr_read_read=int_cntr_read_read;
				int_cntr_read_read=int_cntr_read_read-1; //decrement counter by 1 till its greater than 0
			} 
			String new_cntr_read_read;
			new_cntr_read_read="";
			String regexxmlcounterstr;
			regexxmlcounterstr="";
			regexxmlcounterstr="<"+ counter +">"+old_int_cntr_read_read+"</"+ counter +">";
			
			String replacement;
			replacement="";
			replacement="<"+ counter +">"+int_cntr_read_read+"</"+ counter +">";
			
			new_cntr_read_read=cntr_read_read.replaceFirst(regexxmlcounterstr, replacement);
			
			System.out.println("replace string is new_cntr_read_read -  "+new_cntr_read_read);
			System.out.println("write to file -  "+counterfilecntr);
			
			
			if (cntrNew_f.createNewFile()) {

				//FileWriter cntrfw = new FileWriter(counterfilecntrfile,true);
			  	//BufferedWriter cntrbw = new BufferedWriter(cntrfw);

				//PrintWriter outcntrtestfile2 = new PrintWriter(cntrbw);
				//outcntrtestfile2.print(new_cntr_read_read);
				writeFileUsingStream(new_cntr_read_read,propertyfilepath);
				
				int_cntr_read_write_flag=1;
				//outcntrtestfile2.close();
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
	
	
	// to write sno, mobilenumber, recrdstartarr, recrdendarray to String and then
	// to Printwriter out file
	public void writeFileUsingStream(String recrddatainput, String propertypath) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			// is = new FileInputStream(source);
			StringBuffer strbuffer = new StringBuffer(recrddatainput);
			// os = new FileOutputStream(dest2);
			File inputfilef = new File(propertypath);
			//FileWriter fw = new FileWriter(dest2);
			FileWriter fw = new FileWriter(inputfilef);			
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);

			byte[] buffer = new byte[1024];
			int length;
			// while ((length = strbuffer.toString().length()) > 0) {
			if ((length = strbuffer.toString().length()) > 0) {
				out.append(strbuffer.toString());

			}
			out.close();
			bw.close();
			fw.close();
		} finally {
			// is.close();
			// out.close();
			System.out.println("the file is closed in previous block");
		}
	}
	
	*******/
}
