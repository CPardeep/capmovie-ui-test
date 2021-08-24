/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegTitlePage extends BasePage {
  val url: String = "http://localhost:9000/capmovie/movie-title"
  val title = "Title Page"
  val movieTitle = "TestTitle"

  def titleInput: WebElement = driver.findElement(By.id("title"))

  def submitButton: WebElement = driver.findElement(By.id("next-button"))

  def inputMovieTitle(): Unit = {
    titleInput.sendKeys(movieTitle)
  }


}
