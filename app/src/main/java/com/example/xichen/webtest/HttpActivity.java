package com.example.xichen.webtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.net.HttpURLConnection;

/**
 * Created by Xi Chen on 2016/12/3.
 */
public class HttpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.http_page);
        HttpUtil.sendHttpRequest("http://www.baidu.com", new HttpCallbackListener() {
            @Override
            public void onFinish(String response) {
                TextView responseText = (TextView) findViewById(R.id.response_text);
                if (response != null) {
                    responseText.setText(response);
                }
            }

            @Override
            public void onError(Exception e) {
                e.printStackTrace();
            }
        });
    }
}
