public class mahasiswaMain323 {
    public static void main(String[] args) {
    mahasiswa323 mhs1 = new mahasiswa323();
    mhs1.nama = "Muhammad Ali Farhan";
    mhs1.nim = "2241720171";
    mhs1.kelas = "SI 2J";
    mhs1.ipk = 3.55;

    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("SI 2K");
    mhs1.updateIpk(3.60);
    mhs1.tampilkanInformasi();

    mahasiswa323 mhs2 = new mahasiswa323("Annissa Nabila", "2141720160", 3.25, "TI 2L");
    mhs2.updateIpk(3.30);
    mhs2.tampilkanInformasi();

    mahasiswa323 mhsSyafrida = new mahasiswa323("Syafrida Ade Aulia Hakim", "244107060002", 3.75, "SIB 1C");
    mhsSyafrida.tampilkanInformasi();
    }
}