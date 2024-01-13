package com.lsz.contract;

import com.lsz.common.Money;
import com.lsz.common.Party;
import com.lsz.common.TradingProduct;

/**
 * @ClassName SimpleContract
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/13 下午10:27
 * @Version 1.0.0
 **/
public class ContractV2 {

    /**
     * 卖方
     */
    private Party payee;

    /**
     * 买方
     */
    private Party payer;

    private Integer num;

    private Money money;

    private TradingProduct tradingProduct;

}
