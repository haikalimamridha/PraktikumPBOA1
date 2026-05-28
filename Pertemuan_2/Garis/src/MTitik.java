/*  Nama File : MTitik.java
    Deskripsi : berisi atribut dan method dalam class Titik
    Pembuat   : Haikal Imam Ridha
    Tanggal   : 02-03-2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = new Titik(1,1);

        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        T1.getKuadran();
        System.out.println(T1.getJarakPusat());
        System.out.println(T1.getJarak(T2));
    
        
        // System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah objek titik = " + T2.getCounterTitik());
    }

}