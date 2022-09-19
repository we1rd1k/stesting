package com.stesting.ui.tests

import io.qameta.allure.Severity
import io.qameta.allure.SeverityLevel
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Severity(SeverityLevel.CRITICAL)
@DisplayName("Google Tests")
@Tag("UI")
class GoogleSearchTests: BaseTest() {

    @DisplayName("Google search test")
    @Test
    fun `Google search item test`() {
        val elementFound =  getGoogleSteps()
            ?.openGoogleMain()
            ?.googleSearch("купить кофемашину bork c804")
            ?.getSearchResultsStats()
        if (elementFound != null) {
            assertTrue(elementFound>10)
        }
        getGoogleSteps()
            ?.checkElementIsVisible("mvideo.ru")
    }
}