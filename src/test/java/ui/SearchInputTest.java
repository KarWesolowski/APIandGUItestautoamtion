package ui;

import org.junit.jupiter.api.Test;
import pages.GooglePage;

public class SearchInputTest {

    GooglePage googlePage = new GooglePage();
    private static String GOOGLE_URL = "https://google.pl/";

    @Test
    public void searchInputTest() {
        googlePage.openWebsite(GOOGLE_URL);
        googlePage.clickDecline();
        googlePage.fillSearchField();
    }
}
