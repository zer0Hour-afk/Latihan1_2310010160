package hitung;


public interface MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika bai = new Matematika(6,0);
        
        System.out.println("Hasil Penjumlahan: "+bai.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+bai.setPengurangan());
        System.out.println("Hasil Perkalian: "+bai.setPerkalian());
        System.out.println("Hasil Pembagian: "+bai.setPembagian());
        
    }
}
