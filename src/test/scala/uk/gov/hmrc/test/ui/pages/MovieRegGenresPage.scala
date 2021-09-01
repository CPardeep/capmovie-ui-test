/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages
import org.openqa.selenium.{By, WebElement}

object MovieRegGenresPage extends BasePage{
  val url: String = "http://localhost:9000/capmovie/movie-genres"
  val title = "Genres Page"
  val genres = List("genre1", "genre2")

  def genreInput: WebElement = driver.findElement(By.id("genres"))


  def inputMovieGenres(str: String): Unit = {
    genreInput.sendKeys(str)
  }
}
