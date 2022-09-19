package com.stesting.ui.tests.steps

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.open
import com.stesting.Props
import com.stesting.ui.tests.BaseTest
import com.stesting.ui.tests.utils.trimSearchStats
import io.qameta.allure.Step
import org.aeonbits.owner.ConfigFactory
import org.openqa.selenium.Keys

class GoogleSearchSteps: BaseTest() {

    private val props = ConfigFactory.create(Props::class.java)

    @Step("Open main Google page")
    fun openGoogleMain(): GoogleSearchSteps {
        open(props.googleBaseUrl())
        getGooglePage()!!.googleLabel.shouldBe(Condition.visible)
        return this
    }

    @Step("Fill in field and search")
    fun googleSearch(name: String): GoogleSearchSteps {
        getGooglePage()!!.googleSearchField.setValue(name).sendKeys(Keys.ENTER)
        return this
    }

    @Step("Get quantity of found elements")
    fun getSearchResultsStats(): Int {
        return trimSearchStats(getGooglePage()!!.googleSearchResultStats.text).replace("""[^0-9]""".toRegex(), "").toInt()
    }

    @Step("Check element searching by name: {name} is visible")
    fun checkElementIsVisible(name: String) {
        getGooglePage()!!.findLinkByName(name).shouldBe(Condition.visible)
    }

}