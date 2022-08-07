package kata.bijak.kartun_anime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
    private final int SPLASH_DISPLAY_LENGTH = 2500;

    /** Called when the activity is first created. */
    @
            Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        /* layout splashscreen dengan background gambar */
        try{
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_main);
            new Handler().postDelayed(new Runnable() {@
                                              Override
                                      public void run() {
                                          Intent mainIntent = null;

                                          mainIntent = new Intent(MainActivity.this, Act_utama.class);

                                          MainActivity.this.startActivity(mainIntent);
                                          MainActivity.this.finish();
                                      }
                                      },
                    SPLASH_DISPLAY_LENGTH);
        }
        catch (Exception e){
            Log.d("a","Errornya ces "+e);
        }

    }

}