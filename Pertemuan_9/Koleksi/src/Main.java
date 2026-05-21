public class Main {
    public static void main(String[] args){
        
        Kucing K1 = new Kucing("hantavirus", 67);
        Kucing K2 = new Kucing("triple T", 5);
        Anabul A = new Anabul("KneeGrow", 20);
        Piaraan P = new Piaraan();
        P.enqueueAnabul(K1);
        P.enqueueAnabul(K2);
        P.enqueueAnabul(A);
        
        //2c
        P.showAnabul();

        //2d
        System.out.println("Jumlah Kucing: " + P.countKucing());

        //2e
        System.out.println("Total Bobot Kucing: " + P.bobotKucing());

        //2f
        P.showJenisAnabul();

    }
}
