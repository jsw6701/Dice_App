package com.example.diceapp

fun main(){
    var a:Int = 2

    val b:Short = 5 // read - only

    //b = 8 //val 변수는 새로운 값을 배정할 수 없음.

    var name:String = "Tom"
    var name2:String? // null 값을 허용하는 타입

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

    
}

fun roll(){

    //주사위 던져서 나오는 숫자 하나
    var number:Int = 0;
    number = (1..6).random() //1..6 --> 1~6범위
    println("Dice number: $number")
}


class My