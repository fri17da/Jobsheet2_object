public class Dosen23 {
    String idDosen, nama, bidangKeahlian;
    int tahunBergabung;
    boolean statusAktif;

    public Dosen23() {

    }
    public Dosen23(String idDosen, String nama, String bidangKeahlian, int tahunBergabung, boolean statusAktif) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.tahunBergabung = tahunBergabung;
        this.statusAktif = statusAktif;
    }

    void tampilInformasi() {
       System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("----------------------------");
    }
    public void setStatusAktif(boolean status) {
        statusAktif = statusAktif;
        System.out.println("Status dosen telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    public int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa kerja saat ini: " + masaKerja + " tahun");
        return masaKerja;
    }
     public void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
     
}