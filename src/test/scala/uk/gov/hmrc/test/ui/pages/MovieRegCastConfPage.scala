/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

import java.util

object MovieRegCastConfPage extends BasePage {
  val url: String = "http://localhost:9000/capmovie/movie-cast/confirmation"
  val title = "Cast Confirmation Page"

  def addAnotherButton: WebElement = driver.findElement(By.linkText("Add another cast member"))
  def continueLink: WebElement = driver.findElement(By.linkText("Continue"))

  def castList: util.List[WebElement] = driver.findElements(By.className("movie-card"))

  def getCastCount: Int = castList.size

}
