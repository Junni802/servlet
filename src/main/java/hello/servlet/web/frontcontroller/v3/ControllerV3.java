package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

/**
 * hello.servlet.web.frontcontroller.v3 ControllerV3
 *
 * @author : junhyuk Park
 * @date : 2023.04.04
 * @tags :
 */
public interface ControllerV3 {

  ModelView process(Map<String, String> paramMap);

}
