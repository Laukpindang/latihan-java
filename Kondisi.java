import java.util.Scanner;

public class Kondisi {
  public static void main(String[] args) {
    // buat variabel
    Scanner scan = new Scanner(System.in);

    // minta user input angka
    System.out.print("Masukkan angka: ");
    // masukkan input ke variabel
    int angka = scan.nextInt();
    
    // kondisi input modulo 2 untuk mencari tahu ganjil/genap
    if (angka % 2 == 0) {
      // output ketika genap
      System.out.println(angka + " adalah genap");
    } else {
      // output ketika ganjil
      System.out.println(angka + " adalah ganjil");
    }

    scan.close();
  }
}
