package Data;

import Entity.Entity_Barang2;
import java.util.ArrayList;

public class Data_barang
{
    private ArrayList <Entity_Barang2> data_barang;

    public Data_barang()
    {
        this.data_barang = new ArrayList<>();
    }

    public void create(int kode, String nama, int harga, int stok)
    {
        this.data_barang.add(new Entity_Barang2(kode, nama, harga, stok));
    }

//    public void updateAll_viaKode(int kode, int harga, int stok)
//    {
//        for (Entity_Barang2 i : data_barang)
//        {
//            if (kode == i.getKodeBarang())
//            {
//                kode = data_barang.indexOf(i);
//                Entity_Barang2 update = new Entity_Barang2(i.getKodeBarang(), i.getNama(), harga, stok);
//                data_barang.set(kode, update);
//            }
//        }
//    }

    public void updateHarga_viaKode(int kode, int harga)
    {
        for (Entity_Barang2 i : data_barang)
        {
            if (kode==i.getKodeBarang())
            {
                int index = data_barang.indexOf(i);
                data_barang.set(index, new Entity_Barang2(i.getKodeBarang(), i.getNama(), harga, i.getStok()));
            }
        }
    }
    public void updateStok_viaKode(int kode, int stok)
    {
        for (Entity_Barang2 i : data_barang)
        {
            if (kode==i.getKodeBarang())
            {
                int index = data_barang.indexOf(i);
                data_barang.set(index, new Entity_Barang2(i.getKodeBarang(), i.getNama(), i.getHarga(), stok));
            }
        }
    }
    public void updateHarga_viaNama(String nama, int harga)
    {
        for (Entity_Barang2 i : data_barang)
        {
            if (nama.equalsIgnoreCase(i.getNama()))
            {
                int index = data_barang.indexOf(i);
                data_barang.set(index, new Entity_Barang2(i.getKodeBarang(), i.getNama(), harga, i.getStok()));
            }
        }
    }
    public void updateStok_viaNama(String nama, int stok)
    {
        for (Entity_Barang2 i : data_barang)
        {
            if (nama.equalsIgnoreCase(i.getNama()))
            {
                int index = data_barang.indexOf(i);
                data_barang.set(index, new Entity_Barang2(i.getKodeBarang(), i.getNama(), i.getHarga(), stok));
            }
        }
    }

    public void view()
    {
        for (int i=0;i<this.data_barang.size();i++)
        {
            this.data_barang.get(i).cetak();
        }
    }

    public void view(int index)
    {
        this.data_barang.get(index).cetak();
    }
}