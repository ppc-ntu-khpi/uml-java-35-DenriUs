package domain;

public class Order {

    private int orderId;

    private String wishes;

    private boolean isPaid;

    private boolean isReady;

    private ArrayList<Dish> dishes;

    public Order(ArrayList<Dish> dishes, String wishes) {
    }

    public String getWishes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getIsPaid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getIsReady() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<Dish> getDishes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
