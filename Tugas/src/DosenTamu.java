import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DosenTamu extends Dosen{
    public String TglAkhirKontrak;
    public String NIDK;
    public String Jabatan = "Dosen Tamu";
    private Double Tunjangan = 0.025;

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public void setTglAkhirKontrak(String TglAkhirKontrak){
        this.TglAkhirKontrak = TglAkhirKontrak;
    }

    public String SisaBulan(String akhirkontrak) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        LocalDate selesai = LocalDate.parse(akhirkontrak, formatter);
        LocalDate sekarang = LocalDate.now();
        int bulan = (int)ChronoUnit.MONTHS.between(selesai, sekarang);
        int hari = (int)ChronoUnit.MONTHS.between(selesai, sekarang);

        return bulan + " bulan " + Math.abs(hari) + " Hari";
    }

    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("NIDK: " + NIDK);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Jabatan: " + Jabatan);
        System.out.println("Fakultas: " + Fakultas);
        System.out.println("Masa Kerja: " + SisaBulan(TMT));
        System.out.println("Masa Kontrak Berakhir: " + SisaBulan(TglAkhirKontrak));
        System.out.println("Gaji Pokok: " + setRupiah(getGajiPokok()));
        System.out.println("Tunjangan: " + (int) (Tunjangan*100) + "% x " + setRupiah(getGajiPokok()) + " = " + setRupiah(Tunjangan *  getGajiPokok()));
    
    }
}
