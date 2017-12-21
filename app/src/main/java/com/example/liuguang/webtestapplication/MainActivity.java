package com.example.liuguang.webtestapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends BaseActivity {

//    @Override
//    protected void attachBaseContext(Context newBase) {
//        Log.d("lc","attachBaseContext");
//        super.attachBaseContext(ChangeLanguageUtils.attachBaseContext(newBase));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lc","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Resources resources = this.getResources();
//        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
//        Configuration configuration = resources.getConfiguration();
//        configuration.locale = Locale.CHINESE;
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
//            Log.d("locale","api level > 24");
//            this.createConfigurationContext(configuration);
//        }else {
//            Log.d("locale","api level < 24");
//            resources.updateConfiguration(configuration,displayMetrics);
//        }

//        WebView webView = (WebView) findViewById(R.id.web_view);
//        webView.getSettings().setJavaScriptEnabled(true);

        ((TextView)findViewById(R.id.textView)).setText(getResources().getString(R.string.app_name));
//        webView.loadUrl("https://www.baidu.com/");
        findViewById(R.id.button_to_next_page).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ToActivity.class);
                startActivity(intent);
            }
        });
    }
}
