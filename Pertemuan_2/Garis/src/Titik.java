/*  Nama File : Titik.java
    Deskripsi : berisi atribut dan method dalam class Titik
    Pembuat   : Haikal Imam Ridha
    Tanggal   : 02-03-2026
*/

public class Titik {
    /*ATRIBUT*/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){
        this(0,0);
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + ',' + ordinat + ')');
    }

    void getKuadran(){
        if(absis > 0 && ordinat > 0){
            System.out.println("1");
        }
        else if(absis < 0 && ordinat > 0){
            System.out.println("2");
        }
        else if(absis < 0 && ordinat < 0){
            System.out.println("3");
        }
        else if (absis > 0 && ordinat < 0) {
            System.out.println("4");
        }
    }

    double getJarakPusat(){
        return Math.sqrt(this.absis*this.absis + this.ordinat*this.ordinat);
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis-T.absis , 2) + Math.pow(this.ordinat-T.ordinat, 2));
    }

    void refleksiX(){
        absis = -absis;
    }

    void refleksiY(){
        ordinat = -ordinat;
    }

    Titik getRefleksiX(){
        Titik T1 = new Titik(absis, -1*ordinat);
        return T1;
    }
    
    Titik getRefleksiY(){
        Titik T1 = new Titik(-1*absis, ordinat);
        return T1;
    }
}


