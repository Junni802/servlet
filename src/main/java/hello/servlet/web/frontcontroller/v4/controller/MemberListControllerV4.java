package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;
import hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.List;
import java.util.Map;

/**
 * hello.servlet.web.frontcontroller.v3.controller MemberListController
 *
 * @author : junhyuk Park
 * @date : 2023.04.04
 * @tags :
 */
public class MemberListControllerV4 implements ControllerV4 {

  private MemberRepository memberRepository = MemberRepository.getInstance();

  @Override
  public String process(Map<String, String> paramMap, Map<String, Object> model) {
    List<Member> members = memberRepository.findAll();
    ModelView mv = new ModelView("members");
    model.put("members", members);

    return "members";
  }
}
