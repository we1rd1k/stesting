package com.stesting.ui.tests.pages

import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.`$x`
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.By

class GoogleMainPage {

    var googleLabel = `$x`("//img[@alt=\"Google\"]")
    var googleSearchField = `$x`("//input[@title='Поиск']")
    var googleSearchResultStats = `$x`("//div[@id=\"result-stats\"]")



    fun findLinkByName(name: String): SelenideElement {
        return `$`(By.partialLinkText(name))
    }
}