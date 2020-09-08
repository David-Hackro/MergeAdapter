package com.example.mergeadapter.model

data class MexLogicItem(
    val instagram: String,
    val twitter: String,
    val image: String
)

fun getMexLogicList(): List<MexLogicItem> {
    return listOf(
        MexLogicItem(
            "@mex_logic",
            "@mex_logic",
            image = "https://www.muycomputer.com/wp-content/uploads/2020/08/Android.jpg"
        ),
        MexLogicItem(
            "@mex_logic",
            "@mex_logic",
            image = "https://www.muycomputer.com/wp-content/uploads/2020/08/Android.jpg"
        ),
        MexLogicItem(
            "@mex_logic",
            "@mex_logic",
            image = "https://www.muycomputer.com/wp-content/uploads/2020/08/Android.jpg"
        ),
        MexLogicItem(
            "@mex_logic",
            "@mex_logic",
            image = "https://www.muycomputer.com/wp-content/uploads/2020/08/Android.jpg"
        )
    )
}