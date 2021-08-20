/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegNamePage extends BasePage {
  val url: String = "http://localhost:9000/capmovie/movie-name"
  val title = "Name Page"
  val movieName = "TestName"

  def nameInput: WebElement = driver.findElement(By.id("name"))

  def submitButton: WebElement = driver.findElement(By.id("next-button"))

  def inputMovieName(): Unit = {
    nameInput.sendKeys(movieName)
  }


}
