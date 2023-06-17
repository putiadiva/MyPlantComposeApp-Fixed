package com.example.mytestapplication

data class Plant (
    val id: Long,
    val name: String,
    val scientificName: String,
    val description: String,
    val photo: Int,
    val photoSrc: String
)

val plantList = listOf<Plant>(
    Plant(1,
        "Suplir",
        "Adiantum capillus-veneris",
        "Suplir adalah tumbuhan paku populer untuk penghias ruangan atau taman yang termasuk dalam genus Adiantum, yang tergolong dalam anaksuku Vittarioideae, suku Pteridaceae. Nama \"suplir\" merupakan adaptasi dari chevelure dari bahasa Prancis yang berarti \"seluruh rambut di kepala\", nama yang diperkenalkan orang Belanda sewaktu masa penjajahan.",
        R.drawable.suplir,
        "https://www.kompas.com/homey/read/2021/10/05/075500876/cara-merawat-suplir-tanaman-hias-indoor-yang-dekoratif?page=all"
    ),
    Plant(2,
        "Aglaonema",
        "Aglaonema",
        "Aglaonema (bahasa Indonesia: Sri rezeki) adalah tanaman hias populer dari suku talas-talasan atau Araceae. Genus Aglaonema memiliki sekitar 30 spesies. Mereka berasal dari daerah tropis dan subtropis di Asia dan Nugini. Mereka umumnya dikenal sebagai Chinese evergreens.",
        R.drawable.aglaonema,
        "https://wolipop.detik.com/home/d-5245090/10-jenis-aglaonema-paling-populer-banyak-yang-cari"
    ),
    Plant(3,
        "Lidah Mertua",
        "Sansevieria trifasciata",
        "Sansevieria atau lidah mertua adalah marga tanaman hias yang cukup populer sebagai penghias bagian dalam rumah karena tanaman ini dapat tumbuh dalam kondisi yang sedikit air dan cahaya matahari. Sansevieria memiliki daun keras, sukulen, tegak, dengan ujung meruncing.\n" +
                "Sanseviera dikenal dengan sebutan tanaman lidah mertua karena bentuknya yang tajam. Sanseviera tak hanya sebagai tanaman hias, tapi juga memiliki manfaat untuk menyuburkan rambut, mengobati diabetes, wasir, hingga kanker ganas. Sementara seratnya digunakan sebagai bahan pakaian. Di Jepang, Sanseviera digunakan untuk menghilangkan bau perabotan rumah di ruangan.",
        R.drawable.lidah_mertua,
        "https://www.orami.co.id/magazine/lidah-mertua"
    ),
    Plant(4,
        "Tanduk Rusa",
        "Platycerium coronarium",
        "Tanduk Rusa atau (Platycerium coronarium) termasuk kedalam jenis paku-pakuan. Ini paling banyak ditemukan dan dipelihara sebagai tanaman hias karena juntaian daunnya yang indah.\n" +
                "Tanduk rusa adalah jenis tanaman epifit, tanaman yang menempel pada benda atau pohon lain tanpa merugikan tumbuhan yang menjadi inangnya. Tanduk rusa menyukai tempat yang tidak memperoleh sinar matahari secara langsung.",
        R.drawable.tanduk_rusa,
        "https://www.idntimes.com/life/diy/zihan-berliana-ram-ghani/cara-merawat-tanaman-tanduk-rusa-1"
    ),
    Plant(5,
        "Puring",
        "Codiaeum variegatum",
        "Puring, puding atau kroton (Codiaeum variegatum) adalah tanaman hias pekarangan populer berbentuk perdu dengan bentuk dan warna daun yang sangat bervariasi.\n" +
                "Beragam kultivar telah dikembangkan dengan variasi warna dari hijau, kuning, jingga, merah, ungu, serta campurannya. Bentuk daun pun bermacam-macam: memanjang, oval, tepi bergelombang, helainya \"terputus-putus\", dan sebagainya.",
        R.drawable.puring,
        "https://yoursay.suara.com/health/2022/04/21/160250/7-manfaat-tanaman-puring-salah-satunya-pengisap-udara-kotor"
    ),
    Plant(6,
        "Sirih Gading",
        "Epipremnum aureum",
        "Sirih gading adalah tumbuhan merambat semi-epifit yang biasa ditanam orang sebagai penghias pekarangan atau ruangan. Tumbuhan anggota suku talas-talasan (Araceae) ini mudah dikenal dari warna daunnya yang belang warna kuning cerah hingga kuning pucat, merambat di batang pohon dengan daun yang besar sehingga menutupi batang pohon yang dirambatnya. Apabila ditanam di dalam pot, daunnya mengecil. Potongan cabangnya dapat bertahan hidup cukup lama apabila bagian pangkalnya dicelupkan ke air.",
        R.drawable.sirih_gading,
        "https://www.cnnindonesia.com/gaya-hidup/20220922135908-282-851278/7-cara-agar-sirih-gading-tumbuh-lebih-cepat-dan-subur"
    ),
    Plant(7,
        "Kaktus Tulang Ikan",
        "Cryptocereus anthonyanus",
        "Nama ilmiah untuk kaktus tulang ikan adalah Cryptocereus anthonyanus dan merupakan bagian dari keluarga kaktus. Tanaman ini dikenal karena batangnya yang panjang dan melengkung yang dilapisi dengan simpul daun bergerigi. Kaktus tulang ikan ditemukan di habitatnya dalam kelompok, yang menggantung di pohon. Tanaman ini berasal dari Meksiko, di mana hutan hujan tropis menciptakan lingkungan yang lembab.",
        R.drawable.kaktus_tulang_ikan,
        "https://www.kompas.com/homey/read/2020/12/21/084000776/mengenal-kaktus-tulang-ikan-tanaman-hias-yang-bakal-populer-di-2021?page=all"
    ),
    Plant(8,
        "Calathea Velvet",
        "Calathea rufibarba",
        "Calathea velvet atau yang nama ilmiahnya adalah Calathea rufibarba memiliki dedaunan yang gelap, yang mana itu akan menciptakan kesan terbaik di rumah mana pun. Calathea velvet merupakan tanaman berbunga dalam keluarga Marantaceae yang berasal dari Brasil. Warna daunnya berwarna hijau dominan di bagian atasnya dan warna merah tua di bawahnya.",
        R.drawable.calathea_velvet,
        "https://kabarjoglosemar.pikiran-rakyat.com/gaya-hidup/pr-731213703/cara-merawat-calathea-velvet-tanaman-yang-diprediksi-bakal-booming-di-2021"
    ),
    Plant(9,
        "Chinese Money Plant",
        "Pilea peperomioides",
        "Tanaman ini mendapatkan namanya karena daunnya yang seperti cakram yang terlihat seperti koin berwarna hijau tua. Dilansir Mind Body Green, Jumat (25/3/2022), berasal dari daerah berbatu di China Selatan, Chinese Money Plant juga memiliki berbagai nama lain, termasuk tanaman panekuk, tanaman koin, dan bahkan tanaman UFO karena daunnya yang berbentuk bulat.",
        R.drawable.chinese_money_plant,
        "https://www.kompas.com/homey/read/2022/03/25/170300476/cara-merawat-chinese-money-plant-tanaman-pembawa-keberuntungan?page=all"
    ),
    Plant(10,
        "Janda Bolong",
        "Monstera adansonii",
        "Janda bolong adalah salah satu spesies Monstera. Menurut The Sill, ada dua spesies Monstera yang dapat ditanam sebagai tanaman rumah atau houseplant, yakni yakni Monstera deliciosa dan Monstera adansonii atau yang kita kenal dengan nama janda bolong. Janda bolong berbeda dengan Monstera deliciosa karena punya daun yang lebih ramping dan panjang, serta dikelilingi bolong-bolong daun. Sedangkan bolong pada daun Monstera deliciosa pada akhirnya akan tumbuh di dekat ujung daun dan terbuka seiring tumbuhnya tanaman tersebut.",
        R.drawable.janda_bolong,
        "https://alacasa.id/article/read/10/2020/4015/asal-usul-namanya-fakta-menarik-tanaman-janda-bolong"
    ),
)