package com.stesting.ui.tests.steps

import com.codeborne.selenide.Condition
import com.stesting.ui.tests.BaseTest
import io.qameta.allure.Step

class LoginSteps: BaseTest() {

    @Step("Click enter by mail button")
    fun clickLoginByMailButton(): LoginSteps {
        getLoginPage()!!.loginByMailButton.shouldBe(Condition.visible).click()
        return this
    }

    @Step("Check Login by name field exists")
    fun checkLoginByMailField(): LoginSteps {
        getLoginPage()!!.loginByMailField.shouldBe(Condition.visible)
        return this
    }
    @Step("Fill in login field: {login}")
    fun fillInLoginField(login: String): LoginSteps {
        getLoginPage()!!.loginByMailField.setValue(login)
        return this
    }

    @Step("Sign in button click")
    fun pressSignInButton(): LoginSteps {
        getLoginPage()!!.signInButton.click()
        return this
    }

    @Step("Check password exists")
    fun checkPasswordField(): LoginSteps {
        getLoginPage()!!.passwordField.shouldBe(Condition.visible)
        return this
    }
    @Step("Fill in password field: {pass}")
    fun fillInPasswordField(pass: String): LoginSteps {
        getLoginPage()!!.passwordField.setValue(pass)
        return this
    }

    @Step("Check if additional mail menu present and close")
    fun checkAndCloseAdditionalMailMenu(): MailBoxSteps? {
        if (getLoginPage()!!.additionalMailTitle.exists()) {
            getLoginPage()!!.notNowButton.click()
        }
        return getMailBoxSteps()
    }

}