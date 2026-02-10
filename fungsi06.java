import java.util.Scanner;

public class fungsi06 {
    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static int[] harga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
       System.out.println("=========================================================");
        System.out.println("   LAPORAN PENDAPATAN DAN STATUS CABANG ROYAL GARDEN");
        System.out.println("=========================================================");

        tampilkanPendapatanDanStatus();
    }

    public static void tampilkanPendapatanDanStatus() {
        System.out.printf("%-18s %-20s %-15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += (stock[i][j] * harga[j]);
            }

            String status;
            if (totalPendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.printf("RoyalGarden %-5d Rp %, -17d %-15s\n", (i + 1), totalPendapatan, status);
        }
        System.out.println("=========================================================");
    }
}
    
