package kata.bijak.kartun_anime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import kata.bijak.kartun_anime.bantuan.Act_set_get;
import kata.bijak.kartun_anime.bantuan.ConnectionDetector;

public class Act_utama extends Activity implements  View.OnClickListener {
    Button btn_pres,btn_wapres;
    ConnectionDetector cd;
    Boolean isInternetPresent = false;
    LinearLayout lnr_aot,lnrt_avatar,lnr_brave,lnr_captain,lnr_coco,lnr_deathnote,lnr_demon,lnr_detect,lnr_des_me,lnr_doraemon,lnr_dragon,lnr_frozen,lnr_full,lnr_haikyu,lnr_howto,lnr_inside,lnr_inuyasha,lnr_kungfu,lnr_naruto,lnr_ninjahattori,lnr_op,lnr_opm,lnr_ratatouille,lnr_samx,lnr_shman,lnr_shrek,lnr_soul,lnr_spongs,lnr_tangled,lnr_tokyo,lnr_toystor,lnr_turning,lnr_up,lnr_wreck,lnr_yuyu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.lay_utama);
        lnr_aot=(LinearLayout)findViewById(R.id.ln_aot);
        lnrt_avatar=(LinearLayout)findViewById(R.id.ln_avatar);
        lnr_brave=(LinearLayout)findViewById(R.id.ln_brave);
        lnr_captain=(LinearLayout)findViewById(R.id.ln_captain);
        lnr_coco=(LinearLayout)findViewById(R.id.ln_coco);
        lnr_detect=(LinearLayout)findViewById(R.id.ln_detect);
        lnr_des_me=(LinearLayout)findViewById(R.id.ln_des_me);
        lnr_doraemon=(LinearLayout)findViewById(R.id.ln_doraemon);
        lnr_dragon=(LinearLayout)findViewById(R.id.ln_dragon);
        lnr_deathnote=(LinearLayout)findViewById(R.id.ln_deathnote);
        lnr_demon=(LinearLayout)findViewById(R.id.ln_demon);
        lnr_frozen=(LinearLayout)findViewById(R.id.ln_frozen);
        lnr_full=(LinearLayout)findViewById(R.id.ln_full);
        lnr_haikyu=(LinearLayout)findViewById(R.id.ln_haikyu);
        lnr_howto=(LinearLayout)findViewById(R.id.ln_howto);
        lnr_inside=(LinearLayout)findViewById(R.id.ln_inside);
        lnr_inuyasha=(LinearLayout)findViewById(R.id.ln_inuyasha);
        lnr_kungfu=(LinearLayout)findViewById(R.id.ln_kungfu);
        lnr_naruto=(LinearLayout)findViewById(R.id.ln_naruto);
        lnr_ninjahattori=(LinearLayout)findViewById(R.id.ln_ninja_hattori);
        lnr_op=(LinearLayout)findViewById(R.id.ln_op);
        lnr_opm=(LinearLayout)findViewById(R.id.ln_opm);
        lnr_ratatouille=(LinearLayout)findViewById(R.id.ln_ratatouille);
        lnr_samx=(LinearLayout)findViewById(R.id.ln_samx);
        lnr_shman=(LinearLayout)findViewById(R.id.ln_shman);
        lnr_shrek=(LinearLayout)findViewById(R.id.ln_shrek);
        lnr_soul=(LinearLayout)findViewById(R.id.ln_soul);
        lnr_spongs=(LinearLayout)findViewById(R.id.ln_spongs);
        lnr_tangled=(LinearLayout)findViewById(R.id.ln_tangled);
        lnr_tokyo=(LinearLayout)findViewById(R.id.ln_tokyo);
        lnr_toystor=(LinearLayout)findViewById(R.id.ln_toystor);
        lnr_turning=(LinearLayout)findViewById(R.id.ln_turning_red);
        lnr_up=(LinearLayout)findViewById(R.id.ln_up);
        lnr_wreck=(LinearLayout)findViewById(R.id.ln_wreck);
        lnr_yuyu=(LinearLayout)findViewById(R.id.ln_yuyu);

        lnr_aot.setOnClickListener(this);
        lnrt_avatar.setOnClickListener(this);
        lnr_brave.setOnClickListener(this);
        lnr_captain.setOnClickListener(this);
        lnr_coco.setOnClickListener(this);
        lnr_deathnote.setOnClickListener(this);
        lnr_demon.setOnClickListener(this);
        lnr_des_me.setOnClickListener(this);
        lnr_detect.setOnClickListener(this);
        lnr_doraemon.setOnClickListener(this);
        lnr_dragon.setOnClickListener(this);
        lnr_frozen.setOnClickListener(this);
        lnr_full.setOnClickListener(this);
        lnr_haikyu.setOnClickListener(this);
        lnr_howto.setOnClickListener(this);
        lnr_inside.setOnClickListener(this);
        lnr_inuyasha.setOnClickListener(this);
        lnr_kungfu.setOnClickListener(this);
        lnr_naruto.setOnClickListener(this);
        lnr_ninjahattori.setOnClickListener(this);
        lnr_op.setOnClickListener(this);
        lnr_opm.setOnClickListener(this);
        lnr_ratatouille.setOnClickListener(this);
        lnr_samx.setOnClickListener(this);
        lnr_shman.setOnClickListener(this);
        lnr_shrek.setOnClickListener(this);
        lnr_soul.setOnClickListener(this);
        lnr_spongs.setOnClickListener(this);
        lnr_tangled.setOnClickListener(this);
        lnr_tokyo.setOnClickListener(this);
        lnr_toystor.setOnClickListener(this);
        lnr_turning.setOnClickListener(this);
        lnr_up.setOnClickListener(this);
        lnr_wreck.setOnClickListener(this);
        lnr_yuyu.setOnClickListener(this);
        ConnectionDetector cd;
        Boolean isInternetPresent = false;

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView bannerAdview = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAdview.loadAd(adRequest);
    }

    @Override
    public void onClick(View view) {
        cd = new ConnectionDetector(getApplicationContext());
        isInternetPresent = cd.isConnectingToInternet();
        Act_set_get ambil = new Act_set_get();

        if (isInternetPresent) {
            if (view == lnr_aot) {
                ambil.set_nama("AOT");
            }else if (view == lnrt_avatar) {
                ambil.set_nama("AVATAR");
            } else if (view == lnr_brave) {
                ambil.set_nama("BRAVE");
            }else if (view == lnr_captain) {
                ambil.set_nama("CAPTAIN");
            }else if (view == lnr_coco) {
                ambil.set_nama("COCO");
            }else if (view == lnr_deathnote) {
                ambil.set_nama("DEATH");
            } else if (view == lnr_demon) {
                ambil.set_nama("DEMON");
            }else if (view == lnr_detect) {
                ambil.set_nama("DETECTIVE");
            }else if (view == lnr_des_me) {
                ambil.set_nama("DESPICABLE");
            }else if (view == lnr_doraemon) {
                ambil.set_nama("DORAEMON");
            }else if (view == lnr_dragon) {
                ambil.set_nama("DRAGON");
            }else if (view == lnr_frozen) {
                ambil.set_nama("FROZEN");
            }else if (view == lnr_full) {
                ambil.set_nama("FULL");
            }else if (view == lnr_haikyu) {
                ambil.set_nama("HAIKYU");
            }else if (view == lnr_howto) {
                ambil.set_nama("HOW_TO");
            }else if (view == lnr_inside) {
                ambil.set_nama("INSIDE");
            }else if (view == lnr_inuyasha) {
                ambil.set_nama("INUYASHA");
            }else if (view == lnr_kungfu) {
                ambil.set_nama("KUNGFU");
            }else if (view == lnr_naruto) {
                ambil.set_nama("NARUTO");
            }else if (view == lnr_ninjahattori) {
                ambil.set_nama("NINJA");
            }else if (view == lnr_op) {
                ambil.set_nama("ONE_PIECE");
            }else if (view == lnr_opm) {
                ambil.set_nama("ONE_PUNCH");
            }else if (view == lnr_ratatouille) {
                ambil.set_nama("RATA");
            }else if (view == lnr_samx) {
                ambil.set_nama("SAMURAI");
            }else if (view == lnr_shman) {
                ambil.set_nama("SHAMAN");
            }else if (view == lnr_shrek) {
                ambil.set_nama("SHREK");
            }else if (view == lnr_soul) {
                ambil.set_nama("SOUL");
            }else if (view == lnr_spongs) {
                ambil.set_nama("SPONGEBOB");
            }else if (view == lnr_tangled) {
                ambil.set_nama("TANGLED");
            }else if (view == lnr_tokyo) {
                ambil.set_nama("TOKYO");
            }else if (view == lnr_toystor) {
                ambil.set_nama("TOYS");
            }else if (view == lnr_turning) {
                ambil.set_nama("TURNING");
            }else if (view == lnr_up) {
                ambil.set_nama("UP_");
            }else if (view == lnr_wreck) {
                ambil.set_nama("WRECK");
            }else if (view == lnr_yuyu) {
                ambil.set_nama("YUYU");
            }
            Intent a = new Intent(Act_utama.this, Act_detail_kata.class);
            startActivity(a);
        }
        else{
            inet_mati();
        }
    }
    public void inet_mati () {
        AlertDialog damz_dialog = new AlertDialog.Builder(Act_utama.this).create();
        damz_dialog.setTitle("Peringatan");
        //damz_dialog.setIcon(R.drawable.warning);
        damz_dialog.setMessage("Mohon Nyalakan Internetmu...");
        damz_dialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        damz_dialog.show();
    }
}