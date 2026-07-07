package com.codegnan.iostreams;

import java.io.FileNotFoundException;

public class BufferedReaderExample {
	public static void main(String[] args) throws FileNotFoundException{
		BufferReader br=new BufferedReader(new FileReader("abc.txt"));
		String line;
		try {
			while((line=br.readLine()) !=null) {
				
				System.out.println(line);
			}
		}
		
		
		
		
	}

}
