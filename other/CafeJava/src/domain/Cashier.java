package domain;

import java.util.ArrayList;

public class Cashier extends Customer {

    private ArrayList<Order> unpaidOrders;

    public Cashier(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public ArrayList<Order> getUnpaidOrders() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void confirmOrderPayment(Order unpaidOrder) {
    }
}
