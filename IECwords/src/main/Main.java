package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String line = reader.readLine(); 
        while (!line.equals("finish")) {
        if(line.contains("check")) {
        	boolean retorno=true;
        	String word= line.split('"'+"\\)")[0].split("\\("+'"')[1];
        	
        	
        		for (int i = 0; i+2 < word.length(); i++) {
        			
        			if(word.charAt(i)!='c'&&word.charAt(i+1)=='e'&&word.charAt(i+2)=='i') {
        				retorno=false;
                	}else if(word.charAt(i)=='c'&&word.charAt(i+1)=='i'&&word.charAt(i+2)=='e') {
        				retorno=false;
                	
        			}
        			
				}
        	System.out.println(line+" => "+retorno);
        }else if(line.contains("bonus")) {
        	
    		File file = new File("D:\\Descargas\\enable2.txt"); 
    		  
    		  BufferedReader br = new BufferedReader(new FileReader(file)); 
    		  
    		  String st;
    		  ArrayList<String> diccionario = new ArrayList<String>();
    		  ArrayList<String> bad = new ArrayList<String>();
    		  while ((st = br.readLine()) != null) 
//    		    System.out.println(st); 
               diccionario.add(st);        		
    		br.close();
    		int totalus=0;
    		for (int j = 0; j < diccionario.size(); j++) {
    			
    			String word=diccionario.get(j);
    			
    			
//    			
//    				if(word.contains("ei")) {
//    					
//    					if(!word.contains("cei")) {
//    						
//    						totalus++;
//    						bad.add(word);
//        					System.out.println(word);
//    					}
//    					
//        			}else			
//                     if(word.contains("cie")) {
//    					
////    					if(word.contains("cie")) {
//    						
//    						totalus++;
//    						bad.add(word);
//        					System.out.println(word);
////    					}
//    					
//        			}
    			
    			
    		       
                    for (int i = 0; i+2 < word.length(); i++) {
        			
        			if(word.charAt(i)!='c'&&word.charAt(i+1)=='e'&&word.charAt(i+2)=='i') {
        				totalus++;
        				System.out.println(word);
        				bad.add(word);
        				
                	}else if(word.charAt(i)=='c'&&word.charAt(i+1)=='i'&&word.charAt(i+2)=='e') {
                		totalus++;
                		System.out.println(word);
                		bad.add(word);
        			}
        			
			       
                    }
    		}
    		System.out.println(diccionario.size()+" en total: "+totalus);
    		
    		
    		PrintWriter writer = new PrintWriter("D:\\Descargas\\bad.txt", "UTF-8");
    		for (int i = 0; i < bad.size(); i++) {
    			writer.println(bad.get(i));
			}
    	    
    		
    		
    		writer.close();
        }
        
        	
        	line = reader.readLine(); 
        }
	}

}
