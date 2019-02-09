package wordFunnel1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 //Enter data using BufferReader 
		System.out.println("hello");
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String line = reader.readLine(); 
        while (!line.equals("finish")) {
        	
        	if(line.contains("funnel")) {
        	String word1= line.split('"'+",")[0].split("\\("+'"')[1];
        	
        	String word2= line.split(" "+'"')[1].split('"'+"\\)")[0];
        	Boolean result = false;
        	for (int i = 0; i < word1.length(); i++) {
        		String word11=word1.substring(0, i);
        		String word12=word1.substring(i+1,word1.length());
        		
//        		System.out.println(word11+word12);
				if(word2.equals((word11+word12))) {
					result=true;
				}
			}
//        	System.out.println(word1);
//        	System.out.println(word2);
        	System.out.println(line+" => "+result);
        	}else if(line.contains("bonus(")) {
        		ArrayList<String> total = new ArrayList<String>();
        		File file = new File("D:\\Descargas\\enable1.txt"); 
        		  
        		  BufferedReader br = new BufferedReader(new FileReader(file)); 
        		  
        		  String st;
        		  ArrayList<String> diccionario = new ArrayList<String>();
        		  while ((st = br.readLine()) != null) 
//        		    System.out.println(st); 
                   diccionario.add(st);        		
        		br.close();
            String word1=line.split("\\("+'"')[1].split('"'+"\\)")[0];
            
//            String word11=word1.substring(0, 0);
//    		String word12=word1.substring(1,word1.length());
//    		String inter =(word11+word12);
//            if(diccionario.contains(inter)) {
//            	result='"'+inter+'"';
//            }
    		
            for (int i = 0; i < word1.length(); i++) {
        		String word11=word1.substring(0, i);
        		String word12=word1.substring(i+1,word1.length());
        		String inter =(word11+word12);
        		if(diccionario.contains(inter) && !total.contains('"'+inter+'"')) {
        			total.add('"'+inter+'"');
        		}
        		
            }
            
            String result="";
            
            if(!total.isEmpty())
             result=total.get(0);
            
            for (int i = 1; i < total.size(); i++) {
				result=result+","+total.get(i);
			}
            System.out.println(line+" => ["+result+"]");
            }else if(line.contains("bonus2")) {
            	Date date = new Date();
            	DateFormat format = new SimpleDateFormat("HHmm");
            	System.out.println(format.format(date));
        		File file = new File("D:\\Descargas\\enable1.txt"); 
        		  
        		  BufferedReader br = new BufferedReader(new FileReader(file)); 
        		  
        		  String st;
        		  ArrayList<String> diccionario = new ArrayList<String>();
        		  while ((st = br.readLine()) != null) 
//        		    System.out.println(st); 
                   diccionario.add(st);        		
        		br.close();
        		ArrayList<String> diccionario2=diccionario;
        		
        		for (int j =0; j < diccionario2.size(); j++) {
        			String word1=diccionario2.get(j);
        			ArrayList<String> total = new ArrayList<String>();
        			int contador=0;
        			for (int i = 0; i < word1.length(); i++) {
                		String word11=word1.substring(0, i);
                		String word12=word1.substring(i+1,word1.length());
                		String inter =(word11+word12);
//                		System.out.println(word11+word12);
        				if(diccionario.contains(inter) && !total.contains(inter)) {
        					contador++;
        					total.add(inter);
        				}
        				
        				if(contador==5) {
        					System.out.println(word1);
        				}
        			}
        		}
                date = new Date();
            	
            	System.out.println(format.format(date));
        		
            }else if(line.contains("bonus3")) {
            	Date date = new Date();
            	DateFormat format = new SimpleDateFormat("HHmm");
            	System.out.println(format.format(date));
        		File file = new File("D:\\Descargas\\enable1.txt"); 
        		  
        		  BufferedReader br = new BufferedReader(new FileReader(file)); 
        		  Hashtable<String, ArrayList<String>> tabla=new Hashtable<String, ArrayList<String>> ();
        		  String st;
        		  ArrayList<String> diccionario = new ArrayList<String>();
        		  while ((st = br.readLine()) != null){
        			  diccionario.add(st); 
        			  String g=st.length()+"";
        			  if(tabla.get(g)==null) {
        				  ArrayList<String> ejemplo = new ArrayList<String>();
        				  ejemplo.add(st);
        				  tabla.put(g, ejemplo);
        			  }else {
        				  tabla.get(g).add(st);
        			  }
        		  }
    		
        		br.close();
//        		Set<String> hello=tabla.keySet();
//        		for (String string : hello) {
//					System.out.println(string);
//				}
//        		String k=tabla.get("28").get(0);
        		for (int j =0; j < diccionario.size(); j++) {
        			String word1=diccionario.get(j);
        			ArrayList<String> diccionario2=tabla.get((word1.length()-1)+"");
        			ArrayList<String> total = new ArrayList<String>();
        			int contador=0;
        			if(diccionario2!=null) {
        			for (int i = 0; i < word1.length(); i++) {
                		String word11=word1.substring(0, i);
                		String word12=word1.substring(i+1,word1.length());
                		String inter =(word11+word12);
//                		System.out.println(word11+word12);
        				if(diccionario2.contains(inter) && !total.contains(inter)) {
        					contador++;
        					total.add(inter);
        				}
        				
        				if(contador==5) {
        					System.out.println(word1);
        				}
        			}
        			}
        		}
        		 date = new Date();
            	
            	System.out.println(format.format(date));
        		
            }
        	line = reader.readLine(); 
        }
        
        // Printing the read line 
        System.out.println(line);
        
	}

}
