package com.stesting.ui.tests.pages

import com.codeborne.selenide.Selenide.`$x`

class LoginPage {

    var loginByMailButton = `$x`("//span[text()='Почта']/parent::button")
    var loginByMailField = `$x`("//input[@placeholder='Логин или email']")
    var signInButton = `$x`("//button[contains(@id, 'sign-in')]")
    var passwordField = `$x`("//input[@placeholder='Введите пароль']")
    var additionalMailTitle = `$x`("//h1[contains(text(), 'Добавьте почту')]")
    var notNowButton = `$x`("//div[contains(@data-t, 'skip')]/button")
}