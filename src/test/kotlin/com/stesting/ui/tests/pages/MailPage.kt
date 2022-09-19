package com.stesting.ui.tests.pages

import com.codeborne.selenide.Selenide.`$x`

class MailPage {

    var enterMailButton = `$x`("//span[text()='Войти в Почту']/parent::button")

}