package array_collection;

public class Array {
    public static void main(String[] args) {
        // Membuat array bilangan bulat
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Isi Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);
        }

        // Contoh akses langsung
        System.out.println("\nAkses elemen ke-2: " + numbers[1]);
    }
}
