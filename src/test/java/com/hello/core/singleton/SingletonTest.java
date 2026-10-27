package com.hello.core.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {
  @Test
  @DisplayName("싱글톤 패턴을 적용한 객체 사용")
  void singletonServiceTest() {
    SingletonService singletonService1 = SingletonService.getInstance();
    SingletonService singletonService2 = SingletonService.getInstance();
//    SingletonService singletonService3 = new SingletonService(); 싱글톤이라 생성자 접근제한자

//    System.out.println(singletonService1);
//    System.out.println(singletonService2);
    assertThat(singletonService1).isSameAs(singletonService2);
  }
}
