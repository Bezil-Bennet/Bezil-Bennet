package lenTNg;
import java.util.NoSuchElementException;

import org.testng.annotations.Test;
public class LrnGroups {
	
    @Test(groups= {"functional","regression"})
	public void CreateLead() {
	System.out.println("create lead");
	throw new NoSuchElementException();
	}
		
	@Test(groups="smoke")
	public void EditLead() {
	System.out.println("edit lead");
	}

	@Test(groups="functional",dependsOnGroups="smoke")
	public void DeleteLead() {
	System.out.println("delete lead");
	}
}
