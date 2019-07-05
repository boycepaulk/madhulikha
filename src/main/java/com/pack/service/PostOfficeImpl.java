package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostOfficeImpl implements PostOffice {


    @Autowired
    AccountingCounter accountingCounter;


    @Override
    public boolean sendPost(String from) {
        System.out.println("Sending post for " + from);
        accountingCounter.count();
        return true;
    }

    @Override
    public boolean sendCourier(String from) {
        System.out.println("Sending courier for " + from);
        accountingCounter.count();
        return true;
    }

    @Override
    public boolean sendMoney(long from) {
        System.out.println("Sending money for "+ from);
        accountingCounter.count();
        return true;
    }
}
