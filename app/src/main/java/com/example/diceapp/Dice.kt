package com.example.diceapp
//전역 변수. global variable 선언
var num:Int = 0

fun main(){
    var a:Int = 2

    val b:Short = 5 // read - only

    //b = 8 //val 변수는 새로운 값을 배정할 수 없음.

    var name:String = "Tom"
    var name2:String? // null 값을 허용하는 타입

    num++
    //name = null
    name2 = null
    //자바 언어에서는 발생하는 문제가 NPE(NullPointerException) 오브젝트 변수인데 오브젝트가 실제 가르키는 오브젝트가 없다.
    // ex) r이라는 변수가 있지만 Rect r; 로 끝내고 r.size() 하는 것의 문제
    // Rect r = new Rect(); 해서 만들어줘야 함
    // 코틀린에서는 이를 해결하기 위해
    println("Length: ${name.length}")
    println("Length: ${name2?.length}") // null safe null이 들어가 있으면 length를 실행하지 않고 null을 출력해줌.

    name2 = "Peter";
    println("Length: ${name.length}")
    println("Length: ${name2?.length}")

    val length:Int = name2?.length ?: -1 // ?: Elvis 연산자.
    //name2가 널이면 콜론 뒤에값을 앞에다 배정하겠다.
    //if(name2 == null) length = -1
    //else length = name2.length

    roll()

    //roll2(12) //인자값을 넘기면서 함수 호출. 인자값은 함수의 매개변수로 전달
    val number2 = roll2(8)

    println("Dice number2: $number2 --> $num")

}

fun roll(){
    var num:Int = 3 //지역변수
    num++ //전역변수와 지역변수의 이름이 동일하면 지역변수를 사용한다. 전역변수는 가려진다
    //주사위 던져서 나오는 숫자 하나
    var number:Int = 0;
    number = (1..6).random() //1..6 --> 1~6범위
    println("Dice number: $number")
}

//반환이 있는 함수 정의. 매개변수 리스트 뒤에 반환 타입을 지정.
/*

fun roll2(sides:Int):Int{ //매개변수 정의
    return (1..sides).random()
}*/

fun roll2(sides:Int)/*:Int*/ = (1..sides).random() //함수의 내용이 한줄일떄 이렇게 만들 수 있음 return 제거 Int가 나온다고 했으니 return타입 생략가능

class MyDice(){

}