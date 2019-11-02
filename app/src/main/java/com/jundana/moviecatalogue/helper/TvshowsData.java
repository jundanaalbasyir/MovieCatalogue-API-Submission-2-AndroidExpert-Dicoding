package com.jundana.moviecatalogue.helper;

import com.jundana.moviecatalogue.R;
import com.jundana.moviecatalogue.model.Tvshow;

import java.util.ArrayList;

public class TvshowsData {
    private static String[] TvshowsName = {
            "OK FOOD (NET TV)",
            "Demen Makan (TRANS TV)",
            "Detektif Rasa (TRANS 7)",
            "Wonderfood (NET TV)",
            "Makan Bersama (TRANS7)",
            "Food Story (KOMPAS TV)",
            "Chef's Table (NET TV)",
            "Semua Bisa Masak (TRANS TV)",
            "Hijab Traveling (TRANS 7)",
            "Koki Cilik (TRANS 7)"
    };

    private static String[] TvshowsDetails = {
            "OK Food adalah sebuah program acara kuliner NET TV yang mulai tayang pada 18 Agustus 2016. Acara yang tayang setiap hari Senin sampai Minggu pukul 09.00 WIB ini dibawakan oleh Peppy dan sosok perempuan yang biasa dipanggil “Eneng”, tetapi sosok tersebut tidak pernah menunjukkan wajahnya di depan kamera, hanya suaranya saja yang bisa kita dengar. Di acara ini Peppy tidak hanya mencicipi makanan, tetapi juga mengintip proses memasaknya di dapur.",

            "Demen Makan merupakan acara kuliner yang tayang setiap hari Minggu pukul 07.30 WIB di TRANS TV. Acara kuliner ini membahas tentang makanan dan minuman yang terkenal memiliki rasa yang enak dan lezat, dipandu oleh Vivit Kavi, seorang bintang iklan, host, jurnalis, sekaligus reporter. Dalam acara ini, Vivit dituntut untuk makan makanan dalam porsi besar, karena sesuai dengan judul acaranya “Demen Makan”. Selain mencicipi makanan Indonesia, acara kuliner ini terkadang juga mencoba berbagai makanan di luar negeri.",

            "Salah satu acara kuliner di TRANS7 ini tayang setiap hari Sabtu dan Minggu pukul 08.30 WIB. Dipandu oleh host Lolita Agustine dan Rizky Kinos, konsep dari acara ini adalah melakukan ‘investigasi' pada menu-menu unik dan kekinian, untuk diberikan penilaian berdasarkan rasa, cara penyajian, harga, dan tempat. Penilaian diberikan diakhir acara, setelah mereka mencicipi makanan tersebut.",

            "Dipandu oleh Riska Ogi, acara kuliner ini tayang pada hari Senin sampai Jumat pukul 16.00 WIB di NET TV. Wonderfood merupakan program yang sangat informatif, mengajarkan dan mengingatkan tentang pentingnya gaya hidup sehat, menghadirkan berbagai informasi tentang kandungan dari setiap makanan dan minuman bagi tubuh manusia. Tidak hanya seputar makanan, acara ini juga memberikan tips kecantikan yang bisa dibuat dari bahan-bahan alami. Seperti tips membuat serum wajah, lulur, blash on, dan lain-lain.",

            "Makan Bersama hadir mulai tanggal 19 November 2016 di layar kaca TRANS 7, tayang setiap hari Minggu pukul 09.15 WIB. Program ini dipandu Fadli Ahmad, serta seorang chef muda yang tampan, Steby Rafael. Dengan menggunakan konsep food truck, Fadli dan Chef Steby Rafael akan berkeliling di setiap sudut kota Jakarta, dan mengajak masyarakat sekitar mencicipi olahan kuliner yang dibuat. Selain itu, hiburan berupa live music juga akan dihadirkan program Makan Bersama.",

            "Food Story tayang setiap hari Sabtu 09.30 WIB di KOMPAS TV. Program kuliner yang dipandu oleh Benu Buloe ini tidak hanya sekadar icip-icip belaka, tetapi juga mengangkat kisah mengenai orang-orang di balik tersajinya sebuah makanan. Food Story menampilkan tayangan di balik terciptanya sebuah makanan, kisah perjuangan hidup, tradisi kuliner turun-temurun maupun keterampilan unik yang dimiliki para pembuat makanan. Tidak hanya itu, informasi mengenai kandungan gizi pun juga ditampilkan di dalam program kuliner ini.",

            "Dipandu oleh Chef Chandra, acara memasak ini tayang setiap hari Sabtu dan Minggu 16.00 WIB di NET TV. Dalam acara ini, Chef Chandra yang dikenal dengan tampilan Fancy Food akan memasak berbagai macam makanan. Sebelumnya memasak, Chef Chandra akan mengundang artis maupun publik figur untuk hadir di Chef's Table sebagai bintang tamu yang menemaninya memasak, kemudian ketika hidangan sudah matang, bintang tamu tersebut dipersilahkan mencicipi makanan buatannya.",

            "Semua Bisa Masak tayang setiap hari Sabtu pukul 14.00 WIB di TRANS TV. Dalam program acara ini kamu akan mendapatkan resep-resep membuat makanan di rumah, tak lupa Chef Dea Anissa dan Ayu Wardojo juga akan memberi tahu apa saja bahan makanan yang dibutuhkan, dan bagaimana proses memasak makanan tersebut.",

            "Acara yang dipandu oleh host Nesa Aqila, pemenang Puteri Muslimah Indonesia 2015 ini tayang setiap hari Sabtu pukul 09.45 WIB di TRANS 7. Hijab Traveling merupakan program traveling yang memberi referensi sebuah tempat wisata di manca negara, sekaligus dengan referensi tempat untuk mendapatkan kuliner halal, masjid, dan komunitas muslim yang ada di sekitar tempat wisata tersebut.",

            "Koki Cilik ialah program kuliner di TRANS 7, tepatnya masak-memasak ala koki-koki remaja, dengan menu favorit anak-anak yang bergizi, lezat, dan gampang dibuat. Beberapa artis yang dulunya pernah menjadi Koki Cilik adalah Marsha Risdasari, Ardhia Larasati, Ghina Salsabila, Rachquel Nesia, dan Prilly Latuconsina. Sayangnya program ini sudah tidak ditayangkan lagi.",

    };

    private static int[] TvshowsImages = {
            R.drawable.tvshow_satu,
            R.drawable.tvshow_dua,
            R.drawable.tvshow_tiga,
            R.drawable.tvshow_empat,
            R.drawable.tvshow_lima,
            R.drawable.tvshow_enam,
            R.drawable.tvshow_tujuh,
            R.drawable.tvshow_delapan,
            R.drawable.tvshow_sembilan,
            R.drawable.ic_launcher_background
    };

    public static ArrayList<Tvshow> getListData() {
        ArrayList<Tvshow> list = new ArrayList<>();
        for (int position = 0; position < TvshowsName.length; position++) {
            Tvshow Tvshow = new Tvshow();
            Tvshow.setPhoto(TvshowsImages[position]);
            Tvshow.setTvShowName(TvshowsName[position]);
            Tvshow.setTvShowDetail(TvshowsDetails[position]);
            list.add(Tvshow);
        }
        return list;
    }
}
