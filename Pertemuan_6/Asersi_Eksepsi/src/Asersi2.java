/**
*   File
*   Deskripsi : Program untuk demo asersi, yang akan menolak input jari2 lingkaran yang bernilai nol
**/

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling () {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 1;
        assert (jariJari>0) :"jari jari tidak boleh nol !!! ";
        Lingkaran L = new Lingkaran (jariJari);
        double kelilingLingkaran = L.hitungKeliling();
        System. out.println ("keliling lingkaran = " +kelilingLingkaran);
    }
}

/*
PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
Jelaskan pada lembar laporan praktikum!

Kondisi ketika jariJari < 0 (negatif) harusnya juga dipertimbangkan, diperbaiki menjadi ->
assert (jariJari>0) :"jari jari tidak boleh nol atau negatif!!! ";
*/