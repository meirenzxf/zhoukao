package com.example.zxfzhoukao1.mvp.vieww;

import com.example.zxfzhoukao1.bean.MyData;

public interface MyCallback {
    void setSuccess(MyData myData);
    void setError(String error);
}
