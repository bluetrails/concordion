package compareHtmlandMarkdown;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class CheckTableHtml  {
    public String getTradeAmount(String externalRef){
        if(externalRef.equalsIgnoreCase("CED1")){
            return String.valueOf(1978);
        } else if (externalRef.equalsIgnoreCase("KIM1")){
            return String.valueOf(1979);
        } else return "UNKNOWN";
    }

}
