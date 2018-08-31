package ch.peters.daniel.postfixcalculator

/**
 * Main application class.
 *
 * @author Daniel Peters <daniel.peters.ch@ŋmail.com>
 * @version 1.0
 */
class App {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val input = ConsoleInputFetcher()
      val converter = PostFixConverter()
      val parser = PostFixExpressionParser()
    }
  }
}
