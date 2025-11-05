// ANGGOTA 3: Main Program
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM RENTAL PS ===");
        
        // Buat object rental
        RentalPS5 rental1 = new RentalPS5("Budi", 5, 10000, true);
        RentalPS5 rental2 = new RentalPS5("Sari", 3, 12000, false);
        
        // Tampilkan info
        rental1.tampilkanInfo();
        rental2.tampilkanInfo();
    }
}