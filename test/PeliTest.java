import models.Peli;

import org.junit.*;

import play.test.FakeApplication;


import static play.test.Helpers.*;
import static org.junit.Assert.*;

/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class PeliTest {
	 
	private FakeApplication application; 

	  @Before 
	  public void startApp() { 
	    application = fakeApplication(); 
	    start(application); 
	  } 

	  @After 
	  public void stopApp() { 
	    stop(application); 
	  } 
    
	  @Test
        public void createAndRetrievePeli() {
            new Peli("Rambo").save();
            Peli p = Peli.find.where().eq("titulo", "Rambo").findUnique();
            assertNotNull(p);
            assertEquals("Rambo", p.titulo);
        } 

	  @Test
      public void createAndRetrievePelis() {
          new Peli("Rambo").save();
          new Peli("Supermán").save();
          Peli p = Peli.find.where().eq("titulo", "Rambo").findUnique();
          assertNotNull(p);
          assertEquals("Rambo", p.titulo);
      } 

}