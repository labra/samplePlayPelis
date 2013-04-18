package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;
import views.html.*;
import models.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result verPelis() {
        return ok(vistaPelis.render("Entrecine",Peli.all(),peliForm));
    }

    public static Result borraPeli(Long id) {
    	Peli.delete(id);
        return redirect(routes.Application.verPelis());
    }

    public static Result nuevaPeli() {
    	Form<Peli> filledForm = peliForm.bindFromRequest();
    	Peli peli = filledForm.get(); 
    	Peli.create(peli);
   	    return redirect(routes.Application.verPelis());  
    }

    public static Form<Peli>  peliForm  = Form.form(Peli.class);  

}
