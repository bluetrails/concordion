import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@RunWith(ConcordionRunner.class)
public class CheckCSVFile {




    public String getCellValueBy3Col(
            String filename,
            String columnsearchname1,
            String columnsearchvalue1,
            String columnsearchname2,
            String columnsearchvalue2,
            String columnsearchname3,
            String columnsearchvalue3,
            String columncheckresult) throws FileNotFoundException {


        Scanner sc = new Scanner(new File(getFolderAndFile(filename)));

        String title = sc.next();
        String[] titles = title.split(",");
        List<String> titlesList = Arrays.asList(titles);

        int column1 = titlesList.indexOf(columnsearchname1);
        int column2 = titlesList.indexOf(columnsearchname2);
        int column3 = titlesList.indexOf(columnsearchname3);
        int columnsearched = titlesList.indexOf(columncheckresult);

        while (sc.hasNext())  //returns a boolean value
        {
            String currentrow = sc.next();
            String[] rowValues = currentrow.split(",");
            List<String> rowValuesList = Arrays.asList(rowValues);

            if (rowValuesList.get(column1).equalsIgnoreCase(columnsearchvalue1)
                && rowValuesList.get(column2).equalsIgnoreCase(columnsearchvalue2)
                    && rowValuesList.get(column3).equalsIgnoreCase(columnsearchvalue3)){
                return rowValuesList.get(columnsearched);
             }
        }
        sc.close();  //closes the scanner
        return null;

    }

    public String getCellValueBy2Col(
            String filename,
            String columnsearchname1,
            String columnsearchvalue1,
            String columnsearchname2,
            String columnsearchvalue2,
            String columncheckresult) throws FileNotFoundException {


        Scanner sc = new Scanner(new File(getFolderAndFile(filename)));

        String title = sc.next();
        String[] titles = title.split(",");
        List<String> titlesList = Arrays.asList(titles);

        int column1 = titlesList.indexOf(columnsearchname1);
        int column2 = titlesList.indexOf(columnsearchname2);
        int columnsearched = titlesList.indexOf(columncheckresult);

        while (sc.hasNext())  //returns a boolean value
        {
            String currentrow = sc.next();
            String[] rowValues = currentrow.split(",");
            List<String> rowValuesList = Arrays.asList(rowValues);

            if (rowValuesList.get(column1).equalsIgnoreCase(columnsearchvalue1)
                    && rowValuesList.get(column2).equalsIgnoreCase(columnsearchvalue2)){
                return rowValuesList.get(columnsearched);
            }
        }
        sc.close();  //closes the scanner
        return null;

    }

    public String getCellValueBy1Col(
            String filename,
            String columnsearchname1,
            String columnsearchvalue1,
            String columncheckresult) throws FileNotFoundException {


        Scanner sc = new Scanner(new File(getFolderAndFile(filename)));

        String title = sc.next();
        String[] titles = title.split(",");
        List<String> titlesList = Arrays.asList(titles);

        int column1 = titlesList.indexOf(columnsearchname1);
        int columnsearched = titlesList.indexOf(columncheckresult);

        while (sc.hasNext())  //returns a boolean value
        {
            String currentrow = sc.next();
            String[] rowValues = currentrow.split(",");
            List<String> rowValuesList = Arrays.asList(rowValues);

            if (rowValuesList.get(column1).equalsIgnoreCase(columnsearchvalue1)){
                return rowValuesList.get(columnsearched);
            }
        }
        sc.close();  //closes the scanner
        return null;

    }




    private String getCurrentFolder(){
        return "/Users/cedricvanpelt/IdeaProjects/Concordion";
    }

    private String getFolderAndFile(String inputfile){
        return getCurrentFolder()+
                File.separator
                + "src"
                + File.separator
                + "test"
                + File.separator
                + "resources"
                + File.separator
                +inputfile;
    }
}
