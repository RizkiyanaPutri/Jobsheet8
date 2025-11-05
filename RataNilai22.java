import java.util.Scanner;

public class RataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        float nilai, totalNilai, rataNilai;

        i = 1;
        while (i <= 5) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke-" + i);

            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextFloat();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai Mahasiswa ke-" + i + " adalah " + rataNilai);
        }
        sc.close();
    }
}
