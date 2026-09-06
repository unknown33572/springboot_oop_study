package com.hello.core;

import com.hello.core.member.Member;
import com.hello.core.member.MemberService;
import com.hello.core.member.MemberServiceImpl;

public class MemberApp {
  public static void main(String[] args) {
//    MemberService  memberService = new MemberServiceImpl();
//    Member member = new Member(1L, "memberA", com.hello.core.member.Grade.VIP);
//    memberService.join(member);
//
//    Member findMember = memberService.findMember(1L);
//
//    System.out.println("new member = " + member.getName());
//    System.out.println("found member = " + findMember.getName());
//    System.out.println("member equals found member = " + (member == findMember)); // false
//    System.out.println("member equals found member = " + (member.getName().equals(findMember.getName()))); // true

    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();

    Long memberId = 1L;
    Member member = new Member(memberId, "memberA", com.hello.core.member.Grade.VIP);
    memberService.join(member);

    Member findMember = memberService.findMember(1L);
    System.out.println("new member = " + member.getName());
    System.out.println("found member = " + findMember.getName());
  }
}
