package custom.option

case class Ok[T](a: T) extends Result[T] {
  override def isEmpty: Boolean = false
  override def get: T = a

  def +[T] (ok: Ok[T]): Ok[String] = {
    Ok(s"${this.get}${ok.get}")
  }

}
