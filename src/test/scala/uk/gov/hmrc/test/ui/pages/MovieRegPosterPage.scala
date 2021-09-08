/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegPosterPage extends BasePage {
  val url: String = "http://localhost:9000/capmovie/movie-poster/false"
  val title = "Poster Page"
  val moviePosterURL = "TestURL"

  def posterInput: WebElement = driver.findElement(By.id("poster"))

  def inputMoviePoster(): Unit = {
    posterInput.sendKeys(moviePosterURL)
  }

}
