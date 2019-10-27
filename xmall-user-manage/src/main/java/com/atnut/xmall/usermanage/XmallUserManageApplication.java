package com.atnut.xmall.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atnut.xmall.usermanage.user.mapper")
public class XmallUserManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmallUserManageApplication.class, args);
	}

}
