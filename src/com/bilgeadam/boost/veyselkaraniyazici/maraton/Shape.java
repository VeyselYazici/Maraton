package com.bilgeadam.boost.veyselkaraniyazici.maraton;

public class Shape {

	private int firstEdge;
	private int secondEdge;
	private int thirdEdge;
	private int fourthEdge;
	private int primeter;
	private int area;
	
	
	public void calculations() {
		
		// I.YOL
		if((this.firstEdge != 0) && (this.secondEdge != 0) && (this.thirdEdge != 0) && (this.fourthEdge != 0)) // 4 kenar girildiyse
		{
			this.primeter = this.firstEdge + this.secondEdge + this.thirdEdge + this.fourthEdge; // dortgen cevre
			this.area = this.firstEdge * this.thirdEdge;			// dortgen alan
			System.out.println("Seklin cevresi: " + getPrimeter()); // get veya this.primeter kullansamda ayni sonuc oldugu
																	// icin iki turlusunude kullanmis olmak istedim
			System.out.println("Seklin alani: " + this.area);
		}

		else if((this.firstEdge != 0) && (this.secondEdge != 0) && (thirdEdge != 0))	// 3 kenar girildiyse
		{
			this.primeter = this.firstEdge + this.secondEdge + this.thirdEdge;							// ucgen cevre
			this.area = (int) Math.sqrt((getPrimeter() / 2) * ((getPrimeter() / 2) - getFirstEdge())	// ucgen alan
					* ((getPrimeter() / 2) - getSecondEdge()) * ((getPrimeter() / 2) - getThirdEdge()));
			System.out.println("Seklin cevresi: " + this.primeter);
			System.out.println("Seklin alani: " + this.area);
		}
		else if((this.firstEdge != 0) && (this.secondEdge != 0))						// iki kenar girildiyse
		{
			System.err.println("Iki kenarli sekil olmaz!!!");
		}
		
		
		/*// II.YOL ayni isi yapiyolar
		if(this.firstEdge != 0)		 // bu sart ilk kenar sifir gelirse diye kontrol
		{
			if (this.thirdEdge == 0) // ilk kontrol burasi eger 3.kenar sifir ise buraya girecek veya
			{						 // 2.kenar 0 girilirse 3.kenar girisi yapilamaz ve oznitelikler varsayilan int degerleri 0 oldugundan 
								     // gene buraya girer.
				System.err.println("Iki kenarli sekil olmaz!!!");
			}
			else if (this.fourthEdge == 0)	// ikinci kontrol 4.kenar sifir ise ucgen hesaplamalari
			{
				this.primeter = this.firstEdge + this.secondEdge + this.thirdEdge;
				this.area = (int) Math.sqrt((getPrimeter() / 2) * ((getPrimeter() / 2) - getFirstEdge())
					* ((getPrimeter() / 2) - getSecondEdge()) * ((getPrimeter() / 2) - getThirdEdge()));
				System.out.println("Seklin cevresi: " + this.primeter);
				System.out.println("Seklin alani: " + this.area);
			}
			else	// yukardakiler degilse zaten dortgendir. Dortgen hesaplamasi yapilir
			{
				this.primeter = this.firstEdge + this.secondEdge + this.thirdEdge + this.fourthEdge;
				this.area = this.firstEdge * this.thirdEdge;
				System.out.println("Seklin cevresi: " + getPrimeter());
				System.out.println("Seklin alani: " + this.area);
			}
		}*/
		
		
		edgeCleaning(); // kenarlari temizlemek icin
	}
	

	
	private void edgeCleaning() { // burda kenarlari temizlemez isem deger tutuyolar
		this.firstEdge = 0;
		this.secondEdge = 0;
		this.thirdEdge = 0;
		this.fourthEdge = 0;
		
		
		
		/*setFirstEdge(0);		// this.firstEdge = 0; ile ayni işi yapiyor ama hangisi mantikli bilemedim
		setSecondEdge(0);
		setThirdEdge(0);
		setFourthEdge(0);*/
		
	}



	public int getFirstEdge() {
		return this.firstEdge;
	}
	
	public void setFirstEdge(int firstEdge) {
		this.firstEdge = firstEdge;
	}
	
	public int getSecondEdge() {
		return this.secondEdge;
	}
	
	public void setSecondEdge(int secondEdge) {
		this.secondEdge = secondEdge;
	}
	
	public int getThirdEdge() {
		return this.thirdEdge;
	}
	
	public void setThirdEdge(int thirdEdge) {
		this.thirdEdge = thirdEdge;
	}
	
	public int getFourthEdge() {
		return this.fourthEdge;
	}
	
	public void setFourthEdge(int fourthEdge) {
		this.fourthEdge = fourthEdge;
	}

	public int getPrimeter() {
		return this.primeter;
	}

	public void setPrimeter(int primeter) {
		this.primeter = primeter;
	}

	public int getArea() {
		return this.area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	
	
	
}
