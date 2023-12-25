package cek;

public class Film {
	private String judul;
	private int harga;
	private int durasi;
	
	
	
	public String getJudul() {
		return judul;
	}



	public void setJudul(String judul) {
		this.judul = judul;
	}



	public int getHarga() {
		return harga;
	}



	public void setHarga(int harga) {
		this.harga = harga;
	}



	public int getDurasi() {
		return durasi;
	}



	public void setDurasi(int durasi) {
		this.durasi = durasi;
	}



	void putarFilm() {
		System.out.println("Film ini sedang di putar");
	}

}
