public class Pelanggan implements SupermarketKhoiri {
    public String NamaPelanggan;
    public String Alamat;

    public Pelanggan(String NamaPelanggan, String Alamat){
        this.NamaPelanggan=NamaPelanggan;
        this.Alamat=Alamat;
    }

    @Override
    public void cetakStruk(){

    }

    @Override
    public Integer TotalBayar() {
        throw new UnsupportedOperationException("Unimplemented method 'TotalBayar'");
    }
   
}
