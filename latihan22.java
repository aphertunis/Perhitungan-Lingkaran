//Nama      : Nur Riskon Abdan Syakuro
//  NIM       : 23176031
//  Prodi     : Sistem Informasi
//  Deskripsi : Program ini untuk menghitung keliling lingkaran dan luas lingkaran

import java.util.Scanner;

public class latihan22 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
          double diameter = 0;
          boolean isValidInput = false;

          System.out.println("=======Perhitungan Lingkaran=======");

          while (!isValidInput) {
              System.out.print("Masukkan nilai diameter lingkaran : ");
              String userInput = input.nextLine();

              try {
                  diameter = Double.parseDouble(userInput);

                  if (diameter > 0) {
                      isValidInput = true;
                  } else {
                      System.out.println("Nilai Diameter Tidak Sesuai\n");
                  }
              } catch (NumberFormatException e) {
                  System.out.println("Nilai Diameter Tidak Sesuai\n");
              }
          }

          double radius = diameter / 2;
          double area = Math.PI * radius * radius;
          double circumference = 2 * Math.PI * radius;

          System.out.println("=======Hasil Perhitungan Lingkaran=======");
          System.out.printf("Jari-jari Lingkaran = %.0f cm%n", radius);
          System.out.printf("Luas Lingkaran = %.2f cm%n", area);
          System.out.printf("Keliling Lingkaran = %.2f cm%n", circumference);
        }
        System.out.println("BUILD SUCCESSFUL");
    }
}
