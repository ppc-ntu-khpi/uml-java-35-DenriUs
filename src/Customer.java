package domain;

import java.util.ArrayList;

public class Customer {

    private int userId;

    private String firstName;

    private String secondName;

    private ArrayList<Order> orders;

    public Customer(String firstName, String secondName) {
    }

    public void createOrder(Order order) {
    }

    public String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getSecondName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<Order> getOrders() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
