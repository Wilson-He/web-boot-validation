# web-common-validation

## 
基于Spring Boot 2.0+的自动化配置参数校验框架

## 依赖添加
	<dependency>
	    <groupId>com.github.wilson.swagger</groupId>
	    <artifactId>web-common-validation</artifactId>
	    <version>LATEST</version>
	</dependency>

## 快速开始
Application.java
	import io.github.web.validation.vo.StringListVO;
	import io.swagger.annotations.Api;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.validation.annotation.Validated;
	import org.springframework.web.bind.annotation.*;

	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Pattern;

	/**
	 * Application
	 *
	 * @author Wilson
	 * @date 2018/11/17
	 */
	@RestController
	@RequestMapping("/")
	@Api
	@SpringBootApplication
	@Validated
	public class Application {
	    public static void main(String[] args) {
		SpringApplication.run(Application.class);
	    }

	    @GetMapping("/index")
	    public String index(@NotBlank @Pattern(regexp = "\\d+") @RequestParam String name){
		return name;
	    }
	    @GetMapping("/name")
	    public String name(@NotBlank @Pattern(regexp = "\\d+",message = "正则错误") @RequestParam String name){
		return name;
	    }

	    @PostMapping("/vo")
	    public String index(@Validated @RequestBody StringListVO vo){
		return "yes";
	    }
	}

application.yml
	web:
	  common:
	    validation:
	      msg-locale: zh_CN  #参数错误返回的信息语种
	    #  code-key: code     #参数错误返回码的key字符串命名,默认"code"
	    #  msg-key: error     #参数错误返回信息的key字符串命名，默认"msg"
	swagger: #swagger自动化配置，需加入swagger2-spring-boot-starter依赖
	  enabled: true
	  docket:
	    base-package: io.github.swagger.demo
