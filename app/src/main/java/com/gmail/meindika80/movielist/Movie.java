package com.gmail.meindika80.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class Movie extends AppCompatActivity {

    ListView simpleList;
    String  Item[] = {"BlackPather", "Venom", "Deadpool2", "TheMeg", "Jumanji", "ThePredator"};
    String  SubItem[] = {"T'Challa, penguasa baru Kerajaan maju Wakanda, harus mempertahankan negerinya dari terkoyak-koyak oleh musuh dari luar dan dalam negeri.",
            "Sambil menjelajahi ruang untuk dunia yang dapat dihuni baru, probe milik perusahaan bioteknologi Life Foundation menemukan komet yang tertutup dalam bentuk kehidupan simbiotik. Mereka membawa empat sampel kembali ke Bumi, tetapi satu lolos dan menyebabkan kapal itu jatuh di Malaysia.",
            "Setelah selamat dari serangan sapi yang hampir fatal, seorang koki kafetaria yang rusak Wade Wilson berjuang untuk memenuhi impiannya menjadi bartender terpanas Mayberry sambil juga belajar untuk mengatasi rasa citarasa yang hilang.",
            "Seorang pilot selam laut dalam mengunjungi kembali ketakutan masa lalunya di Palung Mariana, dan secara tidak sengaja melepaskan leluhur tujuh puluh kaki dari Hiu Putih Besar yang diyakini telah punah.",
            "Penjelajah pergi mencari permainan manusia yang telah berakhir di hutan mistis.",
            "Sekuel / reboot terbaru untuk Predator."};
    int flags[] = {R.drawable.bp, R.drawable.venom, R.drawable.dp2, R.drawable.tm, R.drawable.jumanji, R.drawable.tp};

    public  void  Content(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
