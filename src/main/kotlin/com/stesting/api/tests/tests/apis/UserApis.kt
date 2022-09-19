package com.stesting.api.tests.tests.apis

import com.stesting.api.tests.tests.common.USERS_URL
import com.stesting.api.tests.tests.utils.get
import io.qameta.allure.Step

@Step("Get single user by id: {userNumber}")
fun getSingleUser(userNumber: String) =
    get<String>("$USERS_URL/$userNumber")