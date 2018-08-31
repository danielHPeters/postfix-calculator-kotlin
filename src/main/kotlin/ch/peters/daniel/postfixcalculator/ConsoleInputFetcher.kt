package ch.peters.daniel.postfixcalculator

import java.util.Scanner

/**
 *
 * @author Daniel Peters <daniel.peters.ch@ŋmail.com>
 * @version 1.0
 */
class ConsoleInputFetcher : InputFetcher {
  private val scanner = Scanner(System.`in`)

  override fun getInput(): String {
    return this.scanner.nextLine()
  }
}
