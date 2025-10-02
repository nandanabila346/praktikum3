public class BlokTryCatch {
    public static void main(String[] args) {
        try {
            int angka = 10;
            int pembagi = 0;
            int hasil = angka / pembagi; // akan error ArithmeticException
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: Tidak bisa membagi dengan nol!");
        }

        System.out.println("Program selesai dan tetap berjalan.");
    }
}
