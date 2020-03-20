open class UserChoice(var optionParam:Array<String>) {


   open fun userChoice():String
    {

        var isValidChoice=true
        var userChoice=""

        while (isValidChoice)
        {
            println("Please Enter one of the Following...")

            for (items in optionParam)
            {
                println("$items")
            }
            var userInput= readLine()
            if (userInput!=null && userInput in optionParam)
            {
                isValidChoice=false
                userChoice=userInput
            }
        }
        return userChoice
    }
}