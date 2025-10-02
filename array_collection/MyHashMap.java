package array_collection;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        // Membuat HashMap untuk menyimpan data nama dan nilai
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Menambahkan data ke HashMap
        studentScores.put("Nanda", 85);
        studentScores.put("Budi", 90);
        studentScores.put("Siti", 78);

        // Menampilkan semua data
        System.out.println("Nilai Mahasiswa:");
        for (String key : studentScores.keySet()) {
            System.out.println(key + " : " + studentScores.get(key));
        }

        // Mengakses salah satu data
        System.out.println("\nNilai Budi: " + studentScores.get("Budi"));
    }
}
