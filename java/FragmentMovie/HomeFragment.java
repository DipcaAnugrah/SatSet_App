package androidx.constraintlayout.widget.FragmentMovie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.satset.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private List<MovieItem> movieList;
    private RecyclerView homeRecyclerView;
    private MovieAdapter movieAdapter;

    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Gunakan metode inflate yang benar dengan tiga parameter
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        movieList = generateMovieItem();
        homeRecyclerView = rootView.findViewById(R.id.homeRecyclerView);
        homeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        movieAdapter = new MovieAdapter(movieList);
        homeRecyclerView.setAdapter(movieAdapter);

        // Menambahkan listener untuk menanggapi klik pada item RecyclerView
        movieAdapter.setOnItemClickListener(new MovieAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // Panggil metode untuk menampilkan sinopsis (ganti dengan sesuai kebutuhan)
                showSinopsisFragment(movieList.get(position));
            }
        });

        return rootView;
    }

    private List<MovieItem> generateMovieItem() {
        List<MovieItem> movieItems = new ArrayList<>();
        movieItems.add(new MovieItem(R.drawable.film1, "INCEPTION", "nception bercerita tentang pencuri bernama Dom Cobb yang mencuri rahasia dari alam bawah sadar korbannya. Hal ini menjadi keunikan tersendiri yang membuatnya berbeda dengan pencuri lain. Cobb dapat beraksi jika korbannya sudah dalam keadaan tidur dan sedang bermimpi. Memiliki reputasi hebat justru membuat Cobb menjadi buronan internasional. Ia dapat memperbaiki nasibnya jika ia berhasil menjalankan misi yang berbeda dengan misi lainnya. Kali ini misi tersebut ditujukan kepada seseorang bernama Robert Fischer."));
        movieItems.add(new MovieItem(R.drawable.film2, "Jumanji", "Dalam sebuah petualangan Jumanji yang baru, empat anak sekolah menengah menemukan sebuah konsol video game tua dan ditarik ke dalam setting hutan permainan, yang secara harfiah menjadi avatar dewasa yang mereka pilih. Apa yang mereka temukan adalah bahwa Anda tidak hanya bermain Jumanji - Anda harus bisa bertahan. Untuk mengalahkan permainan dan kembali ke dunia nyata, mereka harus menjalani petualangan paling berbahaya dalam hidup mereka, menemukan apa yang Alan Parrish tinggalkan 20 tahun yang lalu, dan mengubah cara mereka memikirkan diri mereka sendiri - atau mereka akan terjebak. dalam permainan selamanya, untuk dimainkan oleh orang lain tanpa henti."));
        movieItems.add(new MovieItem(R.drawable.film3, "UP", "Demi memenuhi janji pada almarhum istrinya, Carl pun menerbangkan rumahnya dengan balon warna-warni ke Paradise Falls. Tapi tak sadar, ia telah membawa seorang 'penumpang gelap' - bocah delapan tahun."));
        movieItems.add(new MovieItem(R.drawable.film4, "Interstellar", "Sebuah tim penjelajah antar galaksi harus melewati lubang cacing dan terjebak di dimensi waktu ruang angkasa dalam upaya untuk menjamin kelangsungan hidup umat manusia di planet bumi."));
        movieItems.add(new MovieItem(R.drawable.film5, "Inside Out", "Riley, 11 tahun, pindah ke San Francisco, meninggalkan hidupnya di Minnesota. Dia dan lima emosi dalam dirinya, Fear, Anger, Joy, Disgust dan Sadness, merasa kesulitan menghadapi kehidupan barunya."));
        movieItems.add(new MovieItem(R.drawable.film6, "IT", "Pada musim panas 1989, sekelompok remaja yang sering ditindas, bersatu untuk menghancurkan sesosok monster mengerikan yang menyamar dalam wujud badut menakutkan dan suka memangsa anak-anak kecil."));
        movieItems.add(new MovieItem(R.drawable.film7, "The Last Of Us Part II", "Serial ini menceritakan kehidupan dua puluh tahun setelah pandemi yang disebabkan oleh infeksi jamur massal Cordyceps, yang memaksa inangnya berubah menjadi makhluk mirip zombie dan memburu manusia hidup. Infeksi membuat manusia yang tersisa berkelompok untuk bertahan hidup"));
        movieItems.add(new MovieItem(R.drawable.film_openheimer, "Oppenheimer", "Kisah tentang seorang fisikawan Amerika Serikat bernama J. Robert Oppenheimer yang mengembangkan bom atom."));
        movieItems.add(new MovieItem(R.drawable.film10, "Jurassic World Dominions", "Empat tahun setelah kehancuran pulau Nublar, dinosaurus sekarang hidup dan berburu bersama manusia di seluruh dunia. Keseimbangan yang rapuh ini akan menentukan, apakah manusia akan tetap menjadi berada di puncak rantai makanan ketika berbagi wilayah dengan makhluk paling menakutkan dalam sejarah bumi."));
        movieItems.add(new MovieItem(R.drawable.film11, "Kong Skull Island", "Sebuah tim ilmuwan menjelajahi pulau yang belum dipetakan di Pasifik, dan tak sengaja memasuki wilayah sesosok kera raksasa. Kini, mereka harus berjuang untuk melarikan diri dari kejaran para monster."));
        movieItems.add(new MovieItem(R.drawable.film12, "The Maze Runner", "Thomas kehilangan ingatan dan mendapati dirinya terjebak dalam labirin besar bernama Glade. Bersama teman-temannya, ia memiliki kesempatan untuk meloloskan diri dan mendapatkan ingatannya kembali."));
        movieItems.add(new MovieItem(R.drawable.film13, "Godzilla VS Kong", "Sebuah pertarungan epic dalam sinematik Monsterverse antara Godzilla dan Kong.Pertarungan Godzilla vs. Kong membuat umat manusia harus bertahan dengan berbagai cara. Salah satunya adalah memusnahkan kedua raksasa tersebut.Siapa yang akan menang?"));
        movieItems.add(new MovieItem(R.drawable.film14, "The Flash", "Dunia beradu dalam “The Flash” saat Barry menggunakan kekuatan supernya untuk melakukan perjalanan kembali ke masa lalu untuk mengubah peristiwa masa lalu. Tetapi ketika usahanya untuk menyelamatkan keluarganya secara tidak sengaja mengubah masa depan, Barry terjebak dalam kenyataan di mana Jenderal Zod telah kembali, mengancam pemusnahan, dan tidak ada Pahlawan Super untuk mejadi pengharapan. Artinya, kecuali Barry bisa membujuk Batman yang sangat berbeda dari masa pensiun dan menyelamatkan Kryptonian yang dipenjara… meskipun bukan itu yang dia cari. Pada akhirnya, untuk menyelamatkan dunia tempat dia berada dan kembali ke masa depan yang dia tahu, satu-satunya harapan Barry adalah balapan untuk kepentingan hidupnya. Tetapi akankah membuat pengorbanan terakhir sudah cukup untuk mengatur ulang alam semesta?"));
        movieItems.add(new MovieItem(R.drawable.film15, "Spiderman No way home", "Pertama kalinya dalam sejarah layar lebar Spider-Man, identitas asli dari pahlawan nan ramah ini terbongkar, sehingga membuat tanggung jawabnya sebagai seorang berkekuatan super berbenturan dengan kehidupan normalnya, dan menempatkan semua orang terdekatnya dalam posisi paling terancam."));
        movieItems.add(new MovieItem(R.drawable.film16, "Breaking Bad", "Breaking Bad mengisahkan seorang guru kimia bernama Walter White (Bryan Cranston). Walter digambarkan sebagai sosok berkepribadian lembut. Ia menikahi Skyler Lambert (Anna Gunn). Kehidupan mereka berjalan normal dan tidak ada kendala sebelum Walter divonis menderita kanker paru-paru stadium tiga pada usia 50 tahun."));
        movieItems.add(new MovieItem(R.drawable.film17, "Game Of Thrones", "Game Of Thrones menceritakan tahta besi (Iron Throne) di tujuh kerajaan. Pemimpin kerajaan saling berlomba untuk mendapatkan tahta besi. Alur cerita berfokus ada masing-masing tokoh di tujuh kerajaan, yang memperebutkan tahta. Sementara itu, ada sisi lain tentang Night’s Watch. White Walkers merupakan kelompok militer seperti zombie dari daerah Utara. Tiap musim GOT, ada banyak tokoh penting dari cerita yang tewas."));
        movieItems.add(new MovieItem(R.drawable.film18, "Godzilla Minus One", "Berlatar pada 1945 atau tepatnya setelah Perang Dunia II, Pulau Odo mendapat serangan dari Godzilla. Hanya pilot kamikaze Kichi Shikishima dan mekanik bernama Sakuya Tachibana yang selamat dari peristiwa tersebut. Saat kembali ke Tokyo, Kichi hidup bahagia bisa menikah dan memiliki anak. Namun, ia mengalami de javu saat Godzilla kembali muncul dan menyerang Tokyo."));
        movieItems.add(new MovieItem(R.drawable.film19, "Monarch Legacy Of Monsters", "Monarch: Legacy of Monsters mengisahkan dua saudara kandung yang mengikuti jejak ayah mereka untuk mengungkap hubungan keluarga mereka dengan organisasi rahasia yang dikenal sebagai Monarch.Petunjuk membawa mereka ke dunia monster dan akhirnya menuju perwira Angkatan Darat Lee Shaw (diperankan oleh Kurt dan Wyatt Russell), yang terjadi pada tahun 1950-an.Setengah abad kemudian ketika Monarch terancam oleh apa yang diketahui Shaw. Kisah dramatis ini yang berlangsung selama tiga generasi mengungkap rahasia terpendam dan bagaimana peristiwa-peristiwa epik dan menggemparkan terjadi."));
        movieItems.add(new MovieItem(R.drawable.film20, "The Maze Runner: Death Cure", "Thomas (Dylan O'Brien) beserta sekelompok Glader memulai sebuah misi untuk menemukan sebuah obat yang disebut flare. Namun untuk dapat mencapai tujuan itu, mereka harus masuk ke Last City dan berhadapan langsung dengan WCKD yang dapat mengontrol labirin mematikan."));
        movieItems.add(new MovieItem(R.drawable.film21, "The Maze Runner: Scroch Trials", "Setelah berhasil lolos dari labirin, Thomas dan teman-temannya dipindahkan. Ketika menyadari adanya ancaman bahaya, mereka melarikan diri dan sampailah di area asing - panas terik tak berpenghuni."));
        movieItems.add(new MovieItem(R.drawable.film22, "The Meg", "Lima tahun lalu, seorang ahli penyelam laut dan juga mantan Kapten Angkatan Laut bernama Jonas Taylor (Jason Statham) menghadapi marabahaya yang tidak terduga di relung Palung Mariana yang memaksanya untuk membatalkan misinya dan juga meninggalkan crew nya."));
        movieItems.add(new MovieItem(R.drawable.film23, "Rampage", "Davis Okoye (Dwayne Johnson) seorang primatologist bersahabat dengan seekor gorilla bernama George. Namun karena sebuah eksperimen, George yang pada awalnya ramah dan jinak berubah menjadi seperti monster ganas. Sayangnya serum eksperimen tersebut menyebar ke binatang lain, diantaranya buaya dan serigala. Davis bersama rekannya, Dr. Kate Caldwell (Naomie Harris) harus mencari cara untuk menemukan obat penawar hasil eksperimen Claire Wyden (Malin Akerman) sekaligus mencegah Harvey Russell (Jeffrey Dean Morgan) agar tidak melukai George."));
        movieItems.add(new MovieItem(R.drawable.film24, "Elemental", "Dua karakter berbeda, Ember (Leah Lewis) elemen api dan Wade (Mamoudou Athie) elemen air. Layaknya api, Ember memiliki sifat membara, sedangkan Wade memiliki sifat tenang layaknya air. Walaupun berbeda, keduanya saling jatuh cinta dan berusaha mencari kesamaan satu sama lainnya."));
        movieItems.add(new MovieItem(R.drawable.film25, "Coco", "Terlepas dari larangan musik yang membingungkan keluarganya, Miguel bermimpi untuk menjadi musisi berprestasi seperti idolanya, Ernesto de la Cruz. Putus asa untuk membuktikan bakatnya, Miguel menemukan dirinya berada di alam baka yang menakjubkan dan penuh warna setelah serangkaian peristiwa misterius. Sepanjang jalan, ia bertemu dengan penipu menawan Hector, dan bersama-sama, mereka memulai perjalanan yang luar biasa untuk membuka kisah sebenarnya di balik sejarah keluarga Miguel."));
        movieItems.add(new MovieItem(R.drawable.film26, "Cars 3", "Reputasi pebalap legendaris Lightning McQueen mulai tersaingi dengan kemunculan pebalap-pebalap muda. Bersama rekannya, Cruz Ramirez, McQueen berusaha mempertahankan gelarnya sebagai raja sirkuit."));
        return movieItems;
    }

    private void showSinopsisFragment(MovieItem movieItem) {
        // Implementasikan logika untuk menampilkan SinopsisFragment
        // Contoh: Membuat instance fragment SinopsisFragment dan menambahkannya ke dalam FragmentManager

        SinopsisFragment sinopsisFragment = SinopsisFragment.newInstance(movieItem);
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_layout, sinopsisFragment)
                .addToBackStack(null)
                .commit();
    }
}
