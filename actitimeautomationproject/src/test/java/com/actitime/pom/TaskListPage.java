package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnewbtn;

	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcustomerbtn;

	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement entercustomernamtb;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptiontb;

	@FindBy(xpath = "//div[@class='comboboxButton']/div[@class='dropdownButton']")
	private WebElement dropdownbt;

	@FindBy(xpath = "//div[@class='searchItemList']/div[text()='Big Bang Company']")
	private WebElement bigbankmoneybt;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createcustomerbtn;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustomerbtn() {
		return newcustomerbtn;
	}
	public WebElement getEntercustomername() {
		return entercustomernamtb;
	
	}

	public WebElement getEntercustomerdescriptiontb() {
		return entercustomerdescriptiontb;
	}

	public WebElement getDropdownbt() {
		return dropdownbt;
	}

	public WebElement getBigbankmoneybt() {
		return bigbankmoneybt;
	}

	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}
	

	
	
}
