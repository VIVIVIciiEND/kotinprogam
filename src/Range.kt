fun main(){
    val numbers=1 ..100
    val symbol= 'a'..'z'
    print("Введите ваш уровень: ")
    val level = readln().toInt()
    if (level in 1..50){
        println("Уровень $level соответствует треюовниям1 Вы можете зайти в данж!")

    }
    else {
        println("высокий уровень! вход запрещен" )
    }
}