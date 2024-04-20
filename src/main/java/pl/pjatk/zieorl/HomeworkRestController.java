package pl.pjatk.zieorl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkRestController {
    @GetMapping("/hello")
    public ResponseEntity<ClassHomework> paramValue(@RequestParam(value = "reqParam", required = false) String someValue){
        if(someValue == null){
            someValue = "Hello World";
        }
        return ResponseEntity.ok(new ClassHomework(someValue));
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<ClassHomework> someValue(@PathVariable String someValue){
        return ResponseEntity.ok(new ClassHomework(someValue));
    }

    @PostMapping("/hello/{someValue}")
    public ResponseEntity<ClassHomework> postHandler(@RequestBody ClassHomework classHomework){
        return ResponseEntity.ok(classHomework);
    }

    @PutMapping("/hello/{id}")
    public ResponseEntity<ClassHomework> putHandler(@PathVariable("id") String someValue, @RequestBody ClassHomework classHomework){
        return ResponseEntity.ok(classHomework);
    }

    @DeleteMapping("/hello/{id}")
    public ResponseEntity<Void> deleteHandler(@PathVariable("id") String someValue){
        return ResponseEntity.ok().build();
    }

}
