package cek;

import java.util.Scanner;
import java.util.Vector;

public class main {
	// membuat scanner
	static Scanner scan = new Scanner(System.in);
	
	// membuat variable
	static int Choose = 0;
	static String Name = "";
	
	//vector
	static Vector<String> name = new Vector<>();
	static Vector<Integer> kode = new Vector<>();
	static Vector<Integer> jumlah = new Vector<>();
	static Vector<Integer> harga = new Vector<>();

	static int Kode = 0;
	static int Jumlah = 0;
	static int Harga = 0;
	static int Uang = 0;
	static String Email = ""; 
	
	static void buy() {
		
		do {
		System.out.print("Masukan Nama Anda : ");
		Name = scan.nextLine();
		
		//string function
		if (Name.isEmpty() || (Name.length() < 3)) {
			System.out.println("Masukin yg bener");
			}else {
				System.out.println("Hallo " + Name + ", anda memilih menu " + Choose);
			}
		}while (Name.isEmpty() || Name.length() < 3);
			
		
		do {
		System.out.print("Masukan Email : ");
		Email = scan.nextLine();
		if (Email.isEmpty() || !Email.contains("@") || !Email.contains(".com")) {
			System.out.println("Email tidak valid");
		}
		}while (Email.isEmpty() || !Email.contains("@") | !Email.contains(".com"));
		
		do {
		System.out.print("Masukan Kode Pembelian : ");
		Kode = scan.nextInt(); 
		scan.nextLine();
		}while (Kode < 1 | Kode > 3);		// | adalah or, biasanya ||
		
		do {
		System.out.print("Masukan Jumlah Pembelian : ");
		Jumlah = scan.nextInt();
		scan.nextLine();
		}while (Jumlah < 1);
		
		if (Kode == 1) {
		    Harga = 1000; 
		} else if (Kode == 2) {
			Harga = 1500;
		} else {
			Harga = 5000;
		}
		
		int TotalHarga = (Jumlah * Harga);
		System.out.println("Total Yang Harus Anda Bayar Senilai : " + TotalHarga);
		System.out.print("Masukan Uang Anda : ");
		Uang = scan.nextInt();
		scan.nextLine();
		
		if (Uang < TotalHarga) {
			System.out.println("Ups Uang Anda Kurang");
		} else {
			int Kembalian = (Uang - TotalHarga);
			System.out.println("Kembalian Anda : " + Kembalian);
			System.out.println("Terimakasih, Selamat Menonton");
		}
		
		//add data ke vector
		harga.add(TotalHarga);
		name.add(Name);
		kode.add(Kode);
		jumlah.add(Jumlah);
	}
	
	static void view() {
		if(name.size()==0) {
			System.out.println("Tidak ada data!");
		}else {
			//tampil data yg ada di vector
			System.out.println("---------------------------------------------------");
			System.out.println("|No.|Nama           | Kode Film | Jumlah | Harga    |");
			System.out.println("---------------------------------------------------");
			
			for(int i=0; i<name.size(); i++) {
				System.out.printf("| %-2s|%-15s|%-11d|%-8d|%-10d|\n", 
						(i+1), name.get(i), kode.get(i), jumlah.get(i), harga.get(i));
			}
			for(int i=0; i<3; i++) {
				System.out.println();
			}
		}
	}
	
	static void update() {
		if (name.size()==0) {
			System.out.println("Tidak ada data!");
		}else {
			//tampil data yg ada di vector
			System.out.println("---------------------------------------------------");
			System.out.println("|No.|Nama           | Kode Film | Jumlah | Harga    |");
			System.out.println("---------------------------------------------------");
			
			for(int i=0; i<name.size(); i++) {
				System.out.printf("| %-2s|%-15s|%-11d|%-8d|%-10d|\n", 
						(i+1), name.get(i), kode.get(i), jumlah.get(i), harga.get(i));
			}
			for(int i=0; i<3; i++) {
				System.out.println();
			}
			
			do {
				Choose = 0;
				System.out.println("Choose -> ");
				
				try {
					Choose = scan.nextInt();	
					scan.nextLine();
				} catch (Exception e) {
					System.out.println("Harus Numeric !");
					Choose = -1;
				}
			} while (Choose <=0 | Choose > name.size());
			
			do {
				System.out.println("Masukan Nama Anda : ");
				Name = scan.nextLine();
			} while (Name.isEmpty() | Name.length() < 3);
			
			//replace data nama pada vector
			name.set(Choose -1,  Name);
		}
	}
	
	static void delete() {
		if (name.size() == 0) {
			System.out.println("Tidak ada data !");
		}else {
			System.out.println("---------------------------------------------------");
			System.out.println("|No.|Nama           | Kode Film | Jumlah | Harga    |");
			System.out.println("---------------------------------------------------");
			
			for(int i=0; i<name.size(); i++) {
				System.out.printf("| %-2s|%-15s|%-11d|%-8d|%-10d|\n", 
						(i+1), name.get(i), kode.get(i), jumlah.get(i), harga.get(i));
			}
			for(int i=0; i<3; i++) {
				System.out.println();
			}
			
			do {
				Choose = 0;
				System.out.println("Choose -> ");
				
				try {
					Choose = scan.nextInt();	
					scan.nextLine();
				} catch (Exception e) {
					System.out.println("Harus Numeric !");
					Choose = -1;
				}
			} while (Choose <=0 | Choose > name.size());
			
			//hapus data pada vector
			name.remove(Choose - 1);
			kode.remove(Choose -1);
			jumlah.remove(Choose -1);
			harga.remove(Choose -1);
		}
	}

	public static void main(String[] args) {
		Film fifty = new Film();
		
		fifty.setJudul("Fifty Shades Grey");
		System.out.println(fifty.getJudul() + " dengan durasi " + fifty.getDurasi() + " menit");
		fifty.putarFilm();
		
		Kartun Spongebob = new Kartun();
		Spongebob.setJudul("Patrik makan kraby patty");
		System.out.println(Spongebob.getJudul());
		
/*		System.out.println("Hallo");
		System.out.println("World");
		System.out.print("Hallo");
		System.out.print("Dandri"); */
		
		//variable dan tipe data
		String film1 = "Cars";
		String film2 = "Nemo";
		String film3 = "Fifty S";
				
		//array
		String[]film = {"Minion", "Patrik", "Dora"};
		
		// menampilkan output ke user	
		// looping do while dan for
		do {
			for (int i=0; i<3; i++) {
				System.out.println();
			}
		System.out.println("\t Bioskop 21");
		System.out.println("| Kode Film | | Nama Film |");
		System.out.println("---------------------------");
		for(int i=0; i<film.length; i++) {
		System.out.printf("| %-9s | | %-9s |\n", (i+1), film[i]);
		}
		System.out.println();
		System.out.println("1. Buy");
		System.out.println("2. View");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		
		do {
		System.out.println();
		System.out.print("Choose => ");
		
		//Exception Handling
				try {
					Choose = scan.nextInt();
					scan.nextLine();
				}
				catch(Exception e) {
					System.out.print("Harus Numeric !!");
					Choose = -1;
					scan.nextLine();
				}
		}while (Choose == -1);
		
		//Switch Statement
		switch (Choose) {
		case 1:
			buy();
			
			break;
			
		case 2:
			view();
			
			break;
		
		case 3:
			update();
			
			break;
			
		case 4:
			delete();
		
			break;		
			
		}
		}while (Choose != 5);

	}

}
