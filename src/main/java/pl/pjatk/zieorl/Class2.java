package pl.pjatk.zieorl;

import org.springframework.stereotype.Component;

@Component
public class Class2 {
    public Class2(Class1 class1){
        System.out.println("Class2");
        class1.printHelloMessage();
    }

    public void printHelloMessage(){
        System.out.println("Class2 printHelloMessage()");
    }
}
