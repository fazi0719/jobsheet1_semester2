import java.util.Scanner;
public class array06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("===================");
       System.out.println(" Program Menghitung IP Semester");
       System.out.println("===================");

       String[] MK = {"Pancasila", "Konsep Teknologi Informatika", "Critical Thinking dan Problem Solving", 
       "Matematika Dasar", "Bahasa Inggris", "Dasar Pemprograman",
       "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};

       int[] sis = {2, 2, 2, 3, 2, 3, 1, 2}; 

        double[] nilaiAngka = new double[MK.length];
        String[] nilaiHuruf = new String[MK.length];
        double[] nilaiSetara = new double[MK.length];

    
        for (int i = 0; i < MK.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + MK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";   nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";  nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";   nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";  nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";   nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";   nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";   nilaiSetara[i] = 0.0;
            }
        }

      
       System.out.println("\nhasil Konversi Nilai");
        System.out.println("==============================================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < MK.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    MK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
            totalBobot += nilaiSetara[i] * sis[i];
            totalSKS += sis[i];
        }
        double ip = totalBobot / totalSKS;
        
        System.out.println("==============================================================");
        System.out.printf("IP : %.2f\n", ip);

        sc.close();
    }
}

            