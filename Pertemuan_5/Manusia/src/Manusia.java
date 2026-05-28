import java.text.NumberFormat;
import java.util.Locale;

public abstract class Manusia {
    protected String Nama;
    protected String tgl_mulai_kerja;
    protected String Alamat;
    protected double Pendapatan;
    protected static int CounterMNS = 0;


    public Manusia(){
        CounterMNS++;
    }

    public Manusia(String Nama, String tgl_mulai_kerja, String Alamat, double Pendapatan){
        this.Nama = Nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.Alamat = Alamat;
        this.Pendapatan = Pendapatan;
        CounterMNS++;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getNama(){
        return Nama;
    }

    public void setTgl_mulai_kerja(String tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }

    public String getAlamat(){
        return Alamat;
    }

    public void setPendapatan(double Pendapatan){
        this.Pendapatan = Pendapatan;
    }

    public double getPendapatan(){
        return Pendapatan;
    }

    public static int getCounterMns(){
        return CounterMNS;
    }

    public String toRupiah(double x){
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        String hasil = formatRupiah.format(x);
        return hasil;
    }

    public abstract int hitungMasaKerja();
}
