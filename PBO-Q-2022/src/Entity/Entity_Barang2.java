package Entity;

public class Entity_Barang2 extends Entity_Barang
{
    private int harga;
    private int stok;

    public Entity_Barang2(int kodeBarang, String nama, int harga, int stok)
    {
        super(kodeBarang, nama);
        this.harga = harga;
        this.stok = stok;
    }

    public int getHarga() { return harga; }
    public int getStok() { return stok; }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public void cetak()
    {
        super.cetak();
        System.out.println("harga barang    :"+this.harga);
        System.out.println("stok barang     :"+this.stok);
        System.out.println("------------------------------");
    }

}