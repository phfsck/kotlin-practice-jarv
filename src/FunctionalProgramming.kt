// https://hackernoon.com/functional-programming-by-example-with-kotlin-27fd7e49b55f
// https://github.com/jacquesgiraudel/IntroPgmFonct

class FunctionalProgramming {

    companion object {

        fun isTimezoneFormatValid(timezone: String): Boolean {
            val newTimezone = timezone.replace("\\s".toRegex(), "")
            val pattern = "^UTC[+-]([0-9]{2}|[0-9]):[0-9]{2}$".toRegex()
            if(pattern.containsMatchIn(newTimezone)) {
                return true
            }
            return false
        }

        fun findByTitle(query: String, collection: MutableList<Movie>): List<Movie> {
            var results: List<Movie> = listOf()

            val predicate = ::matches

            val add = fun(movie: Movie, movies: List<Movie>) = movies.plus(movie)

            for(movie: Movie in collection) {
                val fn = addIf(predicate, query, movie, add)
                results = fn(movie, results)
            }
            return results
        }

        private fun addIf(predicate: (String, Movie) -> Boolean, query: String, movie: Movie, add: (Movie, List<Movie>) -> (List<Movie>)): (Movie, List<Movie>) -> (List<Movie>) {

            if(predicate(query, movie)) {
                return add
            }
            return fun(movie: Movie, movies: List<Movie>) = listOf<Movie>()
        }

        private fun matches(query: String, movie: Movie): Boolean = title(movie).isInfixOf(query)

        private fun title(movie: Movie): String = movie.title

        private fun String.isInfixOf(query: String) = contains(query)

    }
}

class Movie(val title: String) {

}