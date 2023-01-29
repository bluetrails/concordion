package testcases;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.runtotals.RunTotalsExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@Extensions(RunTotalsExtension.class)
public class tc1Fixture {


    public String multiply(String number1, String number2){
        return String.valueOf(Integer.valueOf(number1) * Integer.valueOf(number2));
    }


}
