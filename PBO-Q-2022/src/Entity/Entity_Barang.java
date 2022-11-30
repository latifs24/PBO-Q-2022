package Entity;

public class Entity_Barang
{
    private int kodeBarang;
    private String nama;

    public Entity_Barang(int kodeBarang, String nama)
    {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
    }

    public void cetak()
    {
        System.out.println("kode barang     :"+this.kodeBarang);
        System.out.println("nama barang     :"+this.nama);
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public String getNama() {
        return nama;
    }
}