import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Petani extends Manusia{
    private String asal_kota;
    private static int counterPetani = 0;
    private int C = 0;    

    public Petani(){
        counterPetani++;
    }

    public Petani(String Nama, String tgl_mulai_kerja, String Alamat, double Pendapatan, String asal_kota){
        this.Nama = Nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.Alamat = Alamat;
        this.Pendapatan = Pendapatan;
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public void setAsal_kota(String asal_kota){
        this.asal_kota= asal_kota;
    }

    public String getAsal_kota(){
        return asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public double hitungPajak(){
        return 0;
    }

    public void cetakInfo(){
        System.out.println("Nama: " + Nama);
        System.out.println("Pekerjaan: Petani");
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Alamat: " + Alamat);
        System.out.println("Tangal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Pendapatan: " + toRupiah(Pendapatan));
        System.out.println("Pajak: " + toRupiah(hitungPajak()));
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " hari");
        System.out.println();
    }

    @Override
    public int hitungMasaKerja() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", new Locale("id", "ID"));
        LocalDate tglMulai = LocalDate.parse(tgl_mulai_kerja, formatter);
        int Selisih = (int) ChronoUnit.DAYS.between(tglMulai, LocalDate.now());
        return Selisih + C;
    }
}
