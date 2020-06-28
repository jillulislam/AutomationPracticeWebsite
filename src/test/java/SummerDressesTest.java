import commons.Configaration;
import org.junit.Before;
import org.junit.Test;
import pageObject.SummerDressPage;

public class SummerDressesTest extends Configaration {

    SummerDressPage summerDressPage = new SummerDressPage(driver);

    @Before
    public void openUrl(){
        summerDressPage.openUrl("http://automationpractice.com/index.php?id_category=11&controller=category");
    }


    @Test
    public void test1(){

    }
}
