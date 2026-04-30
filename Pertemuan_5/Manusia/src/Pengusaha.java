import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Pengusaha extends Manusia{
    private String NPWP;
    private static int counterPengusaha = 0;
    private int B = 9;


    public Pengusaha(){
        counterPengusaha++;
    }

    public Pengusaha(String Nama, String tgl_mulai_kerja, String Alamat, double Pendapatan, String NPWP){
        this.Nama = Nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.Alamat = Alamat;
        this.Pendapatan = Pendapatan;
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    public void setNPWP(String NPWP){
        this.NPWP = NPWP;
    }

    public String getNPWP(){
        return NPWP;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public double hitungPajak(){
        return 0.15 * Pendapatan;
    }

    public void cetakInfo(){
        System.out.println("Nama: " + Nama);
        System.out.println("Pekerjaan: Pengusaha");
        System.out.println("NPWP: " + NPWP);
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
        return Selisih + B;
    }
}
