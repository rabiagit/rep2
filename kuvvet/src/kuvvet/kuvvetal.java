package kuvvet;

import javax.swing.JOptionPane;

public class kuvvetal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int us;
		double sayi;
		double sonuc=1.0;
		
		 String ussu=JOptionPane.showInputDialog("Sayinin Kuvvetini Giriniz :  ");
	     us=Integer.parseInt(ussu);
	     String sayisi=JOptionPane.showInputDialog("Reel Sayiyi Giriniz :  ");
	     sayi=Double.parseDouble(sayisi);
	     
	     for(int i=1;i<=us;i++){
	    	 sonuc=sayi*sonuc;
	     }
	     JOptionPane.showMessageDialog(null, sonuc);
	}

}
