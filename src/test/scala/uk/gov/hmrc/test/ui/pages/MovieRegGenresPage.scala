/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages
import org.openqa.selenium.{By, WebElement}

object MovieRegGenresPage extends BasePage{
  val url: String = "http://localhost:9000/capmovie/movie-genres/false"
  val title = "Genres Page"

  def genreInput: WebElement = driver.findElement(By.id("genres"))


  def inputMovieGenres(str: String): Unit = {
    genreInput.sendKeys(str)
  }
}
