package javaiodemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		 //int number=System.in.read();   //ASCII value will be stored
		 //System.out.println((char)(number));   //convert the ASCII into the original value as char type
//		File file=new File("abc");
//		System.out.println(file.exists());
//		file.exists();
//		file.mkdir();
//		System.out.println(file.exists());
//		File file1=new File(file,"mouli.txt");
//		file1.createNewFile();
//		System.out.println(file1.exists());
//		
//		File file3=new File("E:\\java\\dailypractice\\abc","abcd");
//		file3.mkdir();
//		System.out.println(file3.exists());
//		
//		
//		String[] s=file.list();
//		System.out.println(s.length);
//		for(String let:s) {
//			File file5=new File(file,let);
//			if(file5.isFile()) {
//				System.out.println(let + " " + ":File");
//			}
//			else if(file5.isDirectory()) {
//				System.out.println(let + " " + ":Directory");
//			}
//			System.out.println(let);
//			
//		}
		Main obj=new Main();
//		obj.filewriter();
//		obj.filereader();
		obj.bufferedwriter();
		obj.bufferedreader();
		
		
	}
	void filewriter() throws IOException {
		FileWriter fw=new FileWriter("filewriter.txt");// creates file if not that specified file mentioned not there // override the content
		//FileWriter fw=new FileWriter("filewriter.txt",true);// it will append the data ... that is append as many times the code is given run
		fw.write(65);//ascii of a
		fw.write("bout");
		fw.write("\t numbers");
		fw.write("\n 123456789 ");
		fw.append("it is a sample\n");
		char[] ch= {'a','b'};
		fw.write(ch);
		fw.flush();
		fw.close();
	}
	void filereader() throws IOException {
		File f= new File("filewriter.txt");
		char[] ch= new char[(int) f.length()];
		FileReader fr= new FileReader(f);
		fr.read(ch);
		/*
		 * for(char c:ch) { System.out.println(c); }
		 */
		 System.out.println(ch);
		 System.out.println("********************************************");
		 FileReader fr1= new FileReader("filewriter.txt");
		 int i=fr1.read();
		 while(i!=-1) {
			 System.out.println((char)i);
			 i=fr1.read();
		 }
		fr.close();
	}
	
	void bufferedwriter() throws IOException {
		FileWriter fw= new FileWriter("bufferedwriterfile.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(65);
		bw.newLine();
		char [] ch= {'m','a','h','i'};
		bw.write(ch);
		bw.newLine();
		bw.write("MAHITHA B");
		bw.flush();
		bw.close();
	
		}
	void bufferedreader() throws IOException{
		FileReader fr= new FileReader("filewriter.txt");
		BufferedReader br= new BufferedReader(fr);
		String line= br.readLine();
		while(line!=null) // if there is nothing to read in file returns null
		{
			System.out.println(line);
			line= br.readLine();
		}
		br.close();  // whenever we are closing br it will automatically close fr also
	}
	
}

