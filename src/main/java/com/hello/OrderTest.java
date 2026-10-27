package com.hello;

import java.util.List;

public class OrderTest {
  record Order(long orderId, long customerId, int amount) {}

//  List<Long> top3Customers(List<Order> orders) {
//  }
}
