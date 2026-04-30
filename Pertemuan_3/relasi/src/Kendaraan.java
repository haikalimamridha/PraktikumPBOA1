public class Kendaraan {
    //atribut
    private String noPlat;
    private String jenis;

    //konstruktor wo parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    //konstruktor dgn parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor
    public String getnoPlat(){
        return this.noPlat;
    }
    public String getJenis(){
        return this.jenis;
    }

    //mutator
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
