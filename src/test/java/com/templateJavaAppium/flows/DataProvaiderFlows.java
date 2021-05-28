package com.templateJavaAppium.flows;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.utils.ExcelUtils;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;

public class DataProvaiderFlows {
    public class LoginTests extends TestBase {
        LoginFlows loginFlows;
        ExcelUtils excelUtils;

        @DataProvider(name = "Users")
        public Object[][] loginValidoXlsx() throws Exception {

            excelUtils = new ExcelUtils(System.getProperty("user.dir") + "\\src\\test\\java\\com\\templateJavaAppium\\resources\\app\\arquivodelogins.xlsx", "Users");
            ArrayList<Object[]> dataList = new ArrayList<Object[]>();

            int i = 1;// excluding header row
            int totalRows = 3;// the row number of data in the sheet
            while (i < totalRows) {
                System.out.println("Users : line : " + i);

                Object[] dataLine = new Object[2];

                dataLine[0] = excelUtils.getCell(i, 0);// nome
                dataLine[1] = excelUtils.getCell(i, 1);// senha
                dataLine[2] = excelUtils.getCell(i, 2);// senha

                dataList.add(dataLine);

                i++;
            }

            Object[][] data = new Object[dataList.size()][];
            for (i = 0; i < dataList.size(); i++)
                data[i] = dataList.get(i);

            return data;
        }
    }
}
