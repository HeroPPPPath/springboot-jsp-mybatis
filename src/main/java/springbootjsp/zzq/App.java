package springbootjsp.zzq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration
//// 这里扫描controller里的文件，目录如果不一样记得改
//@ComponentScan(value = { "springbootjsp.zzq.controller"})

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
