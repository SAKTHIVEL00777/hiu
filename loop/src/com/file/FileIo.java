package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileIo fi=new FileIo();
		//fi.createFile();
		//fi.deleteFile();
		//fi.createFolder();
		//fi.isExists();
		//fi.listOfFileAndFolder();
		//fi.listOfFileOnly();
		//fi.listOfFolderOnly();
		//fi.extension();
		//fi.writeFile();
		//fi.bufferedwriter();
		//fi.readFile();
		//fi.countSentence();
		//fi.bufferedReader();
		fi.subFolder();
		
	
	}

	private void subFolder() {
		   File f=new File("/home/sakthivel/Music/NewFolder/SubFolder");
		   f.mkdirs();
	}

	private void bufferedReader() throws IOException {
		    File f=new File("/home/sakthivel/Music/newfile.txt");
		    FileReader fr=new FileReader(f);
		    BufferedReader br=new BufferedReader(fr);
		    String r=br.readLine();
		    System.out.println(r);

	}

	private void countSentence() throws IOException {
		  File f=new File("/home/sakthivel/Music/newfile.txt");
	        FileReader fr=new FileReader(f);
	        int read=fr.read();
	        int count=1;
	        while(read!=-1) {
	        	char ch=(char)read;
	        	System.out.print(ch);//file reading
	        	if(ch=='.') {
	        		count++;
	        	}
	        	read=fr.read();
	        }
	        System.out.println(count);// count of sentence

	}

	private void readFile() throws IOException {
	        File f=new File("/home/sakthivel/Music/newfile.txt");
	        FileReader fr=new FileReader(f);
	        int read=fr.read();
	        int count=1;
	        while(read!=-1) {
	        	char ch=(char)read;
	        	System.out.print(ch);//file reading
	        	if(ch==' ') {
	        		count++;
	        	}
	        	read=fr.read();
	        }
	        System.out.println(count);// count of word

	}

	private void bufferedwriter() throws IOException {
		    File f=new File("/home/sakthivel/Music/newfile.txt");
		    FileWriter fw=new FileWriter(f,true);//true does not old content change
		    BufferedWriter bw=new BufferedWriter(fw);
		    bw.write("kavin");
		    bw.newLine();
		    bw.write("kumar");
		    bw.flush();
		    bw.close();
	}

	private void writeFile() throws IOException {
		    File f=new File("/home/sakthivel/Music/newfile.txt");
		    FileWriter fw=new FileWriter(f,true);//true does not old content change
		    fw.write("sakthi");
		    fw.write("\n");
		    fw.write("vel");
		    fw.flush();
		    fw.close();

	}

	private void extension() {
			File f=new File("/home/sakthivel/Music");
			File[] file=f.listFiles();
			for(File ff:file) {
				if(ff.isFile()) {
					String name=ff.getName();
					System.out.println(name);
					String extension=name.substring(name.length()-3);
					if(extension.equals("txt")) {
						System.out.println(name);
					}
				}
			}

	}

	private void listOfFolderOnly() {
			File f=new File("/home/sakthivel/Music");
			File[] file=f.listFiles();
			for(File ff:file) {
				if(ff.isDirectory()) {
					System.out.println(ff);
				}
			}
	}

	private void listOfFileOnly() {
		File f=new File("/home/sakthivel/Music");
		File[] file=f.listFiles();
		for(File ff:file) {
			if(ff.isFile()) {
				System.out.println(ff);
			}
		}
	}

	private void listOfFileAndFolder() {
			File f=new File("/home/sakthivel/Music");
			String[] list=f.list();
			for(String l:list) {
				System.out.println(l);
			}
	}

	private void isExists() {
			File f=new File("/home/sakthivel/Music/new2.txt");
			System.out.println(f.exists());
	}

	private void createFolder() {
			File f=new File("/home/sakthivel/Music/NewFolder");
			f.mkdir();
	}

	private void deleteFile() {
			File f=new File("/home/sakthivel/Music/new2.txt");
			f.delete();
	}

	private void createFile() throws IOException {
			File f=new File("/home/sakthivel/Music/newfile.txt");
			//File f=new File("/home/sakthivel/Music/new2.txt");
			boolean created=f.createNewFile();
			System.out.println(created);
	}

}
