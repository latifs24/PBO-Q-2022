package Entity;

public class Entity_Kasir
{
    private String nama;
    private int nip;
    private String pass;

    public Entity_Kasir(String nama, int nip, String pass)
    {
        this.nama = nama;
        this.nip = nip;
        this.pass = pass;
    }

    public void cetak()
    {
        System.out.println("nama    : "+this.nama);
        System.out.println("NIP     : "+this.nip);
        System.out.println("Pass    : "+this.pass);
        System.out.println("---------------------");
    }

    public int getNip() {
        return nip;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }
}