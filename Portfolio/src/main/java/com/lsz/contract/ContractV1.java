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
public class ContractV1 {

    /**
     * 对手方
     */
    private Party opponent;

    private Integer num;

    private Money money;

    private TradingProduct tradingProduct;

    /**
     * 买入还是卖出
     */
    private boolean buyIn;

}
