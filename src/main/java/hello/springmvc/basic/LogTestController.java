package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * rest api 를 만들 때 이용
 */
@RestController
@Slf4j  // logger 선언 안해도 됨. -> private final Logger log = LoggerFactory.getLogger(getClass());
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {

        String name = "Spring";
        System.out.println("name = " + name);

        //  + 이거를 사용하면 연산이 일어나서 사용하면 안됨.
//        log.trace(" trace my log=" + name);
        // 이렇게 사용해야함.
        log.trace(" trace my log={}", name);
        // 로그 레벨
        log.trace(" trace log ={}", name);
        log.debug(" debug log ={}", name);
        log.info(" info log ={}", name);
        log.warn(" warn log ={}", name);
        log.error(" error log ={}", name);

        return "ok";
    }

}
