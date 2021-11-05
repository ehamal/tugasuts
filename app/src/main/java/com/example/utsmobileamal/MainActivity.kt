package com.example.utsmobileamal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.adella,"Slawi, Kabupaten Tegal.Jl. Prof. Moh. Yamin No. 77, Slawi, TegalJawa Tengah - Indonesia","rsu adella","Rumah sakit Adella adalah rumah sakit umum (RSU) milik swasta dan merupakan salah satu rumah sakit tipe D"))

        data?.add(DataModel(R.drawable.harapananda,"dijalan ababil No. 42 Randugunting Tegal,Jawa tengah ","Rsu harapan anda", "RSU. Islam Harapan Anda adalah Rumah Sakit Kelas B yang merupakan rumah sakit milik Yayasan "))

        data?.add(DataModel(R.drawable.muhamadiyahadiwerna,"Jl.singkil no.KM 0,5 Adiwerna,Tegal,jawa tenggah","Rsu muhamadiyah Adiwerna", "Rumah Sakit sebagai salah satu dari sarana kesehatan merupakan rujukan pelayanan kesehatan dengan fungsi utama menyelenggarakan upaya kesehatan yang bersifat penyembuhan dan pemulihan bagi pasien."))

        data?.add(DataModel(R.drawable.hawariessa,"Jl.Banjaranyar Lebaksiu,Tegal","Rsu hawariessa", "Rumah Sakit Hawari Essa berlokasi di jalan Raya Slawi Purwokerto RT01/RW05 Kajen Lebaksiu Kabupaten Tegal. Rumah Sakit Hawari Essa di dirikan di atas tanah seluas 7480 m2 dengan izin mendirikan rumah sakit nomor 440/17/001/II/2019 yang di kelola oleh PT. SYafira Mulia Medika dengan kepemilikan saham oleh pada owner."))

        data?.add(DataModel(R.drawable.soesilo,"Jl.Dr.soetomo No.63,Slawi kulon,Tegal,","RSUD  soesilo ","Rumah Sakit Umum Daerah (RSUD) Dr. Soeselo Kabupaten Tegal merupakan milik Pemerintah Kabupaten Tegal "))

        data?.add(DataModel(R.drawable.rsukardinah,"JL.Sultan agung No.59 kejambon Tegal timur Kota Tegal","Rsu kardinah", "RSUD Kardinah adalah rumah sakit umum yang berada dibawah otoritas Pemerintah Kota Tegal."))





        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.alamat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}