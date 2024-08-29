package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import UtilityDrivers.Helper;


public class dragAndDropp {
	public static void main(String[] args) {
			
			/*
			 * 	Actions 
			 *  TouchActions
			 *  Mouse Hover
			 *  Keyboard
			 *  Drag Drop
			 *  Mouse Hover with X,Y
			 * 	double click
			 * 	right click
			 */
			
		WebDriver driver = Helper.startBrowser("Chrome");		
		driver.get("https://jqueryui.com/droppable/");	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));	
		WebElement src = driver.findElement(By.id("draggable"));	
		WebElement dest = driver.findElement(By.id("droppable"));	
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();

		}
	}