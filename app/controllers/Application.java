package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Hi.....Swamy...."));
    }
    
    public static Result sayHello(String name) {
        return ok(index.render("Hi"+name));
    }
    
    public static Result getTextFromInput(String name)
    {
    	return ok(index.render("You Entered  "+name));
    }

}
