package pl.pjatk.zieorl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class SandboxRestController {
    @GetMapping("/hello")
    public ResponseEntity<String> paramValue(@RequestParam(value = "reqParam", required = false) String someValue){
        if(someValue == null){
            someValue = "Hello World";
        }
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> someValue(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }


    @GetMapping("/model")
    public ResponseEntity<Car> returnCar(){
        return ResponseEntity.ok(new Car("BMW","M5",2022));
    }

    @PostMapping("/model")
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }
}
