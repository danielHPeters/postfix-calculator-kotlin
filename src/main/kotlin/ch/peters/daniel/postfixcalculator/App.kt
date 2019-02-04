package ch.peters.daniel.postfixcalculator

/**
 * Main application class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
class App {
  companion object {
    @JvmStatic
    fun main() {
      val input = ConsoleInputFetcher()
      val converter = PostFixConverter()
      val parser = PostFixExpressionParser()
    }
  }
}
