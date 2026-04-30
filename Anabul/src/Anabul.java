abstract class Anabul {
    protected String Nama;

    public abstract void Gerak();
    public abstract void Suara();
}

class Kucing extends Anabul{
    public void Gerak(){
        System.out.println("Kucing Melata");
    }

    public void Suara(){
        System.out.println("Kucing Meong");
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