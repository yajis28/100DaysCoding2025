public class Main {
    public static void main(String[] args) {
        // String awal
        String strInt = "100";
        String strDouble = "3.14";
        String strBoolean = "true";
        String strChar = "A"; 

        // Konversi ke tipe data primitif
        int nilaiInt = Integer.parseInt(strInt);        
        double nilaiDouble = Double.parseDouble(strDouble);  
        boolean nilaiBoolean = Boolean.parseBoolean(strBoolean); 
        char nilaiChar = strChar.charAt(0); 

        // Output hasil
        System.out.println("Integer: " + nilaiInt);
        System.out.println("Double: " + nilaiDouble);
        System.out.println("Boolean: " + nilaiBoolean);
        System.out.println("Char: " + nilaiChar);
    }
}
