public class Kapal extends TransportasiAir {
    protected String mesin;

    

    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi() {
        // TODO Auto-generated method stub
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp." + biaya);
    }

    @Override
    public void berlayar() {
        // TODO Auto-generated method stub
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin" + mesin + "dengan kecepatan yang tidak stabil");
    }

    public void berlayar(int kecepatan) {
        // TODO Auto-generated method stub
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin" + mesin + "dengan kecepatan stabil di kisaran" + " " + kecepatan + "knot");
    }

    @Override
    public void berlabuh() {
        // TODO Auto-generated method stub
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }









    
}
