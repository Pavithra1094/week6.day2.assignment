package week6.day2.assignment.pom.pages;

import org.openqa.selenium.By;



public class MyLeadsPage extends week6.day2.assignment.pom.hooks.HooksTest {

	public CreateLeadPage clickCreateLeadsMenu() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

	}

}