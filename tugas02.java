import java.util.Scanner;
public class tugas02 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        int n = sc.nextInt();
        sc.nextLine(); 

       
        String[][] jadwal = new String[n][4];

        
        inputData(jadwal);
        tampilkanSemua(jadwal);

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String cariHari = sc.nextLine();
        tampilkanBerdasarkanHari(jadwal, cariHari);

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String cariMK = sc.nextLine();
        tampilkanBerdasarkanMK(jadwal, cariMK);
    }

   
    public static void inputData(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("\nInput Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            array[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            array[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            array[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah       : ");
            array[i][3] = sc.nextLine();
        }
    }

   
    public static void tampilkanSemua(String[][] array) {
        System.out.println("\n===============================================================================");
        System.out.printf("%-25s %-15s %-12s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("===============================================================================");
        for (String[] baris : array) {
            System.out.printf("%-25s %-15s %-12s %-15s\n", baris[0], baris[1], baris[2], baris[3]);
        }
        System.out.println("===============================================================================");
    }

    
    public static void tampilkanBerdasarkanHari(String[][] array, String hari) {
        System.out.println("\n--- Hasil Pencarian Hari: " + hari + " ---");
        boolean ditemukan = false;
        for (String[] baris : array) {
            
            if (baris[2].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s | Ruang: %-10s | Jam: %-15s\n", baris[0], baris[1], baris[3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada jadwal pada hari " + hari);
    }

   
    public static void tampilkanBerdasarkanMK(String[][] array, String mk) {
        System.out.println("\n--- Detail Mata Kuliah: " + mk + " ---");
        boolean ditemukan = false;
        for (String[] baris : array) {
            if (baris[0].equalsIgnoreCase(mk)) {
                System.out.println("Ruang      : " + baris[1]);
                System.out.println("Hari       : " + baris[2]);
                System.out.println("Jam Kuliah : " + baris[3]);
                ditemukan = true;
                break; 
        }
        if (!ditemukan) System.out.println("Mata kuliah tidak ditemukan.");
    }
}
}