package com.myproject.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoFinding {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MobileNoFinding MNC =new MobileNoFinding();
		MNC.findMobileNo();
	}

	private void findMobileNo() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sakthivel/Music/info.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int read=br.read();
		String mobile="";
		while(read!=-1) {
			char ch=(char)read;
			mobile=mobile+ch;
			read=br.read();
		}
		System.out.println(mobile);
		Pattern pat=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher mat=pat.matcher(mobile);
		while(mat.find())
		{
			//System.out.println(mat.group());
			mobile=mat.group();
		}
		System.out.println(mobile);
		File f2=new File("/home/sakthivel/Music/mobile.txt");
        FileWriter fw=new FileWriter(f2);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(mobile);
        bw.flush();
        bw.close();
		
	}

}
