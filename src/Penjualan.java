public class Penjualan extends Pelanggan {
    static Integer KodeBarang = 1;
    String NamaBarang;
    Integer HargaBarang;
    Integer JumlahBeli;
    Integer TotalBayar;
    String Kasir;
    
    public Penjualan(String Kasir, String NamaPelanggan, String Alamat,String NamaBarang, Integer HargaBarang, Integer JumlahBeli){
        super(NamaPelanggan,Alamat);
        this.Kasir=Kasir;
        this.NamaBarang=NamaBarang;
        this.HargaBarang=HargaBarang;
        this.JumlahBeli=JumlahBeli;
        TotalBayar=HargaBarang * JumlahBeli;
        cetakStruk();  
    }

    @Override
    public void cetakStruk(){
        System.out.println("---------------------------------------------------");
        System.out.println("                   KHOIRI MART " );
        System.out.println("===================================================");
        System.out.println("                  DATA PELANGGAN              ");
        System.out.println("---------------------------------------------------");
        System.out.println("Nama Pelanggan: " + NamaPelanggan);
        System.out.println("Alamat        : " + Alamat);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("              DATA PEMBELIAN BARANG              ");
        System.out.println("---------------------------------------------------");
        System.out.println("Kode Barang   : KMB" + KodeBarang);
        System.out.println("Nama Barang   : " + NamaBarang);
        System.out.println("Harga Barang  : Rp." + HargaBarang);
        System.out.println("Jumlah Beli   : " + JumlahBeli + " Buah");
        System.out.println("Total Bayar   : Rp." + TotalBayar );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Kasir         : " + Kasir );
    }
}
