/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegTitlePage extends BasePage {
  val url: String = "http://localhost:9000/capmovie/movie-title/false"
  val updateUrl: String = "http://localhost:9000/capmovie/update/MOV0002/title"
  val title = "Title Page"
  val movieTitle = "TestTitle"
  val updatedMovieTitle = "TestTitle1"

  def titleInput: WebElement = driver.findElement(By.id("title"))

  def inputMovieTitle(): Unit = {
    titleInput.sendKeys(movieTitle)
  }
  def inputUpdatedMovieTitle(): Unit = {
    titleInput.sendKeys(updatedMovieTitle)
  }

}
