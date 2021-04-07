package com.example.a10118397;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;

        import static java.lang.Thread.sleep;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, Log2Activity.class)); //kalau ke login kok eror?
                    finish();
                }
            }
        };
        thread.start();
    }
}