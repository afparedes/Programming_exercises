package subfactorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String line = reader.readLine(); 
        while (!line.equals("finish")) {
        	int numDice=Integer.parseInt(line.split("d")[0]);
        	int sizeDice=Integer.parseInt(line.split("d")[1]);
        	String totalus="";
        	int total=0;
        	for (int i = 0; i < numDice; i++) {
				
					int g=	(int)(Math.random()*sizeDice)+1;
					totalus=totalus+" "+g;
						total=total+g;
			}
        	System.out.println("total: "+total+" => "+totalus);
        	line = reader.readLine(); 
        }
	}

}
