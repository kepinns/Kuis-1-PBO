package Kuis1PBO;
class buku{
        String judul;
        String genre;
        int halaman;
        String penulis;

        //constructor
        buku(String buku, String genre, int halaman, String penulis){
            this.judul = buku;
            this.genre = genre;
            this.halaman = halaman;
            this.penulis = penulis;
        }

        // Method
        void tampilJudul(){
            System.out.println("Judul buku yang dipinjam: " + judul);
            System.out.println("genre buku: " + genre);
            System.out.println("jumlah halaman: " + halaman);
            System.out.println("Penulis: " + penulis);
        }
    }

    class peminjaman{
        String id;
        String namaPeminjam;
        buku judulBukuPinjam;
        String tanggalPinjam;
        String waktuPinjam;
        String tanggalKembali;
        String waktuKembali;

        //contructor
        peminjaman(String id, String namaPeminjam, buku judulBukuPinjam, String tanggalPinjam, String waktuPinjam, String tanggalKembali, String waktuKembali){
            this.id = id;
            this.namaPeminjam = namaPeminjam;
            this.judulBukuPinjam = judulBukuPinjam;
            this.tanggalPinjam = tanggalPinjam;
            this.waktuPinjam = waktuPinjam;
            this.tanggalKembali = tanggalKembali;
            this.waktuKembali = waktuKembali;
        }

        //Method
        void tampilPeminjam(){
            System.out.println("\nID Peminjam: " + id);
            System.out.println("Nama Peminjam: " + namaPeminjam + "\n");
            judulBukuPinjam.tampilJudul();
            System.out.println("\nTanggal peminjaman: " + tanggalPinjam);
            System.out.println("Waktu peminjaman: " + waktuPinjam);
            System.out.println("Tanggal pengembalian: " + tanggalKembali);
            System.out.println("Waktu pengembalian: " + waktuKembali);
            System.out.println("========================================");
        }

}
public class Main {


    public static void main(String[] args) {

        //Input Buku
        buku Laskar_Pelangi = new buku("Laskar Pelangi", "Roman", 529, "Andrea Hirata");
        buku Sebelas_Patriot = new buku ("sebelas Patriot", "Drama",108, "Andrea Hirata");

        //Input Peminjam
        peminjaman Kepinn = new peminjaman("01", "Kepinn", Laskar_Pelangi, "31 Maret 2022", "19.41", "1 April 2022", "19.41");
        peminjaman Samuel_Kevin_Juandani = new peminjaman("02", "Samuel Kevin Juandani", Sebelas_Patriot, "28 Maret 2022", "14.23", "30 Maret 2022", "14.23");

        //Menampilkan Peminjam
        Kepinn.tampilPeminjam();
        Samuel_Kevin_Juandani.tampilPeminjam();
    }
}