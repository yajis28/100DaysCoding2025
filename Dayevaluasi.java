//soal pertama
public class Main {
    
    public static void main(String[] args) {
        String nama = "budi";
        byte umur = 21;
        float tinggi = 170.5f;
        double berat = 65.4;
        byte nomorAbsen = 12;
        short sks = 144;
        String nim = "D0223033";
        char jeniskelamin = 'L';
        boolean statusAktif = true;
        

           

        // Tampilkan dengan println 
        System.out.println("=== Output println ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Nomor Absen: " + nomorAbsen);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("Status Aktif: " + statusAktif);

        // Tampilkan dengan print
        System.out.print("\n=== Output print ===\n");
        System.out.print("Nama: " + nama + ", ");
        System.out.print("Umur: " + umur + ", ");
        System.out.print("Tinggi: " + tinggi + " cm, ");
        System.out.print("Berat: " + berat + " kg, ");
        System.out.print("Nomor Absen: " + nomorAbsen + ", ");
        System.out.print("Jumlah SKS: " + sks + ", ");
        System.out.print("NIM: " + nim + ", ");
        System.out.print("Jenis Kelamin: " + jeniskelamin + ", ");
        System.out.print("Status Aktif: " + statusAktif);

        // Tampilkan dengan printf 
        System.out.println("\n\n=== Output printf ===");
        System.out.printf("Nama           : %s%n", nama);
        System.out.printf("Umur           : %d tahun%n", umur);
        System.out.printf("Tinggi         : %.1f cm%n", tinggi);
        System.out.printf("Berat          : %.1f kg%n", berat);
        System.out.printf("Nomor Absen    : %d%n", nomorAbsen);
        System.out.printf("Jumlah SKS     : %d%n", sks);
        System.out.printf("NIM            : %s%n", nim);
        System.out.printf("Jenis Kelamin  : %c%n", jeniskelamin);
        System.out.printf("Status Aktif   : %b%n", statusAktif);
    }
}

//soal kedua
public class Main {
    
    public static void main(String[] args) {
        
        // 1. Deklarasi variabel
        String nama;
        byte umur;
        float tinggi;
        double berat;
        byte nomorAbsen;
        short sks;
        String nim;
        char jenisKelamin;
        boolean statusAktif;

        // 2. Inisialisasi (nilai awal)
        nama = "Budi";
        umur = 21;
        tinggi = 170.5f;
        berat = 65.4;
        nomorAbsen = 12;
        sks = 144;
        nim = "D0223033";
        jenisKelamin = 'L';
        statusAktif = true;

        // 3. Update nilai (ubah sebagian data)
        nama = "Budi Santoso";   // ubah nama
        umur = 22;               // umur bertambah
        berat = 66.0;            // berat naik
        sks = 150;               // SKS bertambah

        // 4. Print menggunakan println (tiap data di baris baru)
        System.out.println("=== Data Mahasiswa Setelah Update ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Nomor Absen: " + nomorAbsen);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Status Aktif: " + statusAktif);
        
        
    }
    
}
//soal ketiga
import java.util.Scanner;
  public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data dari user
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("Apakah status aktif kuliah? (true/false): ");
        boolean statusAktif = input.nextBoolean();

        // Cetak output biodata
        System.out.println("\n=== BIODATA MAHASISWA ===");
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Tinggi Badan  : " + tinggi + " cm");
        System.out.println("Status Aktif  : " + statusAktif);
        
    }
  }
