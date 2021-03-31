package com.dgl104.final_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.dgl104.final_mvvm.Interface.PizzaPartyCallbackInterface;
import com.dgl104.final_mvvm.ViewModel.PizzaPartyViewModel;
import com.dgl104.final_mvvm.ViewModel.PizzaPartyViewModelFactory;
import com.dgl104.final_mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements PizzaPartyCallbackInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders.of(
                this, new PizzaPartyViewModelFactory(
                        this)).get(PizzaPartyViewModel.class));


    }

    @Override
    public void onSuccess(String message) {
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    @Override
    public void onError(String message) {
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}