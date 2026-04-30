public class MPegawai{
    public static void main(String[] args) {
        
        DosenTetap d = new DosenTetap();
        
        d.setNIP("9545647548");
        d.setNama("budi"); 
        d.setNIDN("78647324");
        d.setTanggalLahir("5 Mei 1990");
        d.setTMT("1 Januari 2015");
        d.setFakultas("Fakultas Sains dan Matematika");
        d.setGajiPokok(5000000);

        DosenTamu dt = new DosenTamu();

        dt.setNIP("9545647548");
        dt.setNama("budi"); 
        dt.setNIDK("78647324");
        dt.setTanggalLahir("5 Mei 1990");
        dt.setTMT("1 Januari 2026");
        dt.setFakultas("Fakultas Sains dan Matematika");
        dt.setTglAkhirKontrak("5 Mei 2026");
        dt.setGajiPokok(5000000);

        Tendik T = new Tendik();

        T.setNIP("9545647548");
        T.setNama("budi"); 
        T.setTanggalLahir("5 Mei 1990");
        T.setTMT("1 Januari 2015");
        T.setBidang("Administrasi");
        T.setGajiPokok(5000000);


        // T.printInfo();
        // dt.printInfo();
        // d.printInfo();
    }


    
}
