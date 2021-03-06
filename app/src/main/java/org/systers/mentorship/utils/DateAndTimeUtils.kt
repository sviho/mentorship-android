package org.systers.mentorship.utils

import java.text.SimpleDateFormat
import java.util.*

const val DATE_FORMAT = "dd MMM yyyy"
const val EXTENDED_DATE_FORMAT = "dd MMMM yyyy"
const val MILLISECONDS_FACTOR = 1000L

/**
 * Get [Date] from [unixTimestamp] in [String] format
 * @param unixTimestamp time in Unix timestamp format, in seconds
 * @param format date string format to use
 * @return date in string format
 */
fun convertUnixTimestampIntoStr(unixTimestamp: Float, format: String) : String {

    val date = Date(getUnixTimestampInMilliseconds(unixTimestamp))
    val sdf = SimpleDateFormat(format)
    return sdf.format(date)
}

/**
 * Convert Unix timestamp seconds to milliseconds [Long] format
 * @param unixTimestamp time in Unix timestamp format, in seconds
 * @return unix timestamp in milliseconds
 */
fun getUnixTimestampInMilliseconds(unixTimestamp: Float) : Long = (unixTimestamp * MILLISECONDS_FACTOR).toLong()