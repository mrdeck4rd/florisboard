package dev.patrickgold.florisboard.ime.text.keyboard

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import com.google.android.flexbox.FlexboxLayout
import dev.patrickgold.florisboard.R

class KeyboardRowView : FlexboxLayout {
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, R.attr.keyboardRowViewStyle)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttrs: Int) : super(context, attrs, defStyleAttrs) {
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT).apply {
            setMargins(
                resources.getDimension(R.dimen.keyboard_row_marginH).toInt(), 0,
                resources.getDimension(R.dimen.keyboard_row_marginH).toInt(), 0
            )
        }
        setPadding(0, 0, 0, 0)
    }

    override fun onInterceptTouchEvent(event: MotionEvent?): Boolean {
        return false
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return false
    }
}