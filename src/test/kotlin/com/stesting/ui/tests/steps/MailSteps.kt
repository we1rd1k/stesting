package com.stesting.ui.tests.steps

import com.codeborne.selenide.Condition
import com.codeborne.selenide.WebDriverRunner
import com.stesting.ui.tests.BaseTest
import io.qameta.allure.Step
import kotlin.test.assertContains

class MailSteps: BaseTest() {

    @Step("Click button to enter mail box")
    fun clickEnterButton(): LoginSteps? {
        getMailPage()!!.enterMailButton.shouldBe(Condition.visible).click()
        assertContains(WebDriverRunner.getWebDriver().currentUrl, "https://passport.yandex.ru/")
        return getLoginSteps()
    }
}