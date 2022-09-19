package com.stesting.api.tests

import com.stesting.api.tests.tests.apis.getSingleUser
import com.stesting.api.tests.tests.assertions.ANY_STRING
import com.stesting.api.tests.tests.assertions.ANY_URL
import com.stesting.api.tests.tests.assertions.andVerifyResponseIs
import com.stesting.api.tests.tests.models.user.SingleUserModel
import com.stesting.api.tests.tests.models.user.Suport
import com.stesting.api.tests.tests.models.user.UserData
import io.qameta.allure.Feature
import io.qameta.allure.Severity
import io.qameta.allure.SeverityLevel
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Severity(SeverityLevel.CRITICAL)
@DisplayName("Users API Tests")
@Tag("API")
class GetSingleUserTest {



    @Feature("Single user API")
    @DisplayName("Get single user test")
    @Test
    fun `Get single user test`() {
        getSingleUser("2")
            .andVerifyResponseIs(200,
                SingleUserModel(
                    UserData(2, ANY_STRING, "Janet", ANY_STRING, ANY_URL),
                Suport(ANY_URL, ANY_STRING)
                )
            )
    }
}