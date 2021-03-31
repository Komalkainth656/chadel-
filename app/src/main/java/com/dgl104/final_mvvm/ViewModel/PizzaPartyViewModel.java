package com.dgl104.final_mvvm.ViewModel;

import android.view.View;

import androidx.lifecycle.ViewModel;

import com.dgl104.final_mvvm.Interface.PizzaPartyCallbackInterface;
import com.dgl104.final_mvvm.Model.PizzaPartyModel;

public class PizzaPartyViewModel extends ViewModel {
    private PizzaPartyCallbackInterface pizzaPartyCallbackInterface;
    private PizzaPartyModel pizzaPartyModel;


    public PizzaPartyViewModel(PizzaPartyCallbackInterface pizzaPartyCallbackInterface) {
        this.pizzaPartyCallbackInterface = pizzaPartyCallbackInterface;
        this.pizzaPartyModel = new PizzaPartyModel(pizzaPartyCallbackInterface);
    }
    public void onBtnClicked(View view){
        pizzaPartyModel.setPartySize(6);
        if(pizzaPartyModel.getTotalPizzas() > 0){
            pizzaPartyCallbackInterface.onSuccess("Success");
        }else{
            pizzaPartyCallbackInterface.onError("Error");
        }
    }
}
