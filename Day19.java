public class Main {
    public static void main(String[] args) {
        
        double angkaD = 99.99;
        int angkaI = (int) angkaD;
        short angkaS = (short) angkaI;
        byte angkaB = (byte) angkaS;
        
        System.out.println("Angka Double : " + angkaD);
        System.out.println("Angka Int    : " + angkaI);
        System.out.println("Angka Short  : " + angkaS);
        System.out.println("Angka Byte   : " + angkaB);
    }
}
