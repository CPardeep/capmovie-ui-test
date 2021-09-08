/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegSummaryPage extends BasePage {

  val url: String = "http://localhost:9000/capmovie/summary/false"
  val title = "Summary"
  val confTitle = "Add a Movie Success"

  def getMovieTitle: WebElement = driver.findElement(By.id("title-value"))
  def getMovieGenres: WebElement = driver.findElement(By.id("genres-value"))
  def getMovieAgeRating: WebElement = driver.findElement(By.id("age-rating-value"))
  def getMoviePlot: WebElement = driver.findElement(By.id("plot-value"))
  def getMoviePoster: WebElement = driver.findElement(By.id("poster-value"))
  def getMovieCast: WebElement = driver.findElement(By.id("cast-value"))
  def getMovieTitleChangeLink: WebElement = driver.findElement(By.id("change-title"))
}
