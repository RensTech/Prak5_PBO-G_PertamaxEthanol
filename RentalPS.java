// ANGGOTA 1: Abstract Class
public abstract class RentalPS {
    protected String namaPenyewa;
    protected int lamaSewa;
    protected double hargaPerJam;
    
    public RentalPS(String namaPenyewa, int lamaSewa, double hargaPerJam) {
        this.namaPenyewa = namaPenyewa;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }
    
    // Method abstract
    public abstract double hitungBiayaSewa();
    public abstract void tampilkanInfo();
}