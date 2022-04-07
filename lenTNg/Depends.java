package lenTNg;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Depends{

	@Test
public void CreateLead() {
System.out.println("create lead");
throw new NoSuchElementException();
}
	
	@Test(dependsOnMethods="CreateLead")
public void EditLead() {
System.out.println("edit lead");
}

	@Test(dependsOnMethods="CreateLead",alwaysRun = true)//alwaysRun=though parent fails it will run
public void DeleteLead() {
System.out.println("delete lead");
}
}
//Create(pass)>edit>delete
 //PASSED: CreateLead
 //PASSED: DeleteLead
 //PASSED: EditLead

//Create(fail)>edit(depends on create) got skipped >delete(pass)
  //PASSED: DeleteLead
  //FAILED: CreateLead
  //SKIPPED: EditLead


//if dependsOnMethod on different class the syntax
//dependsOnMethods(packageName.className.methodName)
//std design - one testcase in one class
