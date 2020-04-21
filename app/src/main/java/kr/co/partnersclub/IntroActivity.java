package kr.co.partnersclub;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.trncic.library.DottedProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    private static final String TAG = "IntroActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intro);

        DottedProgressBar progressBar = (DottedProgressBar) findViewById(R.id.progress);
        progressBar.startProgress();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        }, 2000);
    }
}
