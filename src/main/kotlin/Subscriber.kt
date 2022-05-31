class Subscriber(val name: String) : Observer {



    override fun handleEvent(vacancies: List<String>) {
        println("Dear $name \n We have some changes in vacancies \n $vacancies \n ========================== \n")
    }
}