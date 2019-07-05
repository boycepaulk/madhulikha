package com.pack.boot;


import com.pack.service.AccountingCounter;
import com.pack.service.PostOffice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.pack.service")
@SpringBootApplication
public class PostOfficeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(PostOfficeApplication.class, args);


        PostOffice postOffice = applicationContext.getBean(PostOffice.class);
        postOffice.sendCourier("Boyce");
        postOffice.sendPost("Boyce");
        postOffice.sendMoney(50L);


        postOffice.sendCourier("Madhukikha");
        postOffice.sendPost("Madhukikha");
        postOffice.sendMoney(1000L);


        postOffice.sendCourier("Keshav");
        postOffice.sendPost("Keshav");
        postOffice.sendMoney(1000L);

        AccountingCounter accountingCounter = applicationContext.getBean(AccountingCounter.class);
        System.out.println(accountingCounter.getCount());





//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
    }


}
