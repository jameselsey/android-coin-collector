package com.jameselsey.apps.coin.application;

import com.jameselsey.apps.coin.activity.MainActivity;
import com.jameselsey.apps.coin.dao.StubbedCoinDao;
import com.jameselsey.apps.coin.service.CoinService;
import com.jameselsey.apps.coin.service.CoinServiceImpl;
import dagger.Module;
import dagger.Provides;

@Module(
        injects = MainActivity.class,
        complete = false
)
public class CoinModule {

    @Provides
    CoinService provideCoinService() {
        return new CoinServiceImpl(new StubbedCoinDao());
    }

}
