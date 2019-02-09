package dragonsequence;

import java.util.ArrayList;

public class Main {
	
	public static String imprimir(String[] arreglo) {
		String retorno="";
		for (int i = 0; i < arreglo.length; i++) {
			retorno=retorno+arreglo[i];
		}
		return retorno;
	}
	public static String alternar(String uno) {
		if(uno.equals("1")) {
			return "0";
		}else {
			return "1";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String base="1";
		
		for (int i = 0; i < 8; i++) {
			System.out.println(base);
			String suma="1";
//			String agg="";
//			for (int j = 0; j < base.length(); j++) {
//				agg=agg+suma+base.charAt(j)+"0";
////				suma=alternar(suma);
//			}
//			base=agg;
			int num=base.length()*2;
			String[] agg=new String[num+1];
			for (int j = 1,k=0; j < agg.length; j+=2,k++) {
				agg[j]=base.charAt(k)+"";
			}
			for (int j = 0,k=0; j < agg.length; j+=2) {
				agg[j]=suma;
				suma=alternar(suma);
			}
			base=imprimir(agg);
			
			
			
		}

	}

}
