fun main(){
    var kol:Double
    var inp:String
    var out:String
    kol=0.0
    while(true) {
        println("Ведите температуру и в конце ед измерения")
        println("C-цельсия, K-кельвины, F-фаренгейты")
        println("Пример: 12С или 13k или 134F")
        inp=readLine().toString()
        println("Ввыедите желаемые ед измерения")
        out= readLine().toString()

        if (inp.last().lowercase()=="f"){
            kol=inp.dropLast(1).toDouble()-32
            kol=kol*5/9
        } else if (inp.last().lowercase()=="k"){
            kol=inp.dropLast(1).toDouble()-273.15
        } else{
            kol=inp.dropLast(1).toDouble()
        }
        if (out.lowercase()=="k"){
            kol=kol+273.15
        } else if (out.lowercase()=="f"){
            kol=kol*9/5
            kol=kol+32
        }
        println("${inp} в ${out} это ${kol}")
        println("Хотите продолжить? Y-да, N-нет")
        inp=readLine().toString()
        if (inp.lowercase()=="n"){
            break
        }
    }
}
