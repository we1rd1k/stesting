package com.stesting.ui.tests

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.logevents.SelenideLogger
import com.stesting.ui.tests.StepSingleton.Companion.getInstance
import com.stesting.ui.tests.pages.*
import com.stesting.ui.tests.steps.*
import io.qameta.allure.Step
import io.qameta.allure.selenide.AllureSelenide
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.openqa.selenium.remote.DesiredCapabilities

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
open class BaseTest {


    @BeforeAll
    @Step("Configure browser before all tests")
    fun beforeAllTests() {
        SelenideLogger.addListener(
            "AllureSelenide",
            AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        )
        val capabilities = DesiredCapabilities()
//        capabilities.setCapability("browserName", "chrome")
//        capabilities.setCapability("browserVersion", "89.0")
        capabilities.setCapability("chrome.switches", listOf("--ignore-certificate-errors"))
        val value: MutableMap<String, Any> = HashMap()
        value["enableVNC"] = true
        value["enableVideo"] = true
        capabilities.setCapability("selenoid:options", value)
        Configuration.browserCapabilities = capabilities
        Configuration.browser = "chrome"
        Configuration.timeout = 10000
        Configuration.browserSize = "1366x768"
        Selenide.clipboard().text = ""
//        Configuration.headless = true
    }

    @AfterEach
    fun afterTest() {
        Selenide.closeWebDriver()
    }

    @AfterAll
    fun tearDown() {
        Selenide.clearBrowserCookies()
    }

    fun getYandexSteps() = getInstance(YandexSteps::class.java)
    fun getMailSteps() = getInstance(MailSteps::class.java)
    fun getLoginSteps() = getInstance(LoginSteps::class.java)
    fun getYandexPage() = getInstance(YandexPage::class.java)
    fun getMailPage() = getInstance(MailPage::class.java)
    fun getMailBoxPage() = getInstance(MailBoxPage::class.java)
    fun getMailBoxSteps() = getInstance(MailBoxSteps::class.java)
    fun getLoginPage() = getInstance(LoginPage::class.java)
    fun getGooglePage() = getInstance(GoogleMainPage::class.java)
    fun getGoogleSteps() = getInstance(GoogleSearchSteps::class.java)

}