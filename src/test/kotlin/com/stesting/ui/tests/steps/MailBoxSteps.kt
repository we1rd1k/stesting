package com.stesting.ui.tests.steps

import com.codeborne.selenide.Condition
import com.stesting.ui.tests.BaseTest
import io.qameta.allure.Step

class MailBoxSteps: BaseTest() {


    @Step("Check mail box acc image is visible")
    fun checkMainEmailBoxPage() {
        getMailBoxPage()!!.accountImage.shouldBe(Condition.visible)

    }
}