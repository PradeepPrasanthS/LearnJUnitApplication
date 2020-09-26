package com.example.learnjunitapplication

import android.app.Activity
import android.widget.Button
import android.widget.TextView
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var activity: Activity

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testButtonClick() {
        assertEquals("Text should be empty initially", "", textView.text)
        activity.runOnUiThread { button.performClick() }
        try {
            Thread.sleep(3000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        assertEquals("Text changed to Hi!", "Hi!", textView.text)
    }
}