public class Main {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        int tukar = a;
        a = b;        
        b = tukar;    

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    }
