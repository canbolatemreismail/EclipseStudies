package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself kendini tekrar etme
		String internetSubeButonu="�nternet �ubesi";
		double dolarDun=8.20;
		double dolarBugun=8.20;
		
	//Buradaki dolar verileri baska yerlerden 
	//geliyor servis saglay�c�lar�ndan
		//getDolarYesterday gibi kodlar var.
		//int vade =36;
		//boolean dustuMU = false;
		//true ya da false herhangi biri verilecek
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}
		else if  (dolarBugun>dolarDun)
		{
				
					System.out.println("Dolar y�kseldi resmi");
		}
		else {
			System.out.println("Dolar esittir resmi");
		}
	
	String kredi1="H�zl� Kredi";
	String kredi2="Mutlu emekli kredisi";
	String kredi3="Konut kredisi";
	String kredi4="�ift�i kredisi";
	String kredi5="Msb kredisi";
	String kredi6="Meb kredisi";
	
	System.out.println(kredi1);
	System.out.println(kredi2);
	System.out.println(kredi3);
	System.out.println(kredi4);
	System.out.println(kredi5);
	System.out.println(kredi6);
	
	//Yeni bir kredi s�tunu a�t���m�zda problem buras� bu yuzden
	//arrayler kullan�caz.
	
	
	String[] krediler= 
		{
			"H�zl� Kredi",
			"Mutlu emekli kredisi",
			"Konut kredisi",
			"�ift�i kredisi",
			"Msb kredisi",
			"Meb kredisi"
		};
	//foreach
	for(String kredi : krediler) {
		System.out.println(kredi);
	}
	
	//ikinci yontem
	//i++ ile i=i+1 ayni
	for(int i = 0; i<krediler.length; i++) {
		System.out.println(krediler[i]);
		}
	int sayi1 = 10; 
	int sayi2 = 20;
	sayi1 = sayi2;
	sayi2 = 100;
	System.out.println (sayi1);
	
	int[] sayilar1 = {1,2,3,4,5};
	int[] sayilar2 = {10,20,30,40,50};
	sayilar1 = sayilar2 ;
	sayilar2[0] = 100;
	System.out.println(sayilar1[0]);

	String sehir1 = "Ankara";
	String sehir2 = "�stanbul";
	sehir1 = sehir2;
	sehir2 = "izmir";
	System.out.println(sehir1);
}
}