public class Main {
    public static void main(String[] args){
        // 4e
        Dosen D1 = new Dosen("bambang", "D123456679");
        Dosen D2 = new Dosen("carti", "D09876543");
        Mahasiswa M1 = new Mahasiswa("Haikal Imam Ridha", "24060124130097", D1);
        Mahasiswa M2 = new Mahasiswa("tunftungtung sahur", "6767676767", D1);
        Mahasiswa M3 = new Mahasiswa("charlie kirk", "6969696996", D2);
        Mahasiswa M4 = new Mahasiswa("nate higger", "9999999999", D2);
        Mahasiswa M5 = new Mahasiswa("bingung", "123456", D2);

        //4i
        M3.setWali(D1);

        // 4f
        seminar.registrasi(M1);
        seminar.registrasi(M2);
        seminar.registrasi(M3);
        seminar.registrasi(M4);
        seminar.registrasi(M5);
        seminar.registrasi(D1);
        seminar.registrasi(D2);

        //4g
        System.out.println("Data Peserta: ");
        seminar.tampilPeserta();
        //4c
        System.out.println("jumlah peserta: "+ seminar.countPeserta());

        // 4j
        System.out.println("-----------------------------------------------------");
        System.out.println("Data Mahasiswa: ");

        for (Civitasakademika i : seminar.peserta) {
            if(i instanceof Mahasiswa){
                ((Mahasiswa)i).tampilDataMahasiswa();
            }
        }
        // 4h
        System.out.println("jumlah Mahasiswa: "+ seminar.countMahasiswa());
        
    }
}
