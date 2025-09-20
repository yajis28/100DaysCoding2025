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
