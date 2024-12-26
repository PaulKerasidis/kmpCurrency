package gr.pkerasidis.learningproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform