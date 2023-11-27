# **SatSet App**

<img src="https://github.com/dipca0895/SatSet_App/blob/main/img/satset.png" width=15% height=15%> <img src="https://github.com/dipca0895/SatSet_App/blob/main/img/satset2.png" width=30% height=30%> 


```
Nama    : Dipca Anugrah
NIM     : 312210666
Kelas   : TI.22.A.4
Matkul  : Pemrograman Mobile 1
Dosen   : Donny Maulana, S.Kom., M.M.S.I.
```
# **Daftar Isi**
**[Tugas 1](#tugas-1)**

**[Tugas 2](#tugas-2)**

**[Penjelasan Program](#penjelasan-program)**

**[Demo Aplikasi](#demo-aplikasi)**

## **Tugas 1**
Buatkanlah :

1. Launcher Splash logo masing-masing Individu 

2. Buatkanlah untuk menampilkan semua project sebelum UTS dengan metode Ekplisit Intent dan

     Implisit Intent:

    a. Project Hallo

    b. Project Count

    c. Project Sianida

    d. Project TwoActivity

    e. Project Set Alarm

Untuk tampilan Layout Bebas, terima kasih.

## **Tugas 2**
Buatlah tampilan menu Versi 02 dari project-project yang sudah dibuat sebelumnya 

dengan tambahan memanggil method Maps

dengan tampilan sebagai berikut :
![img](img/tugas.PNG)
 



## **Penjelasan Program**
Membuat Menu untuk menampilkan semua project, disini saya terdapat 6 project. Berikut adalah kode program pada java dan layout xml.

1. **MenuActivity.java**
Program di atas adalah `MenuActivity` yang bertindak sebagai pengontrol untuk layar menu utama aplikasi. Berikut adalah penjelasan untuk setiap fungsi dalam program tersebut:

    1. **`onCreate`**: Metode ini dipanggil saat aktivitas  dibuat. Di sini, tata letak aktivitas diinisialisasi dengan menggunakan layout dari file XML `activity_menu.xml`. Selain itu, enam `CardView` yang mewakili menu aplikasi diinisialisasi.

        ```java
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);

            // Inisialisasi CardView untuk setiap tombol menu
            tombolSatu = findViewById(R.id.cdMenu1);
            tombolDua = findViewById(R.id.cdMenu2);
            tombolTiga = findViewById(R.id.cdMenu3);
            tombolEmpat = findViewById(R.id.cdMenu4);
            tombolLima = findViewById(R.id.cdMenu5);
            tombolEnam = findViewById(R.id.cdMenu6);
        }
        ```

    2. **Tombol Menu 1 (`tombolSatu`)**:
    - Ketika `tombolSatu` ditekan, sebuah objek `Intent` dibuat untuk memulai `HelloActivity`.
    - Metode `startActivity(intent)` memulai aktivitas baru berdasarkan intent yang diberikan.

        ```java
        tombolSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, HelloActivity.class);
                startActivity(intent);
            }
        });
        ```

    3. **Tombol Menu 2 sampai Menu 6**:
    - Setiap tombol menu lainnya (`tombolDua` hingga `tombolEnam`) memiliki logika yang serupa dengan `tombolSatu`.
    - Mereka memiliki fungsi `setOnClickListener` yang membuat objek `Intent` untuk memulai aktivitas yang sesuai ketika tombol ditekan.

        ```java
        tombolDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ```

    Dengan cara ini, `MenuActivity` berfungsi sebagai pemandu untuk memulai berbagai aktivitas dalam aplikasi saat tombol-tombol menu yang sesuai ditekan.
    Berikut adalah penjelasan untuk setiap fungsi dalam kelas `MenuActivity`.

2. **activity_menu.xml**

    disini saya tidak menampilkan kode programnya karna panjang, saya akan menampilkan design dan component apa saja yang digunakan.

    <img src="https://github.com/dipca0895/SatSet_App/blob/main/img/component1.png" width=30% height=30%> 

    <img src="https://github.com/dipca0895/SatSet_App/blob/main/img/component2.png" width=30% height=30%>  

    <img src="https://github.com/dipca0895/SatSet_App/blob/main/img/design.png" width=70% height=70%> 

Sumber icon -->
[www.flaticon.com](https://www.flaticon.com/)

<img src="https://github.com/dipca0895/SatSet_App/blob/main/img/menu.png" width=70% height=70%> 

3. **SplashActivity.java**
Program di atas adalah `SplashActivity`, yang berfungsi sebagai tampilan pengantar (splash screen) untuk aplikasi. Di bawah ini adalah penjelasan untuk setiap bagian program:

    1. **`onCreate`**: Metode ini dipanggil saat aktivitas dibuat. Di sini, tata letak aktivitas diinisialisasi dengan menggunakan layout dari file XML `activity_splash.xml`. Selain itu, status bar (bilah notifikasi) diatur untuk disembunyikan sehingga splash screen dapat menutupi seluruh layar.

    ```java
    View decorView = getWindow().getDecorView();
    decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
    ```

    2. **Penundaan dan Pindah ke `MenuActivity`**:
    - Menerapkan penundaan menggunakan objek `Handler` untuk menunda pindah ke `MenuActivity` selama 3 detik (sesuai dengan nilai `SPLASH_DELAY`).
    - Setelah penundaan, objek `Intent` dibuat untuk memulai `MenuActivity`.
    - `startActivity(intent)` memulai aktivitas baru berdasarkan intent yang diberikan.
    - Opsional: `finish()` digunakan untuk menutup `SplashActivity` setelah membuka `MenuActivity`, sehingga pengguna tidak dapat kembali ke splash screen menggunakan tombol "Back".

        ```java
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MenuActivity.class);
                startActivity(intent);
                finish(); // Optional: ditambahkan untuk menutup SplashActivity setelah membuka MenuActivity
            }
        }, SPLASH_DELAY);
        ```

    Dengan cara ini, `SplashActivity` bertindak sebagai tampilan pembuka yang memberikan kesan singkat sebelum pengguna melihat layar utama (`MenuActivity`). Penundaan memberikan waktu singkat untuk menampilkan merek atau elemen desain yang mewakili aplikasi sebelum memasuki pengalaman pengguna utama.


4. **activity_splash.xml**              
![img](img/splash_screen.gif)

## **Demo Aplikasi**

<img src="https://github.com/dipca0895/SatSet_App/blob/main/img/satset_demo.gif" width=30% height=30%>

<hr>

**[Back--->](#satset-app)**