package io.web.validation;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * WebCommonAutoConfiguration-配置fastjson、校验信息资源
 *
 * @author Wilson
 */
@Configuration
@ComponentScan
@Slf4j
@Setter
public class WebValidationAutoConfiguration {

    @PostConstruct
    public void init() {
        log.info("finish web common validation init}");
    }

}
