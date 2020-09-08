package com.example.mergeadapter.model

data class MayItem(val name: String)

fun getMayList(): List<MayItem> {
    return listOf(
        MayItem(name = "Mayra"),
        MayItem(name = "Virginia")
    )
}