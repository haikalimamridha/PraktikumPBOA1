// package Piaraan;

// Nama File    : Anabul.java
// NIM          : 24060124130097
// Nama         : Haikal Imam Ridha
// Tanggal      : 13 Mei 2026

class Anabul {
    private String panggilan; // Atribut panggilan 
    protected double bobot;

    public Anabul(String panggilan, double bobot) {
        this.panggilan = panggilan;
        this.bobot = bobot;
    }

    // Fungsi get dan set untuk nama panggilan
    public String getNama() { 
        return panggilan; 
    }

    public void setNama(String nama) { 
        this.panggilan = nama; 
    }

    public double getBobot() { 
        return bobot; 
    }
}