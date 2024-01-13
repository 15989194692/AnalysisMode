package com.lsz.common;

/**
 * @ClassName Money
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/13 下午10:30
 * @Version 1.0.0
 **/
public class Money {

    private final Long unitAmt;

    private final String ccy;


    public Money(Long unitAmt, String ccy) {
        this.unitAmt = unitAmt;
        this.ccy = ccy;
    }

}
