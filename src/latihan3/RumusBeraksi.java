package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        
        rumus objekbai = new rumus(5, 10);
        
        objekbai.hitungLuasPersegi();
        
        objekbai.tampilkanHasil();

        rumus objekbai = new rumus();
       
        objekbai.hitungLuasPersegi();
       
        objekbai.tampilkanHasil();
    }
}