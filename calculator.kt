fun main(){
    var one:Int
    var f:String
    var two:Int
    while(true){
        one=readLine()?.toIntOrNull() ?: 0
        one=one.toInt()
        f= readLine().toString()
        two=readLine()?.toIntOrNull() ?: 0
        one=one.toInt()
        if (f=="+"){
            println("${one}+${two}=${one+two}")
        } else if (f=="-"){
            println("${one}-${two}=${one-two}")
        } else if (f=="*"){
            println("${one}*${two}=${one*two}")
        } else if (f=="/"){
            if (two==0){
                println("Нельзя делить на 0")
            } else{
                println("${one}/${two}=${one/two}")
            }
        } else{
            println("${f}не входит в список подерживамых символов(+,-,/,*)")
        }
        println("Хотите продолжить? Y-да, N-нет")
        f= readLine().toString()
        if (f.lowercase()=="N"){
            break
        }
    }
}
