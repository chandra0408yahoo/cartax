package methods;


import Utilities.FirstConfigFile;
import Utilities.ListFiles;
import Utilities.util;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class homepagemethods extends util {

    FirstConfigFile FC = new FirstConfigFile();
    ListFiles LF = new ListFiles();

    List<String> carRegValues;

    //repository for elements

    @FindBy(id = "vrm-input")
    public WebElement inputCarRegistration;


    @FindBy(css = "button.jsx-3653130054.inline.dual")
    public WebElement freeCarCheckButton;


    @FindBy(css = "#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(1) > dd")
    public WebElement carRegistration;

    @FindBy(css = "#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(2) > dd")
    public WebElement carMake;

    @FindBy(css = "#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(3) > dd")
    public WebElement carModel;

    @FindBy(css = "#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(4) > dd")
    public WebElement carColor;

    @FindBy(css = "#m > div > div:nth-child(3) > div.jsx-2530913122 > div > span > div.jsx-3529878979 > dl:nth-child(5) > dd")
    public WebElement carYear;

    @FindBy(xpath = "//span[contains(text(),'Vehicle Not Found')]")
    public WebElement error;


    public void ireadInputFileandExtractCarReg() {

        List<String> v = LF.readalllocalfiles();


        List<String> allRegValues = filterCarRegfromfile(v);
        try {


            for (String x : allRegValues) {
                System.out.println(x);
                enterCarRegNumber(x);

                compareSearchResults(x);

                getDriver().navigate().back();
            }


        } catch (Exception e) {
            e.printStackTrace();

        }


    }


    public void enterCarRegNumber(String c) {


        waitforelementtoappear(inputCarRegistration);
        inputCarRegistration.sendKeys(c);
        clickFreeCarCheck();

    }

    public void clickFreeCarCheck() {


        waitforelementtoappear(freeCarCheckButton);
        freeCarCheckButton.click();


    }

    public void compareSearchResults(String c) {


        carRegValues = desiredCarRegDetails(readfile(FC.Outputfilepath), c);

        System.out.println(carRegValues + ">>>>>>>>>>");

        Assert.assertEquals(waitforelementtoappear(carRegistration).getText(), carRegValues.get(0));
        Assert.assertEquals(waitforelementtoappear(carMake).getText(), carRegValues.get(1));
        Assert.assertEquals(waitforelementtoappear(carModel).getText(), carRegValues.get(2));
        Assert.assertEquals(waitforelementtoappear(carColor).getText(), carRegValues.get(3));
        Assert.assertEquals(waitforelementtoappear(carYear).getText(), carRegValues.get(4));


    }


//[DN09HRM, KT17DLX, SG18HTN]


}







