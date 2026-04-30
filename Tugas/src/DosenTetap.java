public class DosenTetap extends Dosen{
    private int BUP = 65;
    public String NIDN;
    public String Jabatan = "Dosen Tetap";
    private Double Tunjangan = 0.02; 

    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public String hitungBUP(){
        return hitungBUP(BUP);
    }

    @Override
    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("NIDN: " + NIDN);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Jabatan: " + Jabatan);
        System.out.println("Fakultas: " + Fakultas);
        System.out.println("Masa Kerja: " + MasaKerja(TMT));
        System.out.println("Tanggal Pensiun: " + hitungBUP());
        System.out.println("Gaji Pokok: " + setRupiah(getGajiPokok()));
        System.out.println("Tunjangan: " + (int) (Tunjangan*100) + "% x " + TahunMK(TMT) + " x " + setRupiah(getGajiPokok()) + " = " + setRupiah(Tunjangan * TahunMK(TMT) * getGajiPokok()));
    
    }

}
