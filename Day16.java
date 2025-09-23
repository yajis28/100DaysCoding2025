import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan angka \t\t : ");
        int AngkaPertama = input.nextInt();
        
        System.out.print("Masukkan operator \t : ");
        char operator = input.next().charAt(0);
      
        System.out.print("Masukkan angka \t\t : ");
        int AngkaKedua = input.nextInt();
        
        double hasilOperasi;
        
        if(operator == '*'){
            hasilOperasi  = AngkaPertama * AngkaKedua;
            System.out.println("Hasil perkalian \t : " + hasilOperasi);
            
        }else if(operator == '/'){
            hasilOperasi = AngkaPertama / AngkaKedua;
            System.out.println("Hasil pembagian \t : " +hasilOperasi);
     
        } else{
            System.out.println("Operator tidak dikenali ");
        }       

    }
              }
