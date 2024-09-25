public class ContohMethod {

    // Method untuk menghitung luas persegi

    public static int hitungluaspersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args){
        int sisi = 5;
        int luas = hitungluaspersegi(sisi);
        System.out.println("luas persegi dengan sisi " + sisi + " adalah " + luas);
    }
}
