public class mataKuliah23 {
    String kodeMk, nama;
    int sks, jumlahJam;

    public mataKuliah23() {

    }
    public mataKuliah23(String kodemk, String nm, int sks, int jmlJam) {
        kodeMk = kodemk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;

    }
    void tampilInformasi() {
        System.out.println("KodeMK: " + kodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSks(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan, jumlah jam tidak mencukupi.");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        }
    }
}