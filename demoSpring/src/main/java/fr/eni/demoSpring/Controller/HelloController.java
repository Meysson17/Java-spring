package fr.eni.demoSpring.Controller;

import fr.eni.demoSpring.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
//@Autowired
//@Qualifier("helloServiceFrancaisImpl")
    //private HelloService helloService;

    //injection par constructeur
  /*  @Autowired
    public HelloController(HelloService helloService){
    this.helloService = helloService;
    }*//*
    public void sayHello(){
        System.out.println(helloService.hello());
    }*/

    //injection par setter
    /*@Autowired
    public void setHelloService(HelloService helloService){
        this.helloService=helloService;
    }*/
    /*
     * Affichage de la page d'accueil
     */
    @RequestMapping({"/","/hello"})
    public String hello() {
        System.out.println("passe par la");
        return "hello";
    }

    /*
    route vers bonjours
     */
    @RequestMapping(path = "/bonjour", method = RequestMethod.POST)
    public String bonjour() {
        System.out.println("passe par la");
        return "bonjour";
    }
    @RequestMapping(path = "/bonjour", method = RequestMethod.GET)
    public String bonjourGet() {
        System.out.println("passe par la");
        return "bonjour";
    }
}
