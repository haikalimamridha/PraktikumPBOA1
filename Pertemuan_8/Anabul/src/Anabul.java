abstract class Anabul {
    // protected String Nama;

    public abstract void Gerak();
    public abstract void Suara();
}

class  Kucing extends Anabul{
    //1a
    protected int bobot;

    public Kucing(){

    }

    public Kucing(int bobot){
        this.bobot = bobot;
    }

    public void Gerak(){
        System.out.println("Kucing Melata");
    }

    public void Suara(){
        System.out.println("Kucing Meong");
    }


    //3c
    public <T> Integer Bobot2(T x, T y){
        return ((Kucing)x).bobot + ((Kucing)y).bobot ;
    }
}

//1b
class Anggora extends Kucing{

    protected String Nama = "Anggora";
    
    public Anggora(){
        // this.Nama = "Anggora";
    }
    // protected String nama = "Anggora";

    public Anggora(int bobot){
        super(bobot);
        // this.Nama = "Anggora";
    }

}

class Kembangtelon extends Kucing{
    public Kembangtelon(int bobot){
        super(bobot);
    }

}

//2
class Datum<D>{
    D isi;

    public D getIsi(){
        return isi;
    }

    public void setIsi(D isibaru){
        isi = isibaru;
    }
}

//3a
class OperatorGenerik{
    public static <T> void Tukar(T a, T b){
        T temp;
        temp = a;
        a = b;
        b = temp;
    }
}

class Anjing extends Anabul{
    public void Gerak(){
        System.out.println("Anjing Melata");
    }

    public void Suara(){
        System.out.println("Anjing guk-guk");
    }
}

class Burung extends Anabul{
    public void Gerak(){
        System.out.println("Burung Terbang");
    }

    public void Suara(){
        System.out.println("Burung cuit");
    }
}


class Data<T>{
    protected T[] ruang;
    protected int banyak = 0;

    @SuppressWarnings("unchecked")
    Data() {
        ruang = (T[]) new Object[100];
    }

    public T getIsi(int angka){
        return ruang[angka];
    }

    public void setIsi(int angka, T objek){
        this.ruang[angka] = objek;
        banyak++;
    }

    public int getSize(){
        return banyak;
    }
}