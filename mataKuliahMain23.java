public class mataKuliahMain23 {
    public static void main(String[] args) {
        mataKuliah23 matkul1 = new mataKuliah23();
        matkul1.kodeMk = "ALSD";
        matkul1.nama = "Algoritma dan Struktur Data";
        matkul1.sks = 3;
        matkul1.jumlahJam = 4;

        matkul1.tampilInformasi();
        matkul1.ubahSks(2);
        matkul1.tambahJam(4);
        matkul1.kurangiJam(2);
         
        mataKuliah23 matkul2 = new mataKuliah23("MATL", "Matematika Lanjut", 2, 4);
        matkul2.tampilInformasi();
    }
}