package custom.option

case object Nonee extends Result[Nothing] {
  override def isEmpty: Boolean = true
  override def get: Nothing = throw new NoSuchElementException("None.get")
}