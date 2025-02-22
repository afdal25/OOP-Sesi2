class pemainBola { // Mendeklarasikan kelas pemainBola
    String nama; // Mendeklarasikan atribut nama

    pemainBola(String nama) { // Untuk menginisialisasi atribut this.nama
        this.nama = nama; // membedakan antara atribut kelas (this.nama) dan parameter (nama)
    }

    void tampilkanNama() { 
        System.out.println("Nama Pemain Bola: " + this.nama); 
    } // Menampilkan teks nama pemain boladengan nilai atribut nama
}

public class Main { // Mendeklarasikan kelas Main, berfungsi sebagai titik awal program
    public static void main(String[] args) { // method utama untuk eksekusi program
        pemainBola m = new pemainBola("Lionel Messi"); // Membuat objek m dari kelas pemainBola dengan nama "Lionel Messi"
        m.tampilkanNama(); // memanggil methode tampilkanNama dari objek m untuk mencetak: Nama Pemain Bola: Lionel Messi
    }
}

/* 
Program ini mendefinisikan sebuah kelas (pemainBola) yang memiliki atribut nama, lalu membuat objek dari kelas tersebut didalam method main
untuk menampilkan nama pemain bola
*/