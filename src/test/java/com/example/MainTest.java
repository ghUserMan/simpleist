package com.example;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.Tag;
import org.junit.Assert;
import org.junit.Test;

@Feature("Junit 4 support")
public class MainTest {

    @Test
    @Description("desc")
    @Tag("tag")
    public void sum() {
        Assert.assertEquals(2, new Main().sum(1, 1));
        Allure.addAttachment("RQ", "111111111111111111111111");
        Allure.addAttachment("RS", "222222222222222222222222");
    }

    @Test
    @Description("desc3")
    @Tag("tag")
    public void sum2() {
        Assert.assertEquals(3, new Main().sum(1, 1));
//        Allure.addAttachment("RQ", "111111111111111111111111");
//        Allure.addAttachment("RS", "222222222222222222222222");
    }
}