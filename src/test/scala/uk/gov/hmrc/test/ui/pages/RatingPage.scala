/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object RatingPage extends BasePage {
  val url: String = "http://localhost:9001/capmovie/movie/MOV0002/create/rating"
  val title = "Movie Rating"

  def rating2: WebElement = driver.findElement(By.id("rating-2"))
  def rating5: WebElement = driver.findElement(By.id("rating-5"))
}
