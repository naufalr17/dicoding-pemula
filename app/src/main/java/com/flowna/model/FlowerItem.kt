package com.flowna.model

object FlowerItem {
    private var flowerItem = arrayOf(
        arrayOf(
            "Mawar",
            "Plantae",
            "Magnoliophyta",
            "Mawar adalah suatu jenis tanaman semak dari genus Rosa sekaligus nama bunga yang dihasilkan tanaman ini. Mawar liar terdiri dari 100 spesies lebih, kebanyakan tumbuh di belahan bumi utara yang berudara sejuk. Spesies mawar umumnya merupakan tanaman semak yang berduri atau tanaman memanjat yang tingginya bisa mencapai 2 sampai 5 meter. Walaupun jarang ditemui, tinggi tanaman mawar yang merambat di tanaman lain bisa mencapai 20 meter.\n" +
                    "Sebagian besar spesies mempunyai daun yang panjangnya antara 5–15 cm dengan dua-dua berlawanan (pinnate). Daun majemuk yang tiap tangkai daun terdiri dari paling sedikit 3 atau 5 hingga 9 atau 13 anak daun dan daun penumpu (stipula) berbentuk lonjong, pertulangan menyirip, tepi tepi beringgit, meruncing pada ujung daun dan berduri pada batang yang dekat ke tanah. Mawar sebetulnya bukan tanaman tropis, sebagian besar spesies merontokkan seluruh daunnya dan hanya beberapa spesies yang ada di Asia Tenggara yang selalu berdaun hijau sepanjang tahun.",
            "https://bibitbunga.com/wp-content/uploads/2015/10/mawar-merah-tanpa-duri.jpg"
        ),

        arrayOf(
            "Melati",
            "Plantae",
            "Lamiales",
            "Melati merupakan tanaman bunga hias berupa perdu berbatang tegak yang hidup menahun. Melati merupakan genus dari semak dan tanaman merambat dalam keluarga zaitun",
            "http://image.elevenia.co.id/g/4/8/9/3/2/7/28489327_B.jpg"
        ),

        arrayOf(
            "Kemboja",
            "Plantae",
            "Magnoliophyta",
            "Kamboja atau semboja merupakan sekelompok tumbuhan dalam marga Plumeria. Bentuknya berupa pohon kecil dengan daun jarang namun tebal. Bunganya yang harumnya sangat khas, dengan mahkota berwarna putih hingga merah keunguan, biasanya lima helai"
            , "https://s1.bukalapak.com/img/1426995202/w-1000/Benih_Biji_Bunga_Kamboja_Jepang_Adenium_Obesum_Soft.png"
        ),

        arrayOf(
            "Orchidaceae",
            "Orchidaceae; Juss.",
            "Asparagales",
            "Suku anggrek-anggrekan merupakan satu suku tumbuhan berbunga dengan anggota jenis terbanyak. Jenis-jenisnya tersebar luas dari daerah tropika basah hingga wilayah sirkumpolar, meskipun sebagian besar anggotanya ditemukan di daerah tropika.",
            "https://www.christies.com/img/LotImages/2013/NYR/2013_NYR_02717_0002_000(bateman_james_the_orchidaceae_of_mexico_and_guatemala_london_j_ridgway).jpg"
        ),

        arrayOf(
            "Rafflesia Arnoldi",
            "Rafflesiaceae",
            "Magnoliophyta",
            "Padma raksasa adalah tumbuhan parasit obligat yang terkenal karena memiliki bunga berukuran sangat besar, bahkan merupakan bunga terbesar di dunia. Ia tumbuh di jaringan tumbuhan merambat Tetrastigma dan tidak memiliki daun sehingga tidak mampu berfotosintesis.",
            "https://mmc.tirto.id/image/otf/500x0/2018/01/09/rafflesia-arnoldii-istock_ratio-16x9.jpg"
        ),

        arrayOf(
            "Lavender",
            "Plantae",
            "Lamiaceae",
            "Lavender atau lavendel atau Lavandula adalah genus tumbuhan berbunga dalam suku Lamiaceae yang tersusun atas 25-30 spesies. Asal tumbuhan ini adalah dari wilayah selatan Laut Tengah sampai Afrika tropis dan ke timur sampai India -- Dunia Lama."
            , "https://img.crocdn.co.uk/images/products2/pl/20/00/00/86/pl2000008657.jpg?width=940&height=940"
        ),

        arrayOf(
            "Teratai",
            "Plantae",
            "Nymphaeales",
            "Teratai adalah nama genus untuk tanaman air dari suku Nymphaeaceae. Dalam bahasa Inggris dikenal sebagai water-lily atau waterlily. Di Indonesia, teratai juga digunakan untuk menyebut tanaman dari genus Nelumbo"
            , "https://ecs7.tokopedia.net/img/cache/700/product-1/2016/2/3/6322224/6322224_c4b36e94-7e3f-49cc-914c-25c79ced6094.jpg"
        ),

        arrayOf(
            "Tulip",
            "Liliaceae",
            "lilliales",
            "Tulip merupakan nama genus untuk 100 spesies tumbuhan berbunga yang termasuk ke dalam keluarga Liliaceae. Tulip berasal dari Asia Tengah, tumbuh liar di kawasan pegunungan Pamir dan pegunungan Hindu Kush dan stepa di Kazakhstan. Negeri Belanda terkenal sebagai negeri bunga tulip."
            , "https://www.longfield-gardens.com/_ccLib/image/plants/DETA-98.jpg"
        ),

        arrayOf(
            "Kembang Sepatu",
            "Plantae",
            "Magnoliophyta",
            "Kembang sepatu adalah tanaman semak suku Malvaceae yang berasal dari Asia Timur dan banyak ditanam sebagai tanaman hias di daerah tropis dan subtropis. Bunga besar, berwarna merah dan tidak berbau"
            , "https://ecs7.tokopedia.net/img/cache/700/product-1/2019/1/26/4996785/4996785_f38c5ddb-21f9-4570-81a1-5b63a336696f.png"
        ),

        arrayOf(
            "Krisan",
            "Plantae",
            "Asteraceae",
            "Bunga seruni, krisan, atau krisantemum adalah sejenis tumbuhan berbunga yang sering ditanam sebagai tanaman hias pekarangan atau bunga petik. Tumbuhan berbunga ini mulai muncul pada zaman Kapur"
            , "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/7/23/288364172/288364172_2adb43be-f0cb-470d-aebf-c6a85a2a2c6d_1000_696.jpg"
        )
    )
    val listFlowerArray: ArrayList<FlowerModel>
        get() {
            val listFlower = ArrayList<FlowerModel>()
            for (flower in flowerItem) {
                val flowerModel = FlowerModel()
                flowerModel.nama = flower[0]
                flowerModel.kingdom = flower[1]
                flowerModel.divisi = flower[2]
                flowerModel.deskripsi = flower[3]
                flowerModel.gambar = flower[4]

                listFlower.add(flowerModel)
            }
            return listFlower
        }
}
