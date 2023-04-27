package Inheritance;

public class Main {
    public static void main(String[] args) {
        Toping toping = new Toping();
        toping.setNamaBahan("Telur");
        toping.setJumlahBahan(2);
        toping.setOlahToping("digoreng");

        Mie mie = new Mie();
        mie.setNamaBahan("Mie instan");
        mie.setJumlahBahan(1);
        mie.setWaktuRebus(3);
 
        System.out.println("Bahan-bahan yang dibutuhkan:");
        System.out.println("- " + toping.getNamaBahan() + " (" + toping.getJumlahBahan() + " buah)");
        System.out.println("- " + mie.getNamaBahan() + " (" + mie.getJumlahBahan() + " pcs)");
        System.out.println("Waktu merebus mie: " + mie.getWaktuRebus() + " menit");
        System.out.println("Tambahkan telur yang sudah " + toping.getOlahToping());


    }
}

