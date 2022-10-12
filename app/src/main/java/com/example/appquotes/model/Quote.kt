package com.example.appquotes.model
/*
kezdetben csak
data class Quote(val stringResourceId: Int) {

}
 */

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quote(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {

}