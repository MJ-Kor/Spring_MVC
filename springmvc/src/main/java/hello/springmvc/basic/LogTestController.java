package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());
//    @Slf4j를 사용하면 위의 코드를 생략하고 로그를 뽑을 수 있다.

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);
        log.trace(" trace log ={}", name);
        log.info(" debug log ={}", name);
        log.info(" info log ={}", name);
        log.info(" warn name ={}", name);
        log.error(" error log ={}", name);

        return "Ok";
    }
}
