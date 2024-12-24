import java.util.Scanner;

public class PerulanganTakTentu {
  public static void main(String[] args) {
    // buat variable
    Scanner scan = new Scanner(System.in);
    boolean lanjut = true;
    int perulangan = 1;

    // perulangan ketika variabel "lanjut" true
    while (lanjut) {
      // tampilkan perulangan ke sekian
      System.out.println("Perulangan ke-" + perulangan);
      // tambah perulangan
      perulangan++;
      // minta user input lanjut atau tidak
      System.out.print("Lanjut (true/false): ");
      // ganti variabel lanjut dengan input user
      lanjut = scan.nextBoolean();
    }
    
    scan.close();
  }
}