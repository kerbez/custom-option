package custom.option

trait Result[+T] {

  def isEmpty: Boolean

  def get: T

  def flatMap[A](f: T => Result[A]): Result[A] = {
    if(isEmpty) Nonee else f(this.get)
  }

  def map[A](f: T => A): Result[A] = {
    if(isEmpty) Nonee else Ok(f(this.get))
  }
}