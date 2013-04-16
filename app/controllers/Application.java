package controllers;

import models.Peli;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Pelis",Peli.all(),peliForm));
    }
    
    public static Result nuevaPeli() {
    	Form<Peli> filledForm = peliForm.bindFromRequest();
    	Peli peli = filledForm.get(); 
    	Peli.create(peli);
   	    return redirect(routes.Application.index());  
    }

    public static Form<Peli>  peliForm  = Form.form(Peli.class);  
}
