package models;

import java.util.*;

import play.data.Form;
import play.data.validation.Constraints.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Peli extends Model {
    
  @Id
  public Long id;
  
  @Required
  public String titulo;
  
  public Peli(String titulo) {
	  this.titulo = titulo;
  }
  
  public static Finder<Long,Peli> find = new Finder(Long.class, Peli.class);
  
  public static List<Peli> all() {
    return find.all();
  }
  
  public static void create(Peli peli) {
	peli.save();
  }
  
  public static void delete(Long id) {
	find.ref(id).delete();
  }
    
  
}