package com.example.praktikumtgs6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createResepData()
        RV.layoutManager = LinearLayoutManager (this)
        RV.setHasFixedSize(true)
        RV.adapter = ResepAdapter(testData, {resepItem : resepData -> resepItemClicked(resepItem) })
    }
    private fun resepItemClicked(resepItem : resepData){
        val showDetailActivityIntent = Intent(this, resep_detail_activity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, resepItem.jdl)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, resepItem.tmp)
        showDetailActivityIntent.putExtra(Intent.ACTION_ANSWER, resepItem.desc)
        showDetailActivityIntent.putExtra(Intent.ACTION_CHOOSER, resepItem.img.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createResepData() : List<resepData> {
        val partList = ArrayList<resepData>()
        partList.add(resepData("Gado-gado", "Surabaya", "Bahan-bahan\n" + "\n" + "•\t200 gr Kacang Tanah\n" + "•\t3 bh Bawang Putih\n" + "•\t25 gr Gula Merah\n" + "•\t5 Bh Cabe merah besar\n" +
                "•\t120 ml Santan kental\n" + "•\t3 Bh Tahu\n" + "•\t1 Papan Tempe\n" + "•\t1 ikat selada\n" + "•\t2 Bh kentang\n" + "•\t2 Bh Tomat\n" + "•\t2 Bh Telur Rebus\n" + "•\tKecambah\n" + "•\tLontong \n" + "\n" +
                "Langkah – Langkah\n" + "\n" + "-\tRebus Telur, kentang dan kecambah\n" + "-\tGoreng tahu, tempe, lalu kacang tanah, bawang putih dan cabe merah, sisihkan\n" + "-\tPotong2 selada, tomat dan bahan2 yang diatas\n" +
                "-\tHaluskan kacang tanah bawang putih dan cabe sampai halus (pakai blender lebih cepat dan ga pegel) *klo sy di uleg makanya lama proses ini\n" + "-\tSelagi suami nguleg bumbu sy bikin lontong *lain kali di posting cara bikin lontong\n" +
                "-\tDidihkan air lalu masukkan kacang yang sudah lembut td.. panaskan sampai meletup letup, lalu masukkan santan aduk2,gula merah, garam dan gula. aduk kembali koreksi rasa. matikan api\n" + "-\tSusun lontong beserta kawan2nya di atas piring saji. siram dengan kuah gado2nya taburi bawang goreng dan sajikan\n", R.drawable.gado))
        partList.add(resepData("Tahu Tek", "Surabaya", "Bahan-bahan (4 porsi)\n" + "\n" + "•\t6 buah tahu, potong kotak-kotak kecil\n" + "•\tsecukupnya kecap manis\n" + "•\tsecukupnya air\n" +
                "•\tsecukupnya minyak goreng\n" + "•\tBahan pelengkap:\n" + "•\tsecukupnya irisan lontong\n" + "•\t250 gr taoge, buang ekor dan kulit kepalanya, rebus sebentar\n" + "•\tsecukupnya irisan telur dadar\n" + "•\t10 batang seledri, iris halus\n" +
                "•\tsecukupnya bawang goreng\n" + "•\tsecukupnya kerupuk\n" + "•\tBumbu yang dihaluskan:\n" + "•\t100 gr kacang tanah goreng\n" + "•\tsecukupnya cabe rawit\n" + "•\t2 siung bawang putih\n" + "•\t1 sdm petis udang\n" + "•\tsecukupnya garam \n" +
                "\n" + " \t Langkah – langkah (60 menit)\n" + "\n" + "-\tDalam wadah campur bumbu yang sudah dihaluskan tadi lalu tambahkan kecap manis dan air, aduk rata lalu sisihkan.\n" + "-\tGoreng tahu dalam minyak panas hingga matang, angkat lalu tiriskan.\n" +
                "-\tTata dalam piring potongan lontong, tahu goreng, taoge, irisan telur dadar, irisan seledri. Lalu siram dengan kuah kacangnya. Taburi dengan bawang goreng dan beri kerupuk.\n" + "-\tSajikan tahu tek selagi hangat.\n", R.drawable.tek))
        partList.add(resepData("Rawon", "Surabaya", "Bahan-bahan (5 porsi)\n" +"\n" + "•\t1 kg daging sapi\n" + "•\t3 lbr daun jeruk\n" + "•\t3 lbr daun salam\n" + "•\t2 btg sereh\n" + "•\t1 jempol lengkuas\n" + "•\tsecukupnya Garam & gula\n" +
                "•\tBumbu halus :\n" + "•\t10 buah kluwek(pastikan jgn ada yg pahit)seduh dgn air panas\n" + "•\t7 siung bawang merah\n" + "•\t4 siung bawang putih\n" + "•\t1 jempol kunyit\n" + "•\t1 jempol jahe\n" + "•\t1 sdt ketumbar bubuk \n" + "\n" +
                " \tLangkah – langkah \n" +"\n" + "-\tPresto / rebus daging dengan 1.5 L air sampai empuk. Tunggu hangat, angkat daging, potong\". Masukkan kembali potongan daging ke air rebusan. sisihkan\n" +
                "-\tPanaskan sedikit minyak, tumis bumbu halus, tambahkan bumbu dapur yg lain. Tumis hingga wangi.\n" + "-\tTuang tumisan bumbu ke dalam rebusan daging. Tambahkan garam & gula. koreksi rasa. Masak hingga air mendidih dan bumbu meresap. Matikan api lalu taburi dgn irisan daun bawang\n" +
                "-\tSajikan rawon dgn pelengkap lainnya seperti tauge, telur asi n dan sambal terasi mentah\n", R.drawable.rawon))
        partList.add(resepData("Lontong Balap", "Surabaya", "Bahan-bahan (2 porsi) :\n" +"\n" + "•\t200 gr Tauge\n" + "•\t1 buah Tahu, potong sesuapan, goreng sedang\n" + "•\t1 buah Tomat, belah jadi 4\n" + "•\tBumbu:\n" +
                "•\t3 siung Bawang merah, cincang\n" + "•\t2 siung Bawang putih, cincang\n" + "•\tSesuai selera Seledri, iris\n" + "•\tSesuai selera Daun bawang, iris\n" + "•\tSecukupnya Kecap manis\n" + "•\tSecukupnya Dashi (bubuk kaldu ikan, bisa skip)\n" + "•\tSecukupnya Garam, gula, merica\n" +
                "•\tSecukupnya Air \n" + "\n" + " \tLangkah – langkah (15 menit)\n" +"\n" + "-\tTumis bawang merah dan putih sampai harum\n" + "-\tMasukkan air, tahu, tomat, seledri, daun bawang, tunggu hingga mendidih\n" + "-\tMasukkan tauge\n" + "-\tSegera tambahkan kecap, dashi, garam, gula, dan merica. Tes rasanya.\n" +
                "-\tBila rasa sudah oke, segera matikan api agar tauge tidak layu. Biarkan tauge matang begitu saja karena panasnya kuah.\n" + "-\tJangan lupa taburan bawang gorengnya saat akan disantap! Wenak rek!\n", R.drawable.lontong))
        partList.add(resepData("Rujak Cingur", "Surabaya", "Bahan-bahan\n" + "\n" + "•\t1 ons cingur sapi\n" + "•\tBumbu rujak\n" + "•\t2 siung bawang putih di goreng\n" + "•\t1 ons kacang tanah di goreng\n" + "•\t1/4 ons petis udang\n" +
                "•\t1 buah pisang klutuk\n" + "•\t3 sdm Air asam\n" + "•\t5 biji cabe rawit\n" + "•\tGaram,gula putih\n" + "•\tGula merah\n" + "•\tIsian\n" + "•\t1/2 papan tempe\n" + "•\t1/2 kotak tahu\n" + "•\t1 ikat kangkung\n" +
                "•\t1/2 ikat kacang panjang\n" + "•\t1/2 ons kecambah\n" + "•\t1 butir timun \n" + "\n" + " Langkah - langkah \n" + "\n" + "-\tGodok cingur sampai empuk lalu goreng sisihkan\n" + "-\tSemua sayur di rebus sampai matang sisihkan,\n" + "-\tGoreng tahu,tempe,kacang tanah,dan bawang putih\n" +
                "-\tSiapkan layah lalu ulek kacang tanah sampai halus,lalu masukkan bawang putih + cabe rawit sesuai selera,serta parut pisang klutuk lalu ulek lg sampai halus baru masukkan petis dan kasih air putih biasa dan air asam sedikit biar mudah diulek lalu aduk sampai tercampur rata,masukkan gula merah,gula putih dan garam aduk2 rata,lalu tes rasa kl sdh pas rasanya baru masukkan sedikit2 sayur smua,potong tahu+tempe+cingur+timun dan aduk rata\n" +
                "-\tDan rujak cingur siap di hidangkan bersama krupuk hmm mantap\n", R.drawable.rujak))
        return partList
    }

}
