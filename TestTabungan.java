
/**
 * Write a description of class TestTabungan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class TestTabungan
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        print("+-----------------------------------+");
        print(" 1. Mode tamu \n 2. Mode Penggguna\n 3. Keluar\n ");
        System.out.print("    Pilihan: ");
        int pilihan = input.nextInt();
        print("+-----------------------------------+");

        switch (pilihan) {
            case 1:
                Tabungan tabungan = new Tabungan();
                print("Saldo pada mode tamu adalah "+ tabungan.getSaldo());              
                break;
            case 2:
                /*  SALDO_AWAL_MINIMUM = 1000000;
                    SALDO_MINIMUM = 1000000;
                    SETORAN_MINIMUM = 50000;
                    */ 
                print("Test subclass Bisnis");
                print("+-----------------------------------+");
                print("1. Mengecek jumlah uang disetor tidak kurang dari saldo minimum");
                print("  Setoran awal uang bisnis Rp900.000");
                Tabungan bisnis = new Bisnis("Muny",12345231,900000);
                cekSaldo(bisnis);

                print("2. Mengecek jumlah uang disetor lebih dari sama dengan setoran minimum");
                print("  Setoran awal uang bisnis Rp1.500.000");
                Tabungan pengguna = new Bisnis("Yoona",13232,1500000);
                cekSaldo(pengguna);

                print("3. Mengecek jumlah uang yang ditarik tidak boleh"+
                    "negatif, \n   tidak boleh lebih dari saldo dan sisa sesudah penarikan\n   tidak boleh kurang dari saldo"
                     +"minimum.");
                print("  Tambah Uang Rp900.000");
                pengguna.tarikUang(900000);
                cekSaldo(pengguna);
                print("  Tambah Uang Rp300.000");
                pengguna.tarikUang(300000);
                cekSaldo(pengguna);

                print("4. Mengecek uang yang disetor tidak boleh kurang dari setoran minimum");
                print("  Tambah Uang Rp40.000");
                pengguna.simpanUang(40000);
                cekSaldo(pengguna);
                print("  Tambah Uang Rp60.000");
                pengguna.simpanUang(60000);
                cekSaldo(pengguna);

                /**SALDO_AWAL_MINIMUM = 500_000;
                 * SALDO_MINIMUM = 1_000_000;
                 * SETORAN_MINIMUM = 50_000;*/      
                    
                print("+-----------------------------------+");
                print("Test subclass Haji");
                print("+-----------------------------------+");
                print("5. pengecekan jumlah uang yang ditarik tidak boleh lebih\n   dari 10% dari total saldo haji");
                
                print("- cek saldo tidak boleh kurang dari saldo awal minimum");
                print("  Setoran Awal uang haji Rp300.000");
                Tabungan haji = new Haji("Muny",2783197, 300000 );
                cekSaldo(haji);

                print("  Setoran Awal uang haji Rp800.000");
                Tabungan pengguna2 = new Haji("Muny",2783197, 800000 );
                cekSaldo(pengguna2);
                print("  Tambah Uang Rp600.000");
                pengguna2.simpanUang(600000);
                cekSaldo(pengguna2);

                print("- cek saldo jika saldo tidak tarik uang lebih dari 10%");
                print("  Tarik uang Rp100.000");
                pengguna2.tarikUang(100000);
                cekSaldo(pengguna2);

                print("- cek saldo jika saldo ditarik lebih dari 10%");
                print("  Tarik uang Rp200.000");
                pengguna2.tarikUang(200000);
                cekSaldo(pengguna2);

                print("- cek saldo jika saldo ditarik membuat saldo kurang dari saldo awal minimum");
                print("  Tarik uang Rp400.000");
                pengguna2.tarikUang(400000);
                cekSaldo(pengguna2);   
                break;
            case 3:
                System.exit(0);
            default:
                break;
        }
    }

    public static void print(String kata){
        System.out.println(kata);
    }
    public static void cekSaldo(Tabungan tabungan){
        print("  Saldo anda: "+tabungan.getSaldo()+"\n");
    }

}
