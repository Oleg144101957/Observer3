class JavaDeveloperJobSite : Observed {

    val vacancies = mutableListOf<String>()
    val subscribers = mutableListOf<Observer>()


    fun addVacancy(vacancy: String){
        this.vacancies.add(vacancy)
        notifyObservers()
    }

    fun removeVacancy(vacancy: String){
        this.vacancies.remove(vacancy)
        notifyObservers()
    }


    override fun addObserver(observer: Observer) {
        this.subscribers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        this.subscribers.remove(observer)
    }

    override fun notifyObservers() {
        subscribers.forEach {
            it.handleEvent(vacancies = vacancies)
        }
    }
}