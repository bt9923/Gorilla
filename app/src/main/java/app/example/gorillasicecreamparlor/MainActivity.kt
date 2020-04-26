package app.example.gorillasicecreamparlor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior


class MainActivity : AppCompatActivity() {

    private var bottom_sheet: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_sheet = findViewById(R.id.bottom_sheet)
        val sheetBehavior = BottomSheetBehavior.from(bottom_sheet)

        sheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN

        btnOrder.setOnClickListener{
            sheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }
    }
}
