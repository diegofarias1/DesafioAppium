package com.templateJavaAppium.utils;

import java.util.ArrayList;
import com.templateJavaAppium.utils.ExcelUtils;
import org.testng.annotations.DataProvider;


public class DataDriven {
    @DataProvider(name = "Users")
    public Object[][] loginValidoXlsx() throws Exception {
        ExcelUtils excelUtils;

        excelUtils = new com.templateJavaAppium.utils.ExcelUtils(System.getProperty("user.dir") + "\\src\\test\\java\\com\\templateJavaAppium\\resources\\app\\arquivodelogins.xlsx", "usuarios");
        ArrayList<Object[]> dataList = new ArrayList<Object[]>();

        int i = 1;
        int totalRows = 4;
        while (i < totalRows) {
            Object[] dataLine = new Object[2];

            dataLine[0] = excelUtils.getCell(i, 0);// nome
            dataLine[1] = excelUtils.getCell(i, 1);// senha

            dataList.add(dataLine);
            i++;
        }
        Object[][] data = new Object[dataList.size()][];
        for (i = 0; i < dataList.size(); i++)
            data[i] = dataList.get(i);

        return data;
    }
}
