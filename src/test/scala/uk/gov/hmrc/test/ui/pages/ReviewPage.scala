/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By

object ReviewPage extends BasePage {
  val url: String = "http://localhost:9001/capmovie/movie/MOV0002/create/review"
  val title = "Movie Review"

  def reviewInputBox = driver.findElement(By.id("review"))

  def inputReview = reviewInputBox.sendKeys("TESTREVIEW")

  def clickSubmit = driver.findElement(By.id("submit")).click()
}
