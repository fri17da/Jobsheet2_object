public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dosen1 = new Dosen23();

        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Andi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2021;
        dosen1.bidangKeahlian = "Pemrograman"; 

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian ("Basis Data");

        Dosen23 dosen2 = new Dosen23("D011", "Miriska, S.T.", "Matematika", 2018, false);
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2025);
        dosen2.ubahKeahlian ("Manajemen Bisnis");


    }
}