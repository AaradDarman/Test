package ir.aaraddarman.aftereffectexample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

  private final int SPLASH_DISPLAY_LENGTH = 2000;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

    new Handler().postDelayed(new Runnable(){
      @Override
      public void run() {
        /* Create an Intent that will start the Menu-Activity. */
        Intent mainIntent = new Intent(Splash.this,MainActivity.class);
        Splash.this.startActivity(mainIntent);
        overridePendingTransition(0, 0);
        Splash.this.finish();
      }
    }, SPLASH_DISPLAY_LENGTH);
  }
}
