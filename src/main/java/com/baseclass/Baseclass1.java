package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass1 {
	public static WebDriver driver; // null driver
	//1 browser launch
		public static WebDriver browserLaunch(String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webDriver.chrome.driver", "D:\\saranya\\Selenium_Project\\Driver\\chromedriver.exe");
				driver =   new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webDriver.gecko.driver", "D:\\saranya\\Selenium_Project\\Driver\\chromedriver.exe");
				 driver = new FirefoxDriver();
			}
			else {
				System.out.println("INVALID BROWSER");
				
				return driver;
			}
			driver.manage().window().maximize();
			return driver;
				
			}
				
				
			

		

			
		//click
		//public static void clickOnElement1(WebElement element) {
			//element.click();
		

		//sendKeys
		public static void sendValues(WebElement element, String value) {
			element.sendKeys(value);
		}
		
		
		// 2  close
		public static void closeCurrentPage() {
			driver.close();
		}
			//  3 quit
		public static void quit() {
			driver.quit();
			}
		//get
		public static void getUrl(String url) {
			driver.get(url);
			}
		//  4 navigate
		public static void navigateto(String str) {
			driver.navigate().to(str);
		}
		// 5 click
		public static void clickOnElement(WebElement element) {
			element.click();
		}
		//  6 sendKeys
		private void sendValue(WebElement element, String value) {
			element.sendKeys(value);
		}
	//7 dropdown
		public static void dropDown(WebElement element, String valuenum) {
			Select values = new Select(element);
			values.selectByValue(valuenum);
					}
		
		public static void DropDown(WebElement element,String valuenum) {
			Select values = new Select(element);
			values.selectByValue(valuenum);
			
			
			
			// TODO Auto-generated method stub

		}
		
	 //8 Actions
		public static void mouseOver(WebElement element, WebDriver driver) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		}
		//Clickmouseover
		public static void Clickmouseover(WebElement element, WebDriver driver) {
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();

		}
		
		// 9 getText
		
		public static void getText(WebElement element) {
			String text = element.getText();
			System.out.println("text");
		}
			
		// 10 getTitle
		
		private void getTitle(String title) {
			String title2 = driver.getTitle();
			System.out.println("title2");
			}
		
		// 11getCurrentUrl}
		public static void getCurrentUrl(String url) {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("currenturl");
		}
		
		// 12 getOptions
		public static void getOptions(WebElement element ) {
			Select s = new Select(element);
		List<WebElement> options = s.getOptions(); //return type
		for (WebElement webElement : options) {
			System.out.println("options");
		}
		}
		// 13 getAttribute
		public static void getAttribute(WebElement element, String value, String name) {
	    String attributevalue = element.getAttribute(value);
	    System.out.println("ATTRIBUTE VALUE:: "+attributevalue);
	    String attributename = element.getAttribute(name);
	    System.out.println("ATTRIBUTE NAME::"+ attributename);
		}
			
		//14 isDisplayed
		
		public static void isDisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
			}
		
			//15 isEnabled
		
		public static void isEnabled(WebElement element) {
			 boolean enabled = element.isEnabled();
			 System.out.println(enabled);
		}	
			
		//16 isSelected
		
		public static void isSelected(WebElement element) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		}
		
		//17  Navigate to
		public static void NavigateTo(String url) {
			driver.navigate().to(url);
		}
		
		//18  navigateForward
		public static void navigateForward() {
			driver.navigate().forward();
			}
		
		//19NavigateBack
		public static void navigateBack() {
			driver.navigate().back();
				}
			
		//20 NavigateRefresh
		public static void name() {
			driver.navigate().refresh();
		}
		
		//21 Alert
		public static void alert() {
			driver.switchTo().alert();
			}
		
		//22 Frame
		
		public static void Frame(String value) {
			driver.switchTo().frame(value);
		}
		public static void FrameIndex(int index) {
			driver.switchTo().frame(index);
		}
		public static void Frameweb(WebElement element) {
			driver.switchTo().frame(element);
		}

		// 23 robot	
		
		

		//24 windowshandling
		public static void windowsHandling() {
		 driver.getWindowHandles();
		}

	// 25 checkbox
		public static void checkbox(WebElement element) {
		element.click();
		}


	//26 wait
		public static void waitimpli(long time) {
			driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
			// TODO Auto-generated method stub
		}
		
		public static void waittimemethod(WebElement element,int sec) {
			WebDriverWait wait = new WebDriverWait(driver,sec);
			wait.until(ExpectedConditions.visibilityOf(element));
	}

	//27screenshot
		
		public static void screenShot(String name) throws InterruptedException, IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\saranya\\Automationpractice\\screenshot\\" +name +".png");
			FileUtils.copyFile(src, dest);
		}
			
			
		

	//28 scroll
		
		public static void scroll(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
				
		}

	//29 getallSelectedoptions
		
		public static void getAllSelectedOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				System.out.println(webElement.getText());
		
			}
			
		}

	//30  getfirstselectedoption
		
		public static void getfirstSelectedOption(WebElement element) {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());		
			}

	//31 isMultiple
		public static void isMultiple(WebElement element) {
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		}
		//32 selectby
		public static void selectBy(WebElement element, String value, String i) {
			Select s = new Select(element);
			if (value.equals("index")) {
				s.selectByIndex(Integer.parseInt(i));
				}
			else if (value.equals("value")) {
				s.selectByValue(value);
			}
			else if (value.equals("text")) {
				s.selectByVisibleText(value);
			}	
			}
				
		//clear()	
		public void erase(WebElement element) {
			element.clear();
			// TODO Auto-generated method stub

		}
		

	}
		
			
			
		





