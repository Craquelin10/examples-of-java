package classes;

public class Main {

	public static void main(String[] args) {
		// referance type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value tpye
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;					//diziler referance type dır sayilar2'nin refarns num sayilar1'in refans num eşit
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);		//stackde oluşturduğum yerin heapde gideceği yer değişti

	}

}
