
fun agoToText(times:Int){

    when (times) {
        in 0..60 -> println("Был только что")
        in 61..3600 -> timesMinutes(times)
        in 3601..86399 -> timesClock(times)
        in 86400..172799 -> println("Был вчера")
        in 172800..259199 -> println("Был позавчера")
        else -> println("Был давно")
    }
}

fun main(){
    agoToText(4000)

}

fun timesMinutes (times:Int) {
    val minutes = times/60
    when (minutes){
        1,21,31,41,51 -> println("Был $minutes минуту назад")
        2,3,4,22,23,24,32,33,34,42,43,44,52,53,54 -> println("Был $minutes минуты назад")
        else ->println("Был $minutes минут назад")
    }
}

fun timesClock(times:Int){
    val clock = times/3600
    when(clock){
        1, 21 -> println("Был $clock час назад")
        2,3,4,22,23,24  -> println("Был $clock часа назад")
        else -> println("Был $clock часов назад")
    }
}