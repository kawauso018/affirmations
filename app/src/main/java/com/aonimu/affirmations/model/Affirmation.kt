package com.aonimu.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//データクラスを作成
//データクラスに文字列と画像のリソースIDを渡す。リソースIDは整数。
//アノテーションを追加することで、リソースIDの種類を間違えたときに警告が出る。
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
) {
}