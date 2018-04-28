package Google.sheet;

import base.CommonAPI;
import google.api.GooglesheetReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class page extends CommonAPI{

    public void readGooglesheet() throws IOException , GeneralSecurityException{
        List<List<Object>>  expectedResul = GooglesheetReader.getGoogleSheetValues();

    }
    public void searchItem(){
        driver.findElement ( By.id("twotabsearchtextbox")).sendKeys ( "selenium books" , Keys.ENTER);
    }
}
