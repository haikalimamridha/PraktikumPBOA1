import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class PNS extends Manusia{
    private String NIP;
    private static int counterPNS = 0;
    private int A = 7;

    public PNS(){
        counterPNS++;
    }

    public PNS(String Nama, String tgl_mulai_kerja, String Alamat, double Pendapatan, String NIP){
        this.Nama = Nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.Alamat = Alamat;
        this.Pendapatan = Pendapatan;
        this.NIP = NIP;
        counterPNS++;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNIP(){
        return NIP;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public double hitungPajak(){
        return 0.1 * Pendapatan;
    }

    public void cetakInfo(){
        System.out.println("Nama: " + Nama);
        System.out.println("Pekerjaan: PNS");
        System.out.println("NIP: " + NIP);
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
        return Selisih + A;
    }
}
