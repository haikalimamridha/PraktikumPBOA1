public class Main {
    public static void main(String[] args){
        Kucing K = new Kucing();
        Anggora K1 = new Anggora(6);
        Kembangtelon K2 = new Kembangtelon(7);
        Anjing A = new Anjing();
        Datum<Kucing> anu = new Datum<>();
        // OperatorGenerik op = new OperatorGenerik();
        Data<Anabul> D = new Data<>(); 

        
        anu.setIsi(K);
        anu.getIsi().Gerak();

        D.setIsi(1, K1);
        D.setIsi(2, K2);

        System.out.println(D.getIsi(1));
        System.out.println(D.getIsi(2));
        System.out.println(D.getIsi(3));
        System.out.println(D.getSize());

        
        // 3b
        OperatorGenerik.Tukar(K1, A);
        K1.Gerak();
        A.Gerak();

        // 3c
        System.out.println(K.Bobot2(K1, K2));
    }
}
