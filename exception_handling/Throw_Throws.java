import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Throw_Throws {
    public static void main(String[] args) {
        // === Contoh throw (lempar exception manual) ===
        try {
            cekUmur(15); // umur < 18 -> lempar IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error dari throw: " + e.getMessage());
        }

        // === Contoh throws (method yang mendeklarasikan exception) ===
        try {
            bacaFile(); // method ini punya throws
        } catch (FileNotFoundException e) {
            System.out.println("Error dari throws: File tidak ditemukan!");
        }
    }

    // Method dengan throw (lempar exception secara manual)
    public static void cekUmur(int umur) {
        if (umur < 18) {
            throw new IllegalArgumentException("Umur minimal 18 tahun!");
        } else {
            System.out.println("Umur valid: " + umur);
        }
    }

    // Method dengan throws (Checked Exception)
    public static void bacaFile() throws FileNotFoundException {
        File file = new File("data.txt"); // file tidak ada
        Scanner sc = new Scanner(file);
        sc.close();
    }
}
