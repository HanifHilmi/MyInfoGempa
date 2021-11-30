package com.hilmihanif.myinfogempa.data

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("Infogempa")
    val infoGempa: InfoGempa
)