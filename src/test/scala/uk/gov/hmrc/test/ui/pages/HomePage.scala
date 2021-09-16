/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

import java.util

object HomePage extends BasePage {

  val url: String = "http://localhost:9001/capmovie/home"
  val title = "Home Page"

  def movieList: util.List[WebElement] = driver.findElements(By.className("movie-card"))

  def checkListSize: Boolean = movieList.size > 1

  def firstMovie: WebElement = driver.findElement(By.id("movie[0]"))

  def lastMovie: WebElement = driver.findElement(By.cssSelector("#movie-container>div>div:last-of-type>p>a"))


}
