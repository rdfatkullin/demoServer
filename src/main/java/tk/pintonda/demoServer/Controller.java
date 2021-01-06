package tk.pintonda.demoServer;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {
    @GetMapping("/plsWork")
    String getMethod(){
        return "working fine";
    }

    @GetMapping("/secondMethod")
    String getMethodTwo(){
        return "i am still working";
    }
}
