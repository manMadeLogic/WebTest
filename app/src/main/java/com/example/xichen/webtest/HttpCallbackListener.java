package com.example.xichen.webtest;

/**
 * Created by Xi Chen on 2016/12/3.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
