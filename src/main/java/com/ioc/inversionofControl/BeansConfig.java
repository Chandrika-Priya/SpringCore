package com.ioc.inversionofControl;

import com.ioc.inversionofControl.sports.Baseball;
import com.ioc.inversionofControl.sports.HappyFortune;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ioc.inversionofControl")
public class BeansConfig {
    @Bean
    public HappyFortune createHappyFortune(){
        return new HappyFortune();
    }

    @Bean("baseball")
    public Baseball createBaseball(){
        return new Baseball(createHappyFortune());
    }

}
