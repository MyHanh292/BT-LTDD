package com.example.btvn2
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khai báo các thành phần giao diện
        val edtStaff = findViewById<EditText>(R.id.edtStaff)
        val btnChange = findViewById<Button>(R.id.btnChange)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        // Xử lý khi bấm nút "Đổi"
        btnChange.setOnClickListener {
            val staffName = edtStaff.text.toString().trim()
            if (staffName.isNotEmpty()) {
                tvResult.text = "Nhân viên: $staffName"
            } else {
                tvResult.text = "Vui lòng nhập tên nhân viên!"
            }
        }

        // Xử lý khi bấm nút "Thêm"
        btnAdd.setOnClickListener {
            tvResult.text = "Đã thêm sách vào danh sách!"
        }
    }
}
