import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double luas = Math.PI * jariJari * jariJari;
        
        System.out.println("Luas lingkaran adalah: " + luas);
    }
          }
