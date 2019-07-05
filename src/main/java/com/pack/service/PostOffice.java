package com.pack.service;



public interface PostOffice {
    boolean sendPost(String post);
    boolean sendCourier(String courier);
    boolean sendMoney(long money);
}
