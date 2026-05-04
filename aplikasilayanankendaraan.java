 import java.util.Scanner;

public class aplikasilayanankendaraan {

    Scanner scanner = new Scanner (System.in);
    String merek,statusServis,jenisKendaraan;
    int nomorPolisi, tahunProduksi,jumlahPintu;

}
    // buatkan aplikasli sederhana layanan kendaraqan dalam aplikasli 
    //setiap kendaraan data umum nomor polisi , merek tahunoridksi , jumlahpintustatus servis  dengan jenis kendaraan yang dilayani mobil dan motor . mobil ada data tambahan jumlahpintu dan tipe transmisi. motor punya jenismesin dan kapasitas tangki.
    //untuk keamanan data  atribut kendaraan tidak boleh diakes secara langsung di luar class.
    //perubahan data statusservis harusu melalui method tertentu agar nilaina valid. dan hanya boleh bernilai "Menunggu", " Diproses" , "selesai" selain itu ketik objek kendaraan dibuat data awal seperti nomor [polisi, merek dan tahun prosuksi harus langsung diisi agar objek tidak berada dalam kondisi kosong atau tidak valid dan aplikasli harus menghindari penulisan ulang atribut dan method yg sta oada method class mpobil motor : rancang analisis oop 
    //1. tentukan class apa saja yg dibutuhkan dan jelaskan alasan pemilihannya
    //2.identifikasi TRIBUT Dan method yg ditampilkan di class induk dan turunan
    //3.bagaimana constructor digunakan agar objek kendaraan selelu memiliki data awal yg valid
    //4. analisi bagaimana enkapulasi ditetapkan untuk melindungi data kendaraan khususnya pada  atribut data servis 
    //5.
}
//1. tentukan class apa saja yg dibutuhkan dan jelaskan alasan pemilihannya
jawaban : ada class kendaraan nomor polisi , merek tahunoridksi , jumlahpintustatus servis   ada sub class mobil dengan jumlah pintu dan tipe transakasi dan motor dengan jenismesin dan kapasitas tangki.
          class pemasukan untuk sebagai tanda terima untuk data catatan layanan kendaraan 
          class main ada untuk produknya 
    
//2.identifikasi atribut Dan method yg ditampilkan di class induk dan turunan
jawaban : 
nomor polisi , merek tahunoridksi , jumlahpintustatus servis  dan method getNomorpolisi, getMerek,getTahunproduksi dan lain lainnya
//3.bagaimana constructor digunakan agar objek kendaraan selelu memiliki data awal yg valid
jawaban: constuctor harus diisi nomor polisi merek dan tahub produksi 
pakek this nomorPolisi = nomorPolisi;
//4. analisi bagaimana enkapulasi ditetapkan untuk melindungi data kendaraan khususnya pada  atribut data servis 
  dengan di private dengan getter baca data setter data mendapatkan data  contoh stqtaus servisnya di private
//5. jelaskan mengapa inheritance dapat digunakan pada kasus ini serta alasannya  lebih cocok menjadi sub class dibandingkan membuat class mobil dan motor secara terpisah
karna mobil dan motor punya atribut yang sama jadi bisa menghemat kode dengan inheritance kkarna inheritance itu untuk mewariskan atau menurunkan
//6. berikan minimal 1 contoh objek nyata dari class mobil dan motor lalu jelaskan nilai atribur yang dimiliki objek tersebut 
jawaban : misal : mobil, x234567 , Honda , 2024
begitu juga dengan motor dengan atributnya nomor polisi , merek tahunoridksi , jumlahpintustatus servis  

//ini koreksian:)