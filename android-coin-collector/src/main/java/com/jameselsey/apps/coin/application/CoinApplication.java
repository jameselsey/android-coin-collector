package com.jameselsey.apps.coin.application;

import android.app.Application;
import dagger.ObjectGraph;

import java.util.Arrays;
import java.util.List;

public class CoinApplication extends Application {

    private ObjectGraph graph;

    @Override
    public void onCreate() {
        super.onCreate();

        graph = ObjectGraph.create(getModules().toArray());
    }

    protected List<Object> getModules() {
        return Arrays.asList(
                new AndroidModule(this),
                new CoinModule()
        );
    }

    public void inject(Object object) {
        graph.inject(object);
    }
}
