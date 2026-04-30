import java.util.ArrayList;

public class Mahasiswa {
    /********** ATRIBUT **********/
    private String NIM;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /********** METHOD **********/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //konstruktor dgn parameter
    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    //selektor
    public String NIM(){
        return this.NIM;
    }
    public String nama(){
        return this.nama;
    }
    public String prodi(){
        return this.prodi;
    }
    public Dosen dosenwali(){
        return this.dosenWali;
    }
    public Kendaraan kendaraan(){
        return this.kendaraan;
    }

    //mutator
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //method
    public void addMatkul(MataKuliah newMatkul){
        listMatKul.add(newMatkul);
    }

    public void printDetailMhs(){
        System.out.println("nim : " + NIM);
        System.out.println("nama : " + nama);
        System.out.println("prodi : " + prodi);
        int i;
        for(i=0; i<listMatKul.size();i++){
            System.out.println("Mata Kuliah: " + (i+1) + "." + listMatKul.get(i).getNama());
        }
    }

    public int getJumlahSKS(){
        int TotalSKS = 0;
        int i;
        for(i=0; i<listMatKul.size();i++){
            TotalSKS = TotalSKS + listMatKul.get(i).getSks();
        }
        return TotalSKS;
    }

    public int getJumlahMatkul(){
        return listMatKul.size();
    }

    public void printMHS(){
        System.out.println();
    }
}