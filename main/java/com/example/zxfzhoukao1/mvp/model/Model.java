package com.example.zxfzhoukao1.mvp.model;

import com.example.zxfzhoukao1.mvp.vieww.MyCallback;

public interface Model {
    void getData(String url, MyCallback callback);
}
