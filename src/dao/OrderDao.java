package dao;

import domain.Order;

public interface OrderDao {
    boolean saveOrder(Order order);
    boolean deleteOrder(Order order);
}
