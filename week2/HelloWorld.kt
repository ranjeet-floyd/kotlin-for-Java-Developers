package intro
fun main(args: Array<String>){
    println("Hello ${args.getOrNull(0)}")
    val name = if (args.size > 0) args[0] else "kotlin"
    println("Hello , $name !")
    // println(Util.fooUtil())
}