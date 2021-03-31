package com.dgl104.final_mvvm.ViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.dgl104.final_mvvm.Interface.PizzaPartyCallbackInterface;
import com.dgl104.final_mvvm.Model.PizzaPartyModel;

public class PizzaPartyViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private PizzaPartyCallbackInterface pizzaPartyCallbackInterface;

    public PizzaPartyViewModelFactory(PizzaPartyCallbackInterface pizzaPartyCallbackInterface) {
        this.pizzaPartyCallbackInterface = pizzaPartyCallbackInterface;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new PizzaPartyViewModel(pizzaPartyCallbackInterface);
    }
}
