fun main() {
    val jobSite = JavaDeveloperJobSite()
    jobSite.addVacancy("First Vacancy")
    jobSite.addVacancy("Second Vacancy")

    val firstSubscriber: Observer = Subscriber("Oleg")
    val secondSubscriber: Observer = Subscriber("Ivan")

    jobSite.addObserver(firstSubscriber)
    jobSite.addObserver(secondSubscriber)

    jobSite.addVacancy("Third Vacancy")

    val thirdSubscriber: Observer = Subscriber("Andrey")

    jobSite.addObserver(thirdSubscriber)

    jobSite.addVacancy("Fourth Vacancy")

    jobSite.removeVacancy("First Vacancy")
}