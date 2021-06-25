package custom.option

object Boot extends App {

  def getUser(id: String): Result[String] = Ok(id)

  val s: Result[String] = for {
    user1 <- getUser("1")
    user2 <- getUser("1")
  } yield user1 + user2

  println(s)

}
