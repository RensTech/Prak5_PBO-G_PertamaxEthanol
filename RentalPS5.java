// ANGGOTA 3: Class Turunan
public class RentalPS5 extends RentalPS implements BonusMember {
    private boolean isMember;
    
    public RentalPS5(String namaPenyewa, int lamaSewa, double hargaPerJam, boolean isMember) {
        super(namaPenyewa, lamaSewa, hargaPerJam);
        this.isMember = isMember;
    }
    
    @Override
    public double hitungBiayaSewa() {
        double total = lamaSewa * hargaPerJam;
        if (isMember) {
            total -= beriBonus();
        }
        return total;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.println("Lama Sewa: " + lamaSewa + " jam");
        System.out.println("Harga per Jam: Rp " + hargaPerJam);
        System.out.println("Member: " + (isMember ? "Ya" : "Tidak"));
        System.out.println("Total Bayar: Rp " + hitungBiayaSewa());
        System.out.println("------------------------");
    }
    
    @Override
    public double beriBonus() {
        // Bonus 10% untuk member
        return (lamaSewa * hargaPerJam) * 0.1;
    }
}