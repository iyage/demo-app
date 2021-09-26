import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/page1")
    public  String showPage1(){
        return "pag1";
    }
}
