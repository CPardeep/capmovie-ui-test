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
  def removeCast: WebElement = driver.findElement(By.cssSelector(".govuk-summary-list__row:first-child>dd>a"))
  def castList: util.List[WebElement] = driver.findElements(By.className("movie"))

  def getCastCount: Int = castList.size

}
