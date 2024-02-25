import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        String jenisKelamin = ""; GIT// Variabel untuk menyimpan jenis kelamin
        boolean jenisKelaminValid = false; // Flag untuk menandai apakah input jenis kelamin valid

        // Meminta pengguna untuk memasukkan jenis kelamin dengan perulangan hingga input valid
        while (!jenisKelaminValid) {
            System.out.print("Jenis Kelamin (L/P): ");
            String jenisKelaminInput = scanner.nextLine();

            // Memeriksa apakah input jenis kelamin valid
            if (jenisKelaminInput.equalsIgnoreCase("L")) {
                jenisKelamin = "Laki-laki";
                jenisKelaminValid = true;
            } else if (jenisKelaminInput.equalsIgnoreCase("P")) {
                jenisKelamin = "Perempuan";
                jenisKelaminValid = true;
            } else {
                System.out.println("Input jenis kelamin tidak valid. Harap masukkan 'L' atau 'P'.");
            }
        }

        // Meminta pengguna untuk memasukkan tanggal lahir
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirInput = scanner.nextLine();
        // Mengonversi input tanggal lahir menjadi objek LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        // Menghitung umur berdasarkan tanggal lahir dan tanggal saat ini
        LocalDate today = LocalDate.now();
        Period period = Period.between(tanggalLahir, today);

        // Menampilkan informasi data diri, termasuk nama, jenis kelamin, dan umur
        System.out.println("\nNama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Anda: " + period.getYears() + " tahun " + period.getMonths() + " bulan");
    }
}
