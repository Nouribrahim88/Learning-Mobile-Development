fun main() {
    var name : String = ""
    var nickname: String?=null
    var age: Int=0

    if(nickname==null)
    {
        println("nickname error")
    }
    if (age < 15) println("Child")
    else if ( age < 18) println("Teen")
    else println("Adult")
}


