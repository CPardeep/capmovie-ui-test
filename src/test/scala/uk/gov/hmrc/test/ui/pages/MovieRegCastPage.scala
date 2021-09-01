/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegCastPage extends BasePage {
  val url: String = "http://localhost:9000/capmovie/movie-cast"
  val title = "Cast Page"

  def castInput: WebElement = driver.findElement(By.id("cast"))

  def inputMovieCast(str: String): Unit = {
    castInput.sendKeys(str)
  }
}
