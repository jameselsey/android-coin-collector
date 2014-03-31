package com.jameselsey.apps.coin.dao;


import com.jameselsey.apps.coin.domain.Coin;

import java.util.List;

public interface CoinDao {

    List<Coin> getAllCoins();
}
