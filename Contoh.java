interface Bentuk {
    // Semua metode dalam interface tidak memiliki implementasi
    void gambar();
    void cetakInfo();
     
}

class Lingkaran implements Bentuk {
    public void gambar() {
        System.out.println("Menggambar lingkaran");
    }

    public void cetakInfo() {
        System.out.println("Ini adalah lingkaran");
    }
}

class Persegi implements Bentuk {
    public void gambar() {
        System.out.println("Menggambar persegi");
    }

    public void cetakInfo() {
        System.out.println("Ini adalah persegi");
    }
}

public class Contoh {

	public static void main(String[] args) {
		
		Lingkaran lingkaran = new Lingkaran();
		Persegi persegi = new Persegi();
		
		
		lingkaran.gambar();
		lingkaran.cetakInfo();
		
		persegi.gambar();
		persegi.cetakInfo();
	}

}

/* Output :
 * Menggambar lingkaran
 * Ini adalah lingkaran
 * Menggambar persegi
 * Ini adalah persegi
 */
