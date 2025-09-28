public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int a = 5;
        int b = 10;
        int tukar = a;
        a = b;        
        b = tukar;   

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
        
    }
    
}
