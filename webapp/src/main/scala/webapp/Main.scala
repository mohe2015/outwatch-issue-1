package webapp

import outwatch._
import outwatch.dsl._
import cats.effect.SyncIO

import colibri.Subject

// Outwatch documentation:
// https://outwatch.github.io/docs/readme.html

object Main {
  def main(args: Array[String]): Unit =
    Outwatch.renderInto[SyncIO]("body", app).unsafeRunSync()

  def app = {
    import svg._
    a("Hello World!")
  }
}
