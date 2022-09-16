package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // R은 리소스를 가르킴. 우리가 보아야할 화면을 여기 괄호에 입력함
        // 화면상에 있는 버튼 id 위젯을 가르키도록 한 것
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val number = roll2(6)
            val textView = findViewById<TextView>(R.id.textView) //위와 달리 <TextView>가 따라온 이유는 앞에 텍스트 타입을 입력해주지 않아서다
            textView.setText(number.toString()) // 텍스트뷰 위젯에 주사위 숫자 출력 // 텍스트뷰는 문자를 받는 것이기 때문에 숫자도 문자열로 바꾸어 주어야한다.
            //소스상에 문제는 없지만 실행할 떄 문제가 생김
            //하단 Logcat 들어가기 Verbose클릭 에러클릭
            //파일명이 파란색으로 나오는 것 MainActivity에 에러 발견


        }

    }
    fun roll2(sides:Int)/*:Int*/ = (1..sides).random()
}
//res(generated)는 컴파일 한 것을 가르킴
