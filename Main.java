public class Main {
    public static void main(String[] args) {
        //menggunakan default constructor
        Pegawai pegawai1 = new Pegawai();
        pegawai1.displayInfo();
        System.out.println("========================");

        //menggunakan overloading constructor
        Pegawai pegawai2 = new Pegawai("Tawan", "Manager", 5000000, 1500000, 500000, 100000);
        pegawai2.displayInfo();

        //menambah bonus dan menghitung ulang
        System.out.println("\nMenambahkan Bonus...");
        pegawai2.tambahBonus(100000);
        pegawai2.displayInfo();
    }
}

