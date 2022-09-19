package com.stesting.ui.tests.steps

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.open
import com.codeborne.selenide.Selenide.switchTo
import com.codeborne.selenide.WebDriverRunner
import com.stesting.Props
import com.stesting.ui.tests.BaseTest
import io.qameta.allure.Step
import org.aeonbits.owner.ConfigFactory
import kotlin.test.assertContains

class YandexSteps: BaseTest() {

    private val props = ConfigFactory.create(Props::class.java)

    @Step("Open main Ya page")
    fun goToYaMain(): YandexSteps {
        open(props.yandexUrl())
        getYandexPage()!!.yandexLabel.shouldBe(Condition.visible)
        return this
    }

    @Step("Click services button")
    fun clickOnServicesButton(): YandexSteps {
        getYandexPage()!!.servicesButton.click()
        return this
    }

    @Step("Choose service by name: {name}")
    fun clickServiceByName(name: String): MailSteps? {
        getYandexPage()!!.mailButton(name).click()
        switchTo().window(1)
        assertContains(WebDriverRunner.getWebDriver().currentUrl, "https://mail.yandex.ru/")
        return getMailSteps()
    }

}