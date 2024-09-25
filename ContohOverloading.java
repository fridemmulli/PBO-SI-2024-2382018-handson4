public class ContohOverloading {
    // Metode untuk menghitung luas persegi
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    // Metode untuk menghitung luas persegi panjang
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Metode untuk menghitung luas lingkaran
    public static double hitungLuas(double jariJari, boolean isLingkaran) {
        if (isLingkaran) {
            return Math.PI * jariJari * jariJari;
        } else {
            return 0; // Atau lemparkan exception jika tidak sesuai
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan metode
        double luasPersegi = hitungLuas(5);
        double luasPersegiPanjang = hitungLuas(4, 6);
        double luasLingkaran = hitungLuas(3, true);

        System.out.println("Luas persegi: " + luasPersegi);
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
        System.out.println("Luas lingkaran: " + luasLingkaran);
       }
   }