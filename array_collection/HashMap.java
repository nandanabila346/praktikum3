package array_collection;

public class HashMap {
    public static void main(String[] args) {
        // Gunakan HashMap bawaan Java dengan nama lengkap (fully qualified)
        java.util.HashMap<String, Integer> studentScores = new java.util.HashMap<>();

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
