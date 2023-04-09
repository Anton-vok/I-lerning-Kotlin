fun main(){
    var nam_one :Int
    var nam_two :Int
    var nam_ite :Int
    var otvet   :String
    while(true){
        println("Введите номер числа фибоначи")
        nam_ite=readLine()?.toInt() ?:0
        if (nam_ite<=2){
            if (nam_ite<=0){
                println("БАН")
            } else if(nam_ite==1){
                println(1)
            } else if (nam_ite==2){
                println(1)
            }
        }
        else{
            nam_one=1
            nam_two=1
            nam_ite=nam_ite-2
            for (i in 1..nam_ite){
                nam_one=nam_one+nam_two
                nam_two=nam_one-nam_two
            }
            println("${nam_ite+2} число фибоначи это-${nam_one}")
        }
        println("Хотите продолжить? Y-да N-нет")
        otvet=readLine().toString().lowercase()
        if (otvet=="n"){
            break
        }
    }
}
