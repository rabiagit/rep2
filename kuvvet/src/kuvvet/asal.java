package kuvvet;

import java.util.Scanner;

public class asal {

	private static Scanner al;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double topla=0;
		int sayac=0;
		while(true)
		{
		al = new Scanner(System.in);
		System.out.print("\tsayi giriniz(Cikmak icin 0 giriniz!) : ");

		int sayi=al.nextInt();
		topla=topla+sayi;

		if(sayi==0){
		break;

		}
		sayac++;
		}
		double ort=topla/sayac;
		System.out.println("Sayilarin Ortalamasi : "+ort);

	}

}
