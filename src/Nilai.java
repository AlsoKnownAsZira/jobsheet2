import java.util.ArrayList;
import java.util.List;

public class Nilai {
    private List<Mahasiswa> daftarMahasiswa;
    private List<Dosen> daftarDosen;
    private List<MataKuliah> daftarMataKuliah;

    public Nilai() {
        daftarMahasiswa = new ArrayList<>();
        daftarDosen = new ArrayList<>();
        daftarMataKuliah = new ArrayList<>();
    }
}
