import java.util.Scanner;

public class InputOutput{
 public static void main(String []args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  int jumlahSKS;
  double IPK;

  System.out.print("Masukkan nama anda");
  nama = scanner.nextLine();
  System.out.println("Hai, "+nama);

  System.out.println("Masukkan jumlah SKS yang sudah ditempuh : ");
  jumlahSks = scanner.nextInt();

  
  System.out.println("Masukkan IPK Sementara : ");
  IPK = scanner.nextDouble();

  double jumlah = IPK * jumlahSks;
  System.out.print("Total Nilai = "+jumlah);

}