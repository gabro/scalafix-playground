// RemoveUnusedImports
import scala.collection.mutable.{ListBuffer, Set}
import scala.concurrent.Future

import cats.instances.all._
import cats.syntax.cartesian._

object Main extends App {
  // ExplicitResultType
  implicit val st = "string"

  // NoAutoTupling
  def m(t: (Int, String, Boolean)) = t
  m(1, "foo", true)

  // ProcedureSyntax
  def proc(x: String) {
    println(x)
  }

  // Cats
  (Option(2) |@| Option(3)).map(_ + _)

  // RemoveXmlLiterals
  val xmlLiteral =
    <div>
      <span>{st}</span>
    </div>

  val s = Set(1, 2, 3)
  proc(s.toString)

}

// Explicit Unit
trait Foo {
  def bar
}
