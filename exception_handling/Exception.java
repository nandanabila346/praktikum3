import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; 
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error (Unchecked): " + e.getMessage());
        }

        try {
            bacaFile(); 
        } catch (FileNotFoundException e) {
            System.out.println("Error (Checked): File tidak ditemukan!");
        }

        try {
            String teks = null;
            System.out.println(teks.length());
        } catch (NullPointerException e) {
            System.out.println("Error: objek bernilai null!");
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }

        try {
            cekUmur(15); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error (Throw): " + e.getMessage());
        }
    }

    public static void bacaFile() throws FileNotFoundException {
        File file = new File("data.txt"); 
        Scanner sc = new Scanner(file);
        sc.close();
    }

    public static void cekUmur(int umur) {
        if (umur < 18) {
            throw new IllegalArgumentException("Umur minimal 18 tahun!");
        } else {
            System.out.println("Umur valid: " + umur);
        }
    }
}
