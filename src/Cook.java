package domain;

import java.util.ArrayList;

public class Cook extends Customer {

    private ArrayList<Order> paidOrders;

    public Cook(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public ArrayList<Order> getPaidOrders() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void completeOrder(Order paidOrder) {
    }
}
