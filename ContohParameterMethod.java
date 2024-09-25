public class ContohParameterMethod {

    //method dengan satu parameter
    public static int kalidua(int angka){
        int hasil = angka * 2;
        return hasil;
    }

    //Method dengan beberapa parameter
    public static double hitungluassegitiga(double alas,double tinggi){
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args){
        int hasilkalidua = kalidua(5);//memanggil method dengan argumen 5
        System.out.println("5 x 2 = " + hasilkalidua);

        double luassegitiga = hitungluassegitiga( 4, 6); //memanggil dengan argumen 4 dan 6
        System.out.println("luas segitiga: " + luassegitiga);
    }
}
