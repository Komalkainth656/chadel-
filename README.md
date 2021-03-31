# PizzaPartyMVC
 > The changes to convert MVP assignment to MVVM are gievn below:-
1. 	I created View Model Package to implement MVVM, there are two java classes named PizzaPartyViewModel and PizzaPartyViewModelFactory.
2.	PizzaPartyViewModel works like intermediater between model and view. PizzaPartyViewModelFactory extends ViewModelProvider.NewInstanceFactory which contains interface named PizzaPartyCallbackInterface.
3. PizzaPartyModel contains the methods for calulation in model package. it extends BaseObservable to handle android arch lifecylce.
4. There is a change in button onclick property in activity_main.xml file 
	android:onClick="@{viewModel::onBtnClicked}" 
5. Data tag is included in activity_main.xml which contains the reference of ViewModel to call the method named as  onBtnClicked



