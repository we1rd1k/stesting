package com.stesting.ui.tests

import com.stesting.Props
import io.qameta.allure.Severity
import io.qameta.allure.SeverityLevel
import org.aeonbits.owner.ConfigFactory
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Severity(SeverityLevel.CRITICAL)
@DisplayName("Yandex Tests")
@Tag("UI")
class YandexMailTests: BaseTest() {

    private val props = ConfigFactory.create(Props::class.java)

    @DisplayName("Yandex mail box test")
    @Test
    fun `Go to yandex mail box test`() {
        getYandexSteps()
            ?.goToYaMain()
            ?.clickOnServicesButton()
            ?.clickServiceByName("Почта")
            ?.clickEnterButton()
            ?.clickLoginByMailButton()
            ?.checkLoginByMailField()
            ?.fillInLoginField(props.yandexLogin())
            ?.pressSignInButton()
            ?.checkPasswordField()
            ?.fillInPasswordField(props.yandexPassword())
            ?.pressSignInButton()
            ?.checkAndCloseAdditionalMailMenu()
            ?.checkMainEmailBoxPage()

    }
}