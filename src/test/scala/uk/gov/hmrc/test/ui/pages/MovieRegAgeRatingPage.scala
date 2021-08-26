/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegAgeRatingPage extends BasePage {

  val url: String = "http://localhost:9000/capmovie/age-rating"
  val title = "Age Rating"

  def ageRatingSelect: WebElement = driver.findElement(By.id("rated"))
  def submitButton: WebElement = driver.findElement(By.id("next-button"))

}