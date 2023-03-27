package by.itacademy;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import pages.MainPage;

public class StepDefinitions {
  private MainPage mainPage = new MainPage();
	
  @Дано("пользователь находится на главной страницы онлайнера")
  public void openMainPage() {
     mainPage.openPage();
  }
  
  @Когда("пользователь наводит на пункт {string}")
  public void hoverOneItem(String str) {
	  mainPage.hoverItem(str);
  }

  @Тогда("появляется подменю с категориями - {string}")
  public void isVisibleFilter(String str) {
	  mainPage.isVisibleСategory(str);
  }
}
