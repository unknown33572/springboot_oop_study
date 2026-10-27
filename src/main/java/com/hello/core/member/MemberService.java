package com.hello.core.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface MemberService {
  @Bean
  void join(Member member);
  @Bean
  Member findMember(Long memberId);
}
