package com.bilgeadam.boost.veyselkaraniyazici.maraton;

import java.util.Scanner;

public class ShapeTest {
	private Shape shape;	// ShapeTeste'e bir shape tanitiyorum
							// bunu yapmaz isem readInput static tanimlamam ve main icine 
							// Shape shape = new Shape(); yapmam gerekir ve o sekilde ulasmam gerekirdi
	public static void main(String[] args) {
		
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();
		System.out.println("Bye...");

	}
	
	
	
	private void readInput() {
		
		shape = new Shape();  // shape adinda Shape sinifinda nesnemi olusturdum
		int j = 0;			  // do-while ile yapmadigim icin ilk while girebilmesi icin j = 0
		Scanner in = new Scanner(System.in);
		while(j >= 0)		  // j eger negatif bir sayi olursa dongu bitiyo yani cikis gerceklestiriliyor(Bye)
		{
			System.out.println("Lutfen hesaplamak istediginiz seklin (en fazla 4 kenar) kenar uzunluklarini giriniz (-1 ile cikis): ");
			for(int i = 1; i <= 4; i++)	// sirf syso'u "i" ile yazabilmek icin for kullandim
			{
				System.out.print("Lutfen "+ i +". kenar uzunlugunu giriniz (0 ile sonlandir): ");
				j = in.nextInt();		// 4 kenar icin 4 sayi girdisini burdan aliyorum
				if (j > 0)				// j 0 dan buyuk oldugu surece kenarlari aliyorum
				{
					if(i == 1) 			// i degerleri icin kenar atamalarini yapiyorum
					{					
						shape.setFirstEdge(j); // j'ye  girilen degerleri kenarlara int olarak gonderiyorum
					}
					
					else if(i == 2)
					{
						
						shape.setSecondEdge(j);
					}
					else if(i == 3)
					{
						
						shape.setThirdEdge(j);
					}
					else if(i == 4)
					{
						
						shape.setFourthEdge(j);
					}
				}						// j 0 oldugunda fordan cikiyorum ve calculator'e gidiyorum
				else					// hesaplama isini yapiyorum 
				{
					break;
				}
				
			}
			
			shape.calculations();		// kenar uzunluklari belirlendikten sonra hesaplamalar icin
										// kullandigim metot
		}
		in.close();						// en son scanner'i kapatiyorum
		
	}

	

}
