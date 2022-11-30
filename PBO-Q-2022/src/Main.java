import Data.Data_barang;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Project PBO 2022");

        //input data kasir
//        data_kasir database_kasir = new data_kasir();
//        database_kasir.create("kurniawan",155,"123");
//        database_kasir.create("aan",156,"123");
//        database_kasir.read(); // viev database kasir
//
//        // cek method update
//        database_kasir.update_pass(111,"111"); //pengujian salah
//        database_kasir.update_pass(155,"111"); //pengujian benar
//        database_kasir.read();
//
//        //cek method delete
//        database_kasir.delete(111); //pengujian salah
//        database_kasir.delete(155); //pengujian benar
//        database_kasir.read();
//
//        //tes login
//        int nip1 = database_kasir.login(156,"111");
//        int nip2 = database_kasir.login(156,"123");

        //data barang
        Data_barang DBbarang = new Data_barang();
        DBbarang.create(1,"pepsodent",7000,1);
        DBbarang.create(2,"ciptadent",5000,12);
        DBbarang.create(3,"Lifebuoy", 3500,4);
        DBbarang.create(4,"Nuvo", 3000, 6);
        DBbarang.view();
        System.out.println("==========overload======");
        DBbarang.view(1);
        System.out.println("========================");
        DBbarang.updateHarga_viaKode(1,7500);
        DBbarang.updateStok_viaKode(1,5);
        DBbarang.updateHarga_viaNama("Ciptadent",5500);
        DBbarang.updateStok_viaNama("Ciptadent",10);
        DBbarang.updateHarga_viaKode(3,4000);
        DBbarang.updateStok_viaKode(4,5);
        DBbarang.view();
    }
}