package com.dgl104.final_mvvm.Model;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;

import com.dgl104.final_mvvm.HungerLevel;
import com.dgl104.final_mvvm.Interface.PizzaPartyCallbackInterface;

public class PizzaPartyModel extends BaseObservable {
    private final static int SLICES_PER_PIZZA = 8;
    @NonNull
    private HungerLevel HungerLevel;
    private int PartySize;

    public PizzaPartyModel(PizzaPartyCallbackInterface pizzaPartyCallbackInterface) {
    }

    public HungerLevel getHungerLevel() {
        return HungerLevel;
    }

    public int getPartySize() { 
        // 
        return PartySize;
    }

    public void setHungerLevel(HungerLevel mHungerLevel) {
        this.HungerLevel = mHungerLevel;
    }

    public void setPartySize(int mPartySize) {
        if (mPartySize >= 0) {
            this.PartySize = mPartySize;
        }

    }

    public int getTotalPizzas() {
        int slicesPerPerson;
        if (HungerLevel == HungerLevel.LIGHT) {
            slicesPerPerson = 2;
        } else if (HungerLevel == HungerLevel.MEDIUM) {
            slicesPerPerson = 3;
        } else {
            slicesPerPerson = 4;
        }
        return (int) Math.ceil(PartySize * slicesPerPerson / (double) SLICES_PER_PIZZA);
    }

}
