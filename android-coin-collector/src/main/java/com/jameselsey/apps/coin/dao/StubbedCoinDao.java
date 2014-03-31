package com.jameselsey.apps.coin.dao;

import com.jameselsey.apps.coin.domain.Coin;
import com.jameselsey.apps.coin.domain.CoinType;

import java.util.Arrays;
import java.util.List;


public class StubbedCoinDao implements CoinDao {

    @Override
    public List<Coin> getAllCoins() {

        Coin coin1 = new Coin();
        coin1.setCoin("One Cent");
        CoinType coinType = new CoinType();
        coinType.setType("Type 1");
        coinType.setYears("1966-1977");
        coin1.setCoinType(coinType);

        return Arrays.asList(coin1);
    }
}
