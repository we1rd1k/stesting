package com.stesting.ui.tests.pages

import com.codeborne.selenide.Selenide

class MailBoxPage {

    var accountImage = Selenide.`$x`("//div/div/a[contains(@class, 'account')]//img")
}