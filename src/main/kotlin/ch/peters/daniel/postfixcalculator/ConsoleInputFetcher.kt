package ch.peters.daniel.postfixcalculator

import java.util.Scanner

/**
 * Console implementation of the InputFetcher interface.
 *
 * @author Daniel Peters
 * @version 1.0
 */
class ConsoleInputFetcher : InputFetcher {
  private val scanner = Scanner(System.`in`)

  override fun getInput(): String {
    return this.scanner.nextLine()
  }
}
