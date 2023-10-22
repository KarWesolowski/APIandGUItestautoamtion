package ui;

import org.junit.jupiter.api.Test;
import pages.GooglePage;

public class SearchInputTest {

    GooglePage googlePage = new GooglePage();
    String googleUrl = "https://google.pl/";

    @Test
    public void searchInputTest() {
        googlePage.openWebsite(googleUrl);
        googlePage.clickDecline();
        googlePage.fillSearchField();
    }
}
