public class Dosen {
    // ATRIBUT //
    private String nip;
    private String nama;
    private String prodi;

    // Konstruktor tanpa parameter
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Setter
    String getNipDosen(){
        return this.nip;
    }
    String getNamaDosen(){
        return this.nama;
    }
    String getProdiDosen(){
        return this.prodi;
    }

    //Mutator
    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

}
