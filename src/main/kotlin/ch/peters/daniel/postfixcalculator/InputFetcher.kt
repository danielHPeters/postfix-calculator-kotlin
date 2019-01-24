package ch.peters.daniel.postfixcalculator

/**
 * Interface for InputFetcher classes which supply the application with user input.
 *
 * @author Daniel Peters
 * @version 1.0
 */
interface InputFetcher {
  fun getInput(): String
}
