package com.hello.core.discount;

import com.hello.core.member.Grade;
import com.hello.core.member.Member;

public class RateDiscoutPolicy implements DiscountPolicy {

  private final int discountPercent = 10;

  @Override
  public int discount(Member member, int price) {
    if (member.getGrade() == Grade.VIP) {
      return discountPercent(price);
    } else {
      return 0;
    }
  }

  private int discountPercent(int price) {
    return price * discountPercent / 100;
  }
}
