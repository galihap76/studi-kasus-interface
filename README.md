## Interface Java

Di Java, "abstrak" (abstract) dan "interface" adalah dua konsep yang berbeda yang digunakan untuk mencapai abstraksi dan polimorfisme dalam pemrograman berorientasi objek.

### Abstrak (Abstract):

**Abstrak** adalah kata kunci yang digunakan untuk mendeklarasikan kelas abstrak atau metode abstrak dalam Java. Kelas abstrak tidak dapat diinstansiasi secara langsung, tetapi dapat digunakan sebagai kelas dasar untuk kelas turunan. Metode abstrak dalam kelas abstrak tidak memiliki implementasi di kelas tersebut dan harus diimplementasikan oleh kelas turunan.

Contoh kelas abstrak:

```java
abstract class Bentuk {
    abstract void gambar(); // Metode abstrak
}

class Lingkaran extends Bentuk {
    void gambar() {
        System.out.println("Menggambar lingkaran");
    }
}

class Persegi extends Bentuk {
    void gambar() {
        System.out.println("Menggambar persegi");
    }
}
```

### Interface:

**Interface** adalah kontrak yang mendefinisikan metode (tanpa implementasi) yang harus diimplementasikan oleh kelas yang menggunakan interface tersebut. Dalam Java, sebuah kelas dapat mengimplementasikan satu atau lebih interface.

Contoh interface:

```java
interface Bentuk {
    void gambar();
}

class Lingkaran implements Bentuk {
    public void gambar() {
        System.out.println("Menggambar lingkaran");
    }
}

class Persegi implements Bentuk {
    public void gambar() {
        System.out.println("Menggambar persegi");
    }
}
```

Perbedaan utama antara kelas abstrak dan interface adalah bahwa kelas abstrak dapat memiliki metode dengan implementasi, sementara semua metode dalam interface tidak memiliki implementasi. Sebuah kelas dapat mengimplementasikan beberapa interface, tetapi hanya dapat mewarisi dari satu kelas abstrak. Pemilihan antara kelas abstrak dan interface tergantung pada kebutuhan alur kerja program aplikasi.

## Perbedaan Paling Menonjol

Perbedaan paling menonjol antara kelas abstrak dan interface adalah bahwa kelas abstrak dapat memiliki metode dengan implementasi, sedangkan semua metode dalam interface tidak memiliki implementasi. Berikut adalah contoh sederhana untuk mengilustrasikan perbedaan tersebut:

### Contoh Kelas Abstrak:

```java
abstract class Bentuk {
    // Metode dengan implementasi
    void cetakInfo() {
        System.out.println("Ini adalah bentuk");
    }

    // Metode abstrak tanpa implementasi
    abstract void gambar();
}

class Lingkaran extends Bentuk {
    void gambar() {
        System.out.println("Menggambar lingkaran");
    }
}

class Persegi extends Bentuk {
    void gambar() {
        System.out.println("Menggambar persegi");
    }
}
```

### Contoh Interface:

```java
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
```

Dalam contoh di atas, kelas abstrak `Bentuk` memiliki metode `cetakInfo` dengan implementasi, sementara metode `gambar` bersifat abstrak. Di sisi lain, interface `Bentuk` hanya memiliki deklarasi metode tanpa implementasi, dan kelas-kelas yang mengimplementasikan interface tersebut harus memberikan implementasi untuk semua metode tersebut.

## Method Default Interface

Kita dapat mengakses metode default dalam sebuah interface langsung melalui objek kelas yang mengimplementasikan interface tersebut. Berikut adalah contoh cara mengakses metode default `cetakInfo`:

```java
interface Bentuk {
    default void cetakInfo() {
        System.out.println("Ini adalah bentuk");
    }

    void gambar();
}

class Lingkaran implements Bentuk {
    public void gambar() {
        System.out.println("Menggambar lingkaran");
    }
}

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();

        // Mengakses metode default dari interface
        lingkaran.cetakInfo();
    }
}
```

Dalam contoh ini, objek `lingkaran` adalah instansiasi dari kelas `Lingkaran`, yang mengimplementasikan interface `Bentuk`. Kita dapat memanggil metode default `cetakInfo` pada objek `lingkaran` seperti pemanggilan metode biasa. Outputnya akan mencetak "Ini adalah bentuk" karena itulah implementasi default dari metode tersebut.

Perhatikan bahwa metode default dapat diakses dari objek kelas yang mengimplementasikan interface, dan jika kelas tersebut meng-override metode default tersebut, maka implementasi yang diambil adalah implementasi dari kelas tersebut.

## Pertimbangan Default Interface

Pertimbangan untuk menggunakan metode default dalam interface harus dilakukan dengan hati-hati. Meskipun metode default menyediakan fleksibilitas untuk menambahkan fungsionalitas tambahan ke interface tanpa mematahkan implementasi yang sudah ada, terdapat beberapa pertimbangan:

1. **Kejelasan Kode:**
   - Terlalu banyak metode default dalam sebuah interface dapat membuat kode menjadi kurang jelas dan sulit dipahami.
   - Penambahan metode default seharusnya memiliki alasan yang baik dan membantu kelas yang mengimplementasikan interface tersebut.

2. **Kepatutan Penggunaan:**
   - Metode default seharusnya digunakan hanya ketika implementasi default memang masuk akal untuk sebagian besar kelas yang mengimplementasikan interface tersebut.
   - Jangan gunakan metode default hanya untuk menyelesaikan masalah implementasi di beberapa kelas, karena hal ini dapat mengakibatkan kebingungan.

3. **Kesesuaian Semantik:**
   - Pastikan bahwa implementasi default memiliki semantik yang benar dan masuk akal dalam konteks semua kelas yang mungkin mengimplementasikannya.

4. **Perubahan Terhadap Kode yang Sudah Ada:**
   - Penambahan metode default dapat mempengaruhi kelas-kelas yang sudah ada yang mengimplementasikan interface tersebut. Pastikan bahwa perubahan ini tidak merusak kode yang sudah ada.

Dalam beberapa kasus, menggunakan metode default mungkin terlihat tidak perlu dan dapat menambah kompleksitas. Jadi, keputusan untuk menggunakan atau tidak menggunakan metode default sebaiknya didasarkan pada situasi dan kebutuhan spesifik proyek atau desain sistem. Terkadang, pendekatan yang lebih tradisional dengan hanya menggunakan metode abstrak dan kelas konkrit dapat lebih mudah dipahami dan dikelola.

## Note

Buat contekan aja biar gak lupa.
