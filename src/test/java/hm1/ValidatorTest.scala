package hm1

import org.junit.{Assert, Test}

/**
  * @author Evgeny Borisov
  */
class ValidatorTest {

  @Test
  def test1(): Unit ={
    Assert.assertEquals(LoginValidator.NOT_ADMIN,LoginValidator.validate(NewLogin("admin","a","a")))
    Assert.assertEquals(LoginValidator.NOT_FROM_Z,LoginValidator.validate(NewLogin("zdmin","a","a")))
  }

}
