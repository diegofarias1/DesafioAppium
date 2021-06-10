package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.flows.LoginFlows;
import com.templateJavaAppium.utils.ExcelUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class LoginTests extends TestBase {
    LoginFlows loginFlows;
    ExcelUtils excelUtils;

    @DataProvider(name = "Users")
    public Object[][] loginDDT() throws Exception {

        excelUtils = new ExcelUtils(System.getProperty("user.dir") + "\\src\\test\\java\\com\\templateJavaAppium\\resources\\app\\arquivodelogins.xlsx", "usuarios");
        ArrayList<Object[]> dataList = new ArrayList<Object[]>();

        int i = 1;
        int totalRows = 4;
        while (i < totalRows) {
            Object[] dataLine = new Object[2];

            dataLine[0] = excelUtils.getCell(i, 0);
            dataLine[1] = excelUtils.getCell(i, 1);

            dataList.add(dataLine);
            i++;
        }
        Object[][] data = new Object[dataList.size()][];
        for (i = 0; i < dataList.size(); i++)
            data[i] = dataList.get(i);

        return data;
    }


    @Test(dataProvider = "Users")
    public void ShouldInsertLoginSucessfullDDT(String username, String password) {
        loginFlows = new LoginFlows();
        loginFlows.goToLoginPage();
        String loginMessage = loginFlows.login(username, password);
        Assert.assertEquals("You gave me the wrong username and password", loginMessage);
    }

    @Test
    public void ShouldInsertLoginSucessfull() {
        String username = "admin";
        String password = "password";
        loginFlows = new LoginFlows();
        loginFlows.goToLoginPage();
        String loginMessage = loginFlows.login(username, password);
        Assert.assertEquals("You are logged on as admin", loginMessage);
    }

    @Test
    public void ShouldInsertLoginInvalid() {
        String username = "admin";
        String password = "123456";

        loginFlows = new LoginFlows();
        loginFlows.goToLoginPage();
        String loginMessage = loginFlows.login(username, password);
        Assert.assertEquals("You gave me the wrong username and password", loginMessage);
    }
}