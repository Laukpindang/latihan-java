import java.util.Scanner;

public class PerulanganTentu {
  public static void main(String[] args) {
    // buat variabel
    Scanner scan = new Scanner(System.in);

    // minta user memasukkan kata
    System.out.print("Masukkan suatu kata: ");
    // input dimasukkan ke variabel
    String kata = scan.nextLine();
    // minta user memasukkan berapa kali perulangan
    System.out.print("Masukkan berapa kali perulangan: ");
    // masukkan jumlah perulangan ke variabel
    int ulang = scan.nextInt();

    // perulangan dimulai dari 0 yaitu i, selama i kurang dari variabel "ulang", i akan bertambah 1 setiap kali perulangan terjadi
    for (int i = 0; i < ulang; i++) {
      // tampilkan kata dari user
      System.out.println(kata);
    }

    scan.close();
  }
}
