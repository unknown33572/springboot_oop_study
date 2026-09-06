package com.hello.core.discount;

import com.hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscoutPolicyTest {

  RateDiscoutPolicy discountPolicy = new RateDiscoutPolicy();

  @Test
  @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
  void vip_o() {
    //given
    Member member = new Member(1L, "memberVIP", com.hello.core.member.Grade.VIP);
    //when
    int discount = discountPolicy.discount(member, 10000);
    //then
    assertEquals(1000, discount);
  }

}