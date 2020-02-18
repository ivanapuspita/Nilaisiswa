
package nilaisiswa;

import java.util.Scanner;
import perhitungan.Nilaiakhir;
import perhitungan.Tugas;
import java.lang.System.*;


public class Nilaisiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kmb;
        Scanner pilih = new Scanner(System.in);
        do{
            Scanner menu= new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1. Masukan data nilai mahasiswa");
            System.out.println("2. Keluar");
            System.out.print("Pilih : ");
            int Menu = menu.nextInt();
            
            switch(Menu)
            {
                case 1:
                    double tugas1, tugas2, tugas3, uts, uas, n_akhir;
                    int x;
                    Scanner input = new Scanner(System.in);
                    System.out.println("Data Nilai Siswa");

                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("No Induk : ");
                    String noinduk = input.nextLine();
                    System.out.print("Nilai Tugas 1 (dalam puluhan) : ");
                    tugas1 = input.nextDouble();
                    System.out.print("Nilai Tugas 2 : ");
                    tugas2 = input.nextDouble();
                    System.out.print("Nilai Tugas 3 : ");
                    tugas3 = input.nextDouble();
                    System.out.print("Nilai UTS : ");
                    uts = input.nextDouble();
                    System.out.print("Nilai UAS : ");
                    uas = input.nextDouble();
                    System.out.print("Poin : ");
                    x = input.nextInt();

                    Tugas akhir= new Tugas();
                    System.out.println("Nilai Rata-rata Tugas : " + akhir.ratatugas(tugas1, tugas2, tugas3));
                    double n_tugas = akhir.ratatugas(tugas1, tugas2, tugas3);
                    Nilaiakhir total= new Nilaiakhir();
                    System.out.println("Nilai Akhir Siswa : " + total.n_akhir(n_tugas, uts, uas) );
                    Poin plus= new Poin();
                    System.out.println("Nilai akhir ditambah poin : " + plus.nilaipoin(x, total.n_akhir(n_tugas, uts, uas)));

                    double n_siswa = plus.nilaipoin(x, total.n_akhir(n_tugas, uts, uas));

                    if (n_siswa >= 85)
                    {
                        System.out.println("Grade A");
                    }
                    else if (n_siswa>=70 && n_siswa <=84)
                    {
                        System.out.println("Grade B");
                    }
                    else if (n_siswa >=60 && n_siswa <=69)
                    {
                        System.out.println("Grade C");
                    }
                    else if (n_siswa>=50 && n_siswa <=59)
                    {
                        System.out.println("Grade D");
                    }
                    else
                        System.out.println("Grade E");
                    break;
        
                case 2:
                    System.exit(0);
                    break;
        
            }
                              
            System.out.print("Kembali ke menu [y/n] : ");
            kmb = pilih.next();

        }while(kmb.equals("y") || kmb.equals("Y"));
        
    }
    
}
