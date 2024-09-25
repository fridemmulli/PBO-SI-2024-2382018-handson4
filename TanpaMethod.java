public class TanpaMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganTransport = 500000;
        int tunjanganMakan = 300000;
        int bonus = 1000000;

        int pajak = (gajiPokok + tunjanganTransport + tunjanganMakan + bonus) / 100;
        int gajiBersih = (gajiPokok + tunjanganTransport + tunjanganMakan + bonus) - pajak;

        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Transport: " + tunjanganTransport);
        System.out.println("Tunjangan Makan: " + tunjanganMakan);
        System.out.println("Bonus: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
       }
    }