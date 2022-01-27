import org.w3c.dom.ranges.Range

fun main(){

    //Ex. 1

    println(capitalizeSentence(("sagar subedi")))


    // Ex. 2
    val result=getOdd(listOf(1,2,3))


    result.forEach { println(it) }

    //Ex. 3

   println( containsRange(5..7,5..7))
    println( containsRange(1..12,5..7))
    println( containsRange(5..8,5..9))


    //Ex.4

   println(addUpTo(3))

}



// capitalize first letter of a sentence

fun capitalizeSentence(sentence:String):String


{
   val words= mutableListOf<String>()

    sentence.split(" ").forEach {
        words.add(it[0].toUpperCase()+it.substring((1)))


    }

    return words.joinToString (" ")




}

//get odd numbers from a list

fun getOdd(listofIntegers: List<Int>):List<Int>
{
    val alist= mutableListOf<Int>()
    for (i in listofIntegers)
    {
       if (i%2!=0)
       {
           alist.add(i)
       }
    }
    return alist


}

// check if a range contains another range

fun containsRange(range1:IntRange, range2:IntRange) :Boolean
{
    return range2.first>=range1.first && range2.last<=range1.last



}

// sum of all numbers upto

fun addUpTo(anum:Int):Int
{

    println("Please enter a number: ")



    var sum=0
    for (i in 1..anum)
    {
        sum+=i
    }

    return sum
}

