import java.util.HashMap; // Import kelas HashMap dari paket java.util untuk digunakan dalam menyimpan data mahasiswa
import java.util.Scanner; // Import kelas Scanner dari paket java.util untuk menerima input dari pengguna

public class tugasDEMO {
    private HashMap<String, String> students; // Deklarasi variabel students dengan tipe HashMap yang menyimpan NIM (String) sebagai kunci dan nama mahasiswa (String) sebagai nilai
    private String adminUsername; // Deklarasi variabel adminUsername dengan tipe String untuk menyimpan username admin
    private String adminPassword; // Deklarasi variabel adminPassword dengan tipe String untuk menyimpan password admin

    // Metode untuk inisialisasi data awal
    public tugasDEMO() {
        students = new HashMap<>(); // Inisialisasi objek students sebagai HashMap kosong
        students.put("202210370311203", "Student1"); // Menambahkan entri ke dalam HashMap students
        adminUsername = "admin"; // Memberi nilai "admin" ke variabel adminUsername
        adminPassword = "admin"; // Memberi nilai "admin" ke variabel adminPassword
    }

    // Proses login sebagai mahasiswa
    public void loginAsStudent(String nim) {
        // Jika NIM ditemukan dalam daftar mahasiswa dan memiliki panjang 15 karakter, cetak pesan berhasil
        if (students.containsKey(nim) && nim.length() == 15) {
            System.out.println("Successful Login as Student");
        } else {
            // Jika tidak, cetak pesan bahwa pengguna tidak ditemukan
            System.out.println("User Not Found");
        }
    }

    // Proses login sebagai admin
    public void loginAsAdmin(String username, String password) {
        // Jika username dan password yang dimasukkan sesuai dengan adminUsername dan adminPassword, cetak pesan berhasil
        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Successful Login as Admin");
        } else {
            // Jika tidak, cetak pesan bahwa pengguna admin tidak ditemukan
            System.out.println("Admin User Not Found");
        }
    }

    // Proses utama yang mengatur alur program
    public void run() {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna
        System.out.println("Library System");
        System.out.println("1. Login as Student\n2. Login as Admin\n3. Exit");
        System.out.print("Choose option (1-3): ");
        String option = scanner.nextLine(); // Menerima input dari pengguna berupa nomor opsi dalam bentuk String

        // Menggunakan struktur kontrol switch untuk memilih opsi
        switch (option) {
            case "1":
                // Jika opsi 1 dipilih, minta NIM dan coba login sebagai mahasiswa
                System.out.print("Enter your NIM: ");
                String nim = scanner.nextLine(); // Menerima input NIM dari pengguna dalam bentuk String
                loginAsStudent(nim); // Panggil metode loginAsStudent dengan parameter NIM
                break;
            case "2":
                // Jika opsi 2 dipilih, minta username dan password dan coba login sebagai admin
                System.out.print("Enter your username (admin): ");
                String username = scanner.nextLine(); // Menerima input username dari pengguna dalam bentuk String
                System.out.print("Enter your password (admin): ");
                String password = scanner.nextLine(); // Menerima input password dari pengguna dalam bentuk String
                loginAsAdmin(username, password); // Panggil metode loginAsAdmin dengan parameter username dan password
                break;
            case "3":
                // Jika opsi 3 dipilih, keluar dari program
                System.out.println("Exiting...");
                return;
            default:
                // Jika opsi yang tidak valid dipilih, cetak pesan kesalahan
                System.out.println("Invalid option");
        }

        run(); // Rekursif untuk menjalankan ulang proses
    }

    // Metode utama untuk memulai program
    public static void main(String[] args) {
        tugasDEMO librarySystem = new tugasDEMO(); // Membuat objek librarySystem dari kelas tugasDEMO
        librarySystem.run(); // Panggil metode run untuk memulai alur program
    }
}
