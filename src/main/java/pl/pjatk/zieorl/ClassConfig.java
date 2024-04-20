package pl.pjatk.zieorl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClassConfig {

    @ConditionalOnProperty(name = "my.custom.property", havingValue = "true", matchIfMissing = false)
    @Bean
    public ClassPOJO classPOJO(@Value("${my.custom.property:'Cos'}") String propertiesString){
        System.out.println(propertiesString);
        return new ClassPOJO(1500,"white","car");
    }

    @Bean
    public List<String> defaultData(){
        return List.of("String1","String2","String3","String4","String5");
    }


}
