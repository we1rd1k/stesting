package com.stesting.api.tests.tests.models.user

import com.fasterxml.jackson.annotation.JsonProperty

data class SingleUserModel(var data: UserData, var support: Suport)
data class UserData(
    var id: Int,
    var email: String,
    @JsonProperty("first_name")
    var firstName: String,
    @JsonProperty("last_name")
    var lastName: String,
    var avatar: String,
)
data class Suport(var url: String, var text: String)