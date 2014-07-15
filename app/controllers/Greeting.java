package controllers;


import java.io.IOException;

import akka.dispatch.Mapper;

import com.fasterxml.jackson.databind.JsonNode;





import play.libs.Json;
import play.mvc.*;



import views.html.*;

public class Greeting extends Controller {

   
    
    public static Result sayHello(String name) {
        return ok(index.render("Hi ..."+name));
    }
    

    public static Result sayHelloPost() throws IOException {
    
    	JsonNode json = request().body().asJson();
    
    	
    	  if(json == null) 
    	  {
    	    return badRequest("Expecting Json data");
    	  } 
    	  else 
    	  {  
    		 
    	    String name = json.findPath("name").textValue();
    	    
    	    
    	    	if(name == null) 
    	    		{
    	    			return badRequest("Missing parameter [name]");
    	    		} 
    	    	else 
    	    		{
    	    			return ok("Hello " + name);
    	    		}
     
    	  } 
  
    		

    }
    
    public static Result javaToJson()
    {
    	Employee employee=new Employee();
    	employee.setId("101010");
    	employee.setName("Lakshman");
    	return ok( Json.toJson(employee));
    }
}
