import java.util.ArrayList;

// soal 4a
abstract class Civitasakademika{
    protected String Nama;

    public Civitasakademika(){

    }

    public Civitasakademika(String Nama){
        this.Nama = Nama;
    }

    public String getNama(){
        return Nama;
    }

    public abstract String getNomor();
}

class Dosen extends Civitasakademika{
    protected String NIP;

    public Dosen(){

    }

    public Dosen(String Nama, String NIP){
        super(Nama);
        this.NIP = NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNomor(){
        return NIP;
    }
}

class Mahasiswa extends Civitasakademika{
    protected String NIM;
    protected Dosen DosenWali;

    public Mahasiswa(){

    }

    public Mahasiswa(String Nama, String NIM, Dosen DosenWali){
        super(Nama);
        this.NIM=NIM;
        this.DosenWali=DosenWali;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    // 4i
    public void setWali(Dosen DosenWali){
        this.DosenWali=DosenWali;
    }

    public String getNomor(){
        return NIM;
    }

    public Dosen getDosenWali(){
        return DosenWali;
    }

    // 4j
    public void tampilDataMahasiswa(){
        System.out.println(getNama() + " | " + getNomor() + " | " + getDosenWali().getNama());
    }
}

// 4b
class seminar{
    protected static ArrayList<Civitasakademika> peserta = new ArrayList<>();
    protected int BanyakPeserta;
    protected static int countP = 0;
    protected static int countM = 0;

    public seminar(){
        this.BanyakPeserta = 0;
    }

    // 4c
    public static int countPeserta(){
        return countP;
    }

    // 4d
    public static void registrasi(Civitasakademika x){
        peserta.add(x);
        countP++;
        if(x instanceof Mahasiswa){
            countM++;
        }
    }

    // 4g
    public static void tampilPeserta(){
        for (Civitasakademika i : peserta) {
            System.out.println(i.getNama() + " | " + i.getNomor());
        }
    }

    // 4h
    public static int countMahasiswa(){
        return countM;
    }



}