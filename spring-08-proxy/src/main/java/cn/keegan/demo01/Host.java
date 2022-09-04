package cn.keegan.demo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//房东
@Configuration
public class Host implements Rent{
    @Bean
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
