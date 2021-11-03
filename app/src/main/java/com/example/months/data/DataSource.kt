package com.example.months.data

import com.example.months.R
import com.example.months.model.Months

class DataSource {
    fun loadMonths(): List<Months> {
        return listOf(
            Months(R.string.month1, R.drawable.month1),
            Months(R.string.month2, R.drawable.month2),
            Months(R.string.month3, R.drawable.month3),
            Months(R.string.month4, R.drawable.month4),
            Months(R.string.month5, R.drawable.month5),
            Months(R.string.month6, R.drawable.month6),
            Months(R.string.month7, R.drawable.month7),
            Months(R.string.month8, R.drawable.month8),
            Months(R.string.month9, R.drawable.month9),
            Months(R.string.month10, R.drawable.month10),
            Months(R.string.month11, R.drawable.month11),
            Months(R.string.month12, R.drawable.month12)
        )
    }

}