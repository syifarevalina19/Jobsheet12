import java.util.Scanner;

public class Tugas28 {
    static final int JUMLAH_MAHASISWA = 5;
    static final int JUMLAH_MINGGU = 7;

    static int[][] nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];

    public static void main(String[] args) {
        inputNilaiMahasiswa();
        tampilkanNilaiMahasiswa();
        cariHariTertinggi();
        tampilkanMahasiswaTertinggi();
    }

    static void inputNilaiMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.println("Masukkan nilai untuk mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        } 
    }

    static void tampilkanNilaiMahasiswa() {
        System.out.println("\nNilai Mahasiswa:");

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void cariHariTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < JUMLAH_MINGGU; j++) {
            int totalNilai = 0;

            for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
                totalNilai += nilaiMahasiswa[i][j];
            }

            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                hariTertinggi = j;
            }
        }

        System.out.println("\nHari dengan nilai tertinggi adalah Minggu ke-" + (hariTertinggi + 1));
    }

    static void tampilkanMahasiswaTertinggi() {
        System.out.println("\nMahasiswa dengan nilai tertinggi:");

        int nilaiTertinggi = 0;
        int mahasiswaTertinggi = 0;
        int mingguTertinggi = 0;

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            int totalNilai = 0;

            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }

            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                mahasiswaTertinggi = i;
                mingguTertinggi = 1;
            }
        }

        System.out.println("Mahasiswa " + (mahasiswaTertinggi + 1) + " dengan nilai tertinggi pada minggu ke-" + mingguTertinggi);
    }
}
