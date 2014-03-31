package com.jameselsey.apps.coin.service;

import com.jameselsey.apps.coin.dao.CoinDao;
import com.jameselsey.apps.coin.domain.Coin;

import javax.inject.Inject;
import java.util.List;


public class CoinServiceImpl implements CoinService {

    private final CoinDao coinDao;

    @Inject
    public CoinServiceImpl(CoinDao coinDao) {
        this.coinDao = coinDao;
    }

    @Override
    public List<Coin> getCoins() {
        return coinDao.getAllCoins();
    }
}
