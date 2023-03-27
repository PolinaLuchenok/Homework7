package pages;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.chrome.ChromeDriverService;
import static com.codeborne.selenide.Condition.*;

public class MainPage {
	private String itemCarMarket = "//span[@class='b-main-navigation__text' and contains (text(), 'Автобарахолка')]";
	private String itemHousesAndApartments = "//span[@class='b-main-navigation__text' and contains (text(), 'Дома и квартиры')]";
	private String submenuCategory = "//ul[@class='b-main-navigation__dropdown-advert-list']";
	
	public MainPage() {
		super();
	}
	
	public void openPage() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		open("https://onliner.by");
	}

	public void hoverItem(String item) {
		if(item == "Автобарахолка") {
			$x(itemCarMarket).hover();
		} 
		if (item == "Дома и квартиры") {
			$x(itemHousesAndApartments).hover();
		}
	}
	
	public void isVisibleСategory(String categories) {
		if(categories == "деление по ценам, по городам и марки") {
			$$x(submenuCategory).get(0).shouldBe(visible);
			$$x(submenuCategory).get(1).shouldBe(visible);
			$$x(submenuCategory).get(2).shouldBe(visible);
			$$x(submenuCategory).get(3).shouldBe(visible);
		}
		
		if(categories == "города, количестов комнат, ценовой диапазон") {
			$$x(submenuCategory).get(6).shouldBe(visible);
			$$x(submenuCategory).get(7).shouldBe(visible);
			$$x(submenuCategory).get(8).shouldBe(visible);
		} 
	}
}
