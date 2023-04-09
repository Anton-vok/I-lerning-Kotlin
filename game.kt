import kotlin.random.Random

fun main() {
    var lev:String
    var pop:Int
    var chi:Int
    var use:Int
    var res:String
    val random=Random
    pop=0
    while(true) {
        println("Выберете уровень сложность")
        println("L-легкий, M-средний, H-сложный")
        println("Если хотите выйти напишите N")
        lev=readLine().toString().lowercase()
        if (lev=="n"){
            break
        }
        when (lev){
            "l" -> pop=7
            "m" -> pop=5
            "h" -> pop=3
        }
        println("Удачной игры!")
        while(true){
            res="Проиграли"
            chi= random.nextInt(10)+1
            for(i in 1..pop){
                use= readLine()?.toIntOrNull() ?:continue
                if (use==chi){
                    res="угадали"
                    break
                } else{
                    println("Вы не угадали")
                }
            }
            println("Вы ${res}")
            print("Прдолжить играть или выйти в главное меню? Y-продолжить N-выйти")
            res=readLine().toString().lowercase()
            if (res=="n"){
                break
            }
        }
    }
}
