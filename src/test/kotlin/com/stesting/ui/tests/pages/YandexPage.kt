package com.stesting.ui.tests.pages

import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.`$x`
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.By

class YandexPage {

    var yandexLabel = `$x`("//a[@aria-label=\"Яндекс\"]")
    var servicesButton  = `$x`("//div[@class=\"services-pinned__content\"]/a")


    fun mailButton(name: String): SelenideElement {
        return `$`(By.partialLinkText(name))
    }

}