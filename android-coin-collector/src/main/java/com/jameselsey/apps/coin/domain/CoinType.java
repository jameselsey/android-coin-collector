package com.jameselsey.apps.coin.domain;


public class CoinType {
    private String type;
    private String years;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "CoinType{" +
                "type='" + type + '\'' +
                ", years='" + years + '\'' +
                '}';
    }
}
