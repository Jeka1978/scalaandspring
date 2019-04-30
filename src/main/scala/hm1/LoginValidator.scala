package hm1

import com.evgeny.moscow.Animal

/**
  * @author Evgeny Borisov
  */
object LoginValidator {

  val NOT_ADMIN = "can't be admin"
  val NOT_FROM_Z: String = "can't start from 'z'"
  val USERNAME_EQ_PASSWORD: String = "username should differ from password"
  val ONLY_DIDGITS: String = "password can't contain only digits"
  val PASS_CONFIRMATION: String = "password should be equals to confirmation"

  def validate(login:NewLogin):String={
    login match {
      case NewLogin("admin", _, _) =>  NOT_ADMIN
      case NewLogin(userName, _, _) if userName.startsWith("z") => NOT_FROM_Z
      case NewLogin(userName, password, _) if userName==password => USERNAME_EQ_PASSWORD
      case NewLogin(_, password, _) if password.forall(_.isDigit) => ONLY_DIDGITS
      case NewLogin(_,password, confirmation) if password!=confirmation => PASS_CONFIRMATION
      case _=>"accepted"
    }
  }
}
