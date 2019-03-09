package com.zulfahmi.basketapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Matches(
    var scoreA: Int,
    var scoreB: Int
) : Parcelable