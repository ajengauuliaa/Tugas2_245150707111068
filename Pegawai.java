//kelas pegawai
class Pegawai {
    //atribut
    String nama;
    String jabatan;
    double gajiPokok;
    double tunjangan;
    double potongan;
    double bonus;

    //default constructor
    public Pegawai(){
        this.nama = "";
        this.jabatan = "";
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.potongan = 0;
        this.bonus = 0;
    }

    //overloading constructor
    public Pegawai(String nama, String jabatan, double gajiPokok, double tunjangan, double potongan, double bonus){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.bonus = bonus;
    }

    //method untuk menghitung gaji total pegawai
    public double hitungGajiTotal(){
        return gajiPokok + tunjangan - potongan + bonus;
    }

    //method untuk menampilkan informasi pegawai
    public void displayInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Potongan : " + potongan);
        System.out.println("Bonus : " + bonus);
        System.out.println("Gaji Total : " + hitungGajiTotal());
    }

    //method untuk menambahkan bonus
    public void tambahBonus(double tambahBonus){
        this.bonus += tambahBonus;
    }
}

