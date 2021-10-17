package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

import java.util.ArrayList;
import java.util.List;

public class ObservableStockImpl extends ObservableStock {

    private ArrayList<ObserverStockExchangeCenter> observers;
    private StockType type;

    public ObservableStockImpl(StockType name) {
        super(name);
        this.type = name;
        this.observers = new ArrayList<>();
    }

    @Override
    public void setPrice(double price) {
        System.out.println("BRUH");
        this.notifyPriceChange(price);
    }

    public void notifyPriceChange(double price) {
        for (ObserverStockExchangeCenter o : this.observers) {
            o.notifyChange(this.type, price);
        }
    }

    public void registerStockExchangeCenter(ObserverStockExchangeCenter oc) {
        observers.add(oc);
    }

    // @TODO: Override any necessary methods
}
