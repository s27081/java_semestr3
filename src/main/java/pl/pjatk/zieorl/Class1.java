package pl.pjatk.zieorl;

import org.springframework.stereotype.Component;

@Component
public class Class1 {
    public Class1(){
        System.out.println("Class1");
    }

    public void printHelloMessage(){
        System.out.println("Class1 printHelloMessage()");
    }
}
