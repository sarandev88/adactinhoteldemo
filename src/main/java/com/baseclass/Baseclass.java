package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	public static WebDriver driver; // null driver
	//1 browser launch
		public static WebDriver browserLaunch(String browser) {
			try {
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
				}
						driver.manage().window().maximize();
			}catch (Exception e) {
				e.printStackTrace();
			}
				
				return driver;
			} 
				
				
			
				
				
			

		

			
		//click
		//public static void clickOnElement1(WebElement element) {
			//element.click();
		

		//sendKeys
		public static void sendValues(WebElement element, String value) {
			try {
				element.sendKeys(value);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		
		// 2  close
		public static void closeCurrentPage() {
			try {
				driver.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
			//  3 quit
		public static void quit() {
			try {
				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}

		//get
		public static void getUrl(String url) {
			try {
				driver.get(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		//  4 navigate
		public static void navigateto(String str) {
			try {
				driver.navigate().to(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 5 click
		public static void clickOnElement(WebElement element) {
			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//  6 sendKeys
		private void sendValue(WebElement element, String value) {
			try {
				element.sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	//7 dropdown
		public static void dropDown(WebElement element, String valuenum) {
			try {
				Select values = new Select(element);
				values.selectByValue(valuenum);
			} catch (Exception e) {
				e.printStackTrace();
			}
					}
		
		public static void DropDown(WebElement element,String valuenum) {
			try {
				Select values = new Select(element);
				values.selectByValue(valuenum);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	 //8 Actions
		public static void mouseOver(WebElement element, WebDriver driver) {
			Actions ac = new Actions(driver);
			try {
				ac.moveToElement(element).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//Clickmouseover
		public static void Clickmouseover(WebElement element, WebDriver driver) {
			Actions ac = new Actions(driver);
			try {
				ac.click(element).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		// 9 getText
		
		public static void getText(WebElement element) {
			String text = element.getText();
			try {
				System.out.println("text");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		// 10 getTitle
		
		private void getTitle(String title) {
			String title2 = driver.getTitle();
			try {
				System.out.println("title2");
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		
		// 11getCurrentUrl}
		public static void getCurrentUrl(String url) {
			try {
				String currentUrl = driver.getCurrentUrl();
				System.out.println("currenturl");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 12 getOptions
		public static void getOptions(WebElement element ) {
			Select s = new Select(element);
		List<WebElement> options = s.getOptions(); //return type
		for (WebElement webElement : options) {
			try {
				System.out.println("options");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}
		// 13 getAttribute
		public static void getAttribute(WebElement element, String value, String name) {
	    String attributevalue = element.getAttribute(value);
	    try {
			System.out.println("ATTRIBUTE VALUE:: "+attributevalue);
			String attributename = element.getAttribute(name);
			System.out.println("ATTRIBUTE NAME::"+ attributename);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
			
		//14 isDisplayed
		
		public static void isDisplayed(WebElement element) {
			try {
				boolean displayed = element.isDisplayed();
				System.out.println(displayed);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		
			//15 isEnabled
		
		public static void isEnabled(WebElement element) {
			 try {
				boolean enabled = element.isEnabled();
				 System.out.println(enabled);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
			
		//16 isSelected
		
		public static void isSelected(WebElement element) {
			try {
				boolean selected = element.isSelected();
				System.out.println(selected);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//17  Navigate to
		public static void NavigateTo(String url) {
			try {
				driver.navigate().to(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//18  navigateForward
		public static void navigateForward() {
			try {
				driver.navigate().forward();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		
		//19NavigateBack
		public static void navigateBack() {
			try {
				driver.navigate().back();
			} catch (Exception e) {
				e.printStackTrace();
			}
				}
			
		//20 NavigateRefresh
		public static void name() {
			try {
				driver.navigate().refresh();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//21 Alert
		public static void alert() {
			try {
				driver.switchTo().alert();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		
		//22 Frame
		
		public static void Frame(String value) {
			try {
				driver.switchTo().frame(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void FrameIndex(int index) {
			try {
				driver.switchTo().frame(index);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void Frameweb(WebElement element) {
			try {
				driver.switchTo().frame(element);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 23 robot	
		
		public static void robot(WebElement element) throws AWTException {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		

		//24 windowshandling
		public static void windowsHandling() {
		
			try {
				driver.getWindowHandles();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	// 25 checkbox
		public static void checkbox(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}


	//26 wait
		public static void waitimpli(long time) {
			try {
				driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void waittimemethod(WebElement element,int sec) {
			try {
				WebDriverWait wait = new WebDriverWait(driver,sec);
				wait.until(ExpectedConditions.visibilityOf(element));
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	//27screenshot
		
		public static void screenShot(String name) throws InterruptedException, IOException {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("D:\\saranya\\Automationpractice\\screenshot\\" +name +".png");
				FileUtils.copyFile(src, dest);
			} catch (WebDriverException e) {
				e.printStackTrace();
			}
		}
			
			
		

	//28 scroll
		
		public static void scroll(WebElement element) {
	try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
	} catch (Exception e) {
		e.printStackTrace();
	}
				
		}

	//29 getallSelectedoptions
		
		public static void getAllSelectedOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				try {
					System.out.println(webElement.getText());
				} catch (Exception e) {
					e.printStackTrace();
				}
		
			}
			
		}

	//30  getfirstselectedoption
		
		public static void getfirstSelectedOption(WebElement element) {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			try {
				System.out.println(firstSelectedOption.getText());
			} catch (Exception e) {
				e.printStackTrace();
			}		
			}

	//31 isMultiple
		public static void isMultiple(WebElement element) {
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			try {
				System.out.println(multiple);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//32 selectby
		public static void selectBy(WebElement element, String value, String input) {
			Select s = new Select(element);
			if (value.equals("index")) {
				s.selectByIndex(Integer.parseInt(input));
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
			try {
				element.clear();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// TODO Auto-generated method stub

		}
		

	}
		
			
			
		

