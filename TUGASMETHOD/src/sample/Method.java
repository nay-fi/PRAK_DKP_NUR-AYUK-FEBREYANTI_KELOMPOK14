package sample;

import java.util.Scanner;

public class Method {

    static void cetak(String jenis_tempat){
        System.out.println("\n================================================================\n" +
                            "      ---- Selamat datang pada bagian "+jenis_tempat+" ---- \n" +
                            "        ---- Silahkan untuk menikmati layanan kami ----\n" +
                            "================================================================");
    }
    static void cetak_menu(){
        System.out.println("__________________________"+
                "\n| Silahkan pilih layanan |\n|  Yang ingin Anda pilih |" +
                "\n|------------------------|"+
                "\n|    1. Makanan          |"+
                "\n|    2. Sewa             |"+
                "\n|    3. Futsal           |"+
                "\n|________________________|");
    }
    static Integer hitung(int c,int b){
        int jumlah=c*b;
        return jumlah;
    }
    static void cetak1(String jenis){
        System.out.println("Berapa banyak "+jenis+" yang ingin anda beli");
    }

    public void Makanan() {
        String makan="makanan";
        cetak(makan);
        System.out.println("1. Telur = 10.0000\n"+"2. Ayam = 20.000\n"+"3. Sapi = 30.0000");
        System.out.println("Silahkan dipilih menunya(1-3)");

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        switch (a) {
            case (1):
                cetak1("Telur");
                int d =scan.nextInt();
                int telur_ayam=hitung(d,10000);
                System.out.print("Harga totalnya adalah "+telur_ayam);
                break;
            case (2):
                cetak1("Daging Ayam");
                int e=scan.nextInt();
                int ayam=hitung(e,20000);
                System.out.print("Harga totalnya adalah "+ayam);
                break;
            case (3):
                cetak1("Daging Sapi");
                int f=scan.nextInt();
                int sapi=hitung(f,30000);
                System.out.print("Harga totalnya adalah "+sapi);
                break;
            default:System.out.println("Tidak ada pesanan bos");
            System.exit(0);
            break;
        }

    }
    public void Bola(){
        String tempat="Lapangan Futsal";
        cetak(tempat);
        System.out.println("Tulis waktu ingin anda bermain dalam jam(1 jam,2 jam,3 jam, dst(tidak ada setengah jam))");

        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int sewa=hitung(s,50000);
        System.out.println("Anda ingin bermain selama "+Integer.toString(s)+" Dan total harganya adalah sebesar "+Integer.toString(sewa));
    }

    public static void main(String[] args) {
        System.out.println("+======================================================+"+
                         "\n|              --- Kelompok 14 ---                     |"+
                         "\n|  Anggota Kelompok  :                                 |"+
                         "\n|  Khasandra Nur Pristiwaning rahayu    21120120140089 |"+
                         "\n|  Muhanif Rafi Ahmadi                  21120120130044 |"+
                         "\n|  Nur Ayuk Febreyanti                  21120120130053 |"+
                         "\n|  Rosyad Shidqi Dikpimmas              21120120130161 |"+
                         "\n+======================================================+");

        Scanner scan = new Scanner(System.in);
        cetak("Halaman utama");
        cetak_menu();

        int i = scan.nextInt();
        while(i>3 || i<1) {
            cetak_menu();
            i = scan.nextInt();
        }
        if(i==1){
            Method objek = new Method();
            objek.Makanan();
        }
        else{
            Method objek = new Method();
            objek.Bola();
        }

    }

}
