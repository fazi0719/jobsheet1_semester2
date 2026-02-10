import java.util.Scanner;

public class pemilihan06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");

        System.out.print(" Masukkan Nilai Tugas = ");
        double tugas = sc.nextDouble();
        System.out.print(" Masukkan Nilai Kuis = ");
        double kuis = sc.nextDouble();
        System.out.print(" Masukkan Nilai UTS = ");
        double uts = sc.nextDouble();
        System.out.print(" Masukkan Nilai UAS = ");
        double uas = sc.nextDouble();

        System.out.println("===============================");
        System.out.println("===============================");

    if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || 
        uts < 0 || uts > 100 || uas < 0 || uas > 100) {

    System.out.println("Nilai tidak valid");
    System.out.println("=================");
    System.out.println("=================");

        } else {
            double nilaiAkhir = (tugas * 0.20) + (kuis * 0.20) + (uts * 0.30) + (uas * 0.40);
            System.out.println("Nilai akhir = " + nilaiAkhir);
        String nilaiHuruf;

        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        System.out.println("Nilai akhir = " + nilaiAkhir);
        System.out.println("Nilai huruf = " + nilaiHuruf);
        System.out.println("===============================");
        System.out.println("===============================");

        String status;
    if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || 
    nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
    status = "Lulus";
    } else {
    status = "Tidak Lulus";
    }
        System.out.println("Selamat anda lulus");
        }
    }
    }

