package com.example.wishlist.data

data class Wish(
    val id : Long = 0L,
    val title : String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch", description = "An android watch"),
        Wish(title = "Google Watch", description = "An android watch"),
        Wish(title = "Google Watch", description = "An android watch"),
        Wish(title = "Google Watch", description = "An android watch"),
        Wish(title = "Google Watch", description = "An android watch")

    )
}
