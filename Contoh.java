//abstract class Bentuk {
//    // Metode dengan implementasi
//    void cetakInfo() {
//        System.out.println("Ini adalah bentuk");
//    }
//
//    // Metode abstrak tanpa implementasi
//    abstract void gambar();
//}
//
//class Lingkaran extends Bentuk {
//    void gambar() {
//        System.out.println("Menggambar lingkaran");
//    }
//}
//
//class Persegi extends Bentuk {
//    void gambar() {
//        System.out.println("Menggambar persegi");
//    }
//}

//interface Bentuk {
//    // Semua metode dalam interface tidak memiliki implementasi
//    void gambar();
//    void cetakInfo();
//    
//    
//}
//
//class Lingkaran implements Bentuk {
//    public void gambar() {
//        System.out.println("Menggambar lingkaran");
//    }
//
//    public void cetakInfo() {
//        System.out.println("Ini adalah lingkaran");
//    }
//}
//
//class Persegi implements Bentuk {
//    public void gambar() {
//        System.out.println("Menggambar persegi");
//    }
//
//    public void cetakInfo() {
//        System.out.println("Ini adalah persegi");
//    }
//}
//
//
//
//public class Contoh {
//
//	public static void main(String[] args) {
//		
//		Lingkaran lingkaran = new Lingkaran();
//		Persegi persegi = new Persegi();
//		
//		
//		lingkaran.gambar();
//		lingkaran.cetakInfo();
//		
//		persegi.gambar();
//		persegi.cetakInfo();
//	}
//
//}


interface Bentuk {
    // Metode dengan implementasi default
    default void cetakInfo() {
        System.out.println("Ini adalah bentuk");
    }

    // Metode abstrak
    void gambar();
}

class Lingkaran implements Bentuk {
    public void gambar() {
        System.out.println("Menggambar lingkaran");
    }

    // Default method dapat di-override jika diperlukan
    public void cetakInfo() {
        System.out.println("Ini adalah lingkaran");
    }
}

class Persegi implements Bentuk {
    public void gambar() {
        System.out.println("Menggambar persegi");
    }
}

public class Contoh {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.cetakInfo(); // Akan memanggil implementasi override dalam Lingkaran

        Persegi persegi = new Persegi();
        persegi.cetakInfo(); // Akan menggunakan implementasi default dari interface
    }
}
