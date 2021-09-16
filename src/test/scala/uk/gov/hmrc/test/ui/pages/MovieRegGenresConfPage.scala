/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

import java.util

object MovieRegGenresConfPage extends BasePage {

  val url: String = "http://localhost:9000/capmovie/movie-genres/confirmation/false"
  val title = "Genres Confirmation Page"

  def addAnotherButton: WebElement = driver.findElement(By.id("add-another"))
  def removeGenre: WebElement = driver.findElement(By.id("genre[0]"))

  def genresList: util.List[WebElement] = driver.findElements(By.className("genre"))

  def getGenresCount: Int = genresList.size

  def getLastGenre: String = driver.findElement(By.
    cssSelector("#genres-list>div:last-child>.genre")).getText

}
