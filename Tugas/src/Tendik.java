public class Tendik extends Pegawai{
    
    public String Bidang;
    private int BUP = 55;
    public String Jabatan = "Tendik";
    private double Tunjangan = 0.01;

    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    public String hitungBUP(){
        return hitungBUP(BUP);
    }
    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Jabatan: " + Jabatan);
        System.out.println("Bidang Tempat Bekerja: " + Bidang);
        System.out.println("Masa Kerja: " + MasaKerja(TMT));
        System.out.println("Tanggal Pensiun: " + hitungBUP());
        System.out.println("Gaji Pokok: " + setRupiah(getGajiPokok()));
        System.out.println("Tunjangan: " + (int) (Tunjangan*100) + "% x " + TahunMK(TMT) + " x " + setRupiah(getGajiPokok()) + " = " + setRupiah(Tunjangan * TahunMK(TMT) * getGajiPokok()));
    
    }
}