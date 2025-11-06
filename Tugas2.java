import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Volly"};

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoltek = sc.nextInt();
        sc.nextLine();

        String[][][] atlet = new String[jumlahPoltek][cabor.length][5];

        for (int p = 0; p < jumlahPoltek; p++) {
            System.out.println("\n=== Input Data Politeknik ke-" + (p+1) + " ===");

            for (int c = 0; c < cabor.length; c++) {
                System.out.println("Cabang: " + cabor[c]);

                for (int a = 0; a < 5; a++) {
                    System.out.print("Masukkan nama atlet ke-" + (a+1) + ": ");
                    atlet[p][c][a] = sc.nextLine();
                }
                System.out.println();
            }
        }

        System.out.println("\n===== DAFTAR ATLET PORSENI =====");
        for (int p = 0; p < jumlahPoltek; p++) {
            System.out.println("\nPoliteknik ke-" + (p+1));

            for (int c = 0; c < cabor.length; c++) {
                System.out.println("Cabor " + cabor[c] + ": ");

                for (int a = 0; a < 5; a++) {
                    System.out.println("- " + atlet[p][c][a]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}