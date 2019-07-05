package com.pack.service;

import org.springframework.stereotype.Service;

@Service
public class AccountingCounterImpl implements AccountingCounter {

    long count = 0L;

    @Override
    public Long count() {
        return count++;
    }

    @Override
    public Long getCount() {
        return count;
    }
}
