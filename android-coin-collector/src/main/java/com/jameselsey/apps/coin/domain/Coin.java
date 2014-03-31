package com.jameselsey.apps.coin.domain;

import java.util.Set;

public class Coin {

    private String coin;
    private CoinType coinType;
    private String reverseDesigner;
    private String obverseDesigner;
    private float weight;
    private float size;
    private Set<Composition> composition;
    private float bullionValue;

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public CoinType getCoinType() {
        return coinType;
    }

    public void setCoinType(CoinType coinType) {
        this.coinType = coinType;
    }

    public String getReverseDesigner() {
        return reverseDesigner;
    }

    public void setReverseDesigner(String reverseDesigner) {
        this.reverseDesigner = reverseDesigner;
    }

    public String getObverseDesigner() {
        return obverseDesigner;
    }

    public void setObverseDesigner(String obverseDesigner) {
        this.obverseDesigner = obverseDesigner;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public Set<Composition> getComposition() {
        return composition;
    }

    public void setComposition(Set<Composition> composition) {
        this.composition = composition;
    }

    public float getBullionValue() {
        return bullionValue;
    }

    public void setBullionValue(float bullionValue) {
        this.bullionValue = bullionValue;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "coin='" + coin + '\'' +
                ", coinType=" + coinType +
                '}';
    }
}
