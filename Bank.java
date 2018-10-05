
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        NasabahBank n=new NasabahBank();
        n.nasabah("Aljuni");
        n.tabungan(2000000);
        n.ambilUang(1000000);
        n.ambilUang(1000000,"Uang untuk berobat");

        System.out.println(n.getSaldo());
        System.out.println(n.getSaldo() + "  " + n.getPesan());

        System.out.println();
        NasabahBank n1=new NasabahBank();
        n1.nasabah("Hirossie");
        n1.tabungan(2000000);
        n1.ambilUang(500000);
        n1.ambilUang(100000,"Uang untuk beli obat");
        
        System.out.println("\nTotal Transaksi Berhasil Dilakukan : " + n1.noUrut);
        
    }
    
}
