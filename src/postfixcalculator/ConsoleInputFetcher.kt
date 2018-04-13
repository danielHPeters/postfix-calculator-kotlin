package postfixcalculator

import java.util.Scanner

/**
 *
 * @author Daniel Peters
 * @version 1.0
 */
class ConsoleInputFetcher : IInputFetcher {
  private val scanner = Scanner(System.`in`)

  override fun getInput(): String {
    return this.scanner.nextLine()
  }
}
