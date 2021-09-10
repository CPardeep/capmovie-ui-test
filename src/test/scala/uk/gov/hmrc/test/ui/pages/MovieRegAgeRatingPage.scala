/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegAgeRatingPage extends BasePage {

  val url: String = "http://localhost:9000/capmovie/age-rating/false"
  val updateUrl: String = "http://localhost:9000/capmovie/update/MOV0002/age-rating"
  val title = "Age Rating"

  def ageRatingSelect: WebElement = driver.findElement(By.id("rated"))

}
