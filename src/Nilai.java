public class Nilai {
    Dosen dosen;
    Mahasiswa mhs;
    MataKuliah mtkl;


    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "111";
        mhs1.nama = "Maman";
        mhs1.jurusan = "Teknik Informatika";
        mhs1.email = "awkwkwkw@gmail.com";
        Dosen dosen1 = new Dosen();
        dosen1.nama = "Dr. Anjay Str.kom";
        dosen1.nip = "112233";
        dosen1.mataKuliah = "Basis Data Lanjut";
        MataKuliah mtkl1 = new MataKuliah();
        mtkl1.kodeMataKuliah = "TI112";
        mtkl1.namaMataKuliah = dosen1.mataKuliah;
        mtkl1.deskripsiMataKuliah = "Matkul Wajib Semester 3";
        mtkl1.dosenPengajar = dosen1.nama;
        mtkl1.nilai = 98.4;

        mhs1.printMHS();
        System.out.println(mtkl1.dosenPengajar);
        System.out.println(mtkl1.namaMataKuliah);
        System.out.println(mtkl1.nilai);
    }


}
