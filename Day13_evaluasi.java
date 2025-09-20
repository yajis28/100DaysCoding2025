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
