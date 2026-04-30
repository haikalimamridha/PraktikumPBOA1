import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {

    protected String NIP;
    protected String Nama;
    protected String TanggalLahir;
    protected String TMT;
    protected double GajiPokok;
    protected double Tunjangan;

    public Pegawai(){
        
    }

    public Pegawai(String NIP, String Nama, String TanggalLahir, String TMT, double GajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;

    }

    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public String getTanggalLahir(){
        return TanggalLahir;
    }

    public String getTMT(){
        return TMT;
    }

    public double getGajiPokok(){
        return GajiPokok;
    }

    public String hitungBUP(int usiaPensiun) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        LocalDate birthDate = LocalDate.parse(TanggalLahir, formatter);
        LocalDate bupDate = birthDate.plusYears(usiaPensiun).withDayOfMonth(1).plusMonths(1);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return bupDate.format(outputFormatter);
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setTanggalLahir(String TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }

    public void setTMT(String TMT){
        this.TMT = TMT;
    }

    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + GajiPokok);
    }

    public String MasaKerja(String Tanggal_Masuk) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        LocalDate masuk = LocalDate.parse(Tanggal_Masuk, formatter);
        LocalDate sekarang = LocalDate.now();
        Period Selisih = Period.between(masuk, sekarang);
        
        int Tahun = Selisih.getYears();
        int Bulan = Selisih.getMonths();

        return Tahun + " Tahun " + Bulan + " Bulan";
    }

    public int TahunMK(String Tanggal_Masuk){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        LocalDate masuk = LocalDate.parse(Tanggal_Masuk, formatter);
        LocalDate sekarang = LocalDate.now();
        Period Selisih = Period.between(masuk, sekarang);
        
        int Tahun = Selisih.getYears();

        return Tahun;
    }

    public String getMasaKerja(){
        return MasaKerja(TMT);
    }
    public String setRupiah(double uang){
        Locale indonesia = new Locale("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(indonesia);

        return rupiah.format(uang);
    }
}

