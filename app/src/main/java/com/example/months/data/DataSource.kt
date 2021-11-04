package com.example.months.data

import com.example.months.R
import com.example.months.model.Months

class DataSource {
    fun loadMonths(): List<Months> {
        return listOf(
            Months(R.string.month1, R.drawable.month1, R.raw.first),
            Months(R.string.month2, R.drawable.month2, R.raw.second),
            Months(R.string.month3, R.drawable.month3, R.raw.third),
            Months(R.string.month4, R.drawable.month4, R.raw.forth),
            Months(R.string.month5, R.drawable.month5, R.raw.fivth),
            Months(R.string.month6, R.drawable.month6, R.raw.six),
            Months(R.string.month7, R.drawable.month7, R.raw.seventh),
            Months(R.string.month8, R.drawable.month8, R.raw.eight),
            Months(R.string.month9, R.drawable.month9, R.raw.fivth),
            Months(R.string.month10, R.drawable.month10, R.raw.six),
            Months(R.string.month11, R.drawable.month11, R.raw.second),
            Months(R.string.month12, R.drawable.month12, R.raw.forth)
        )
    }

}