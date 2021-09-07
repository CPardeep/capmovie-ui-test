/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object DeleteAreYouSurePage extends BasePage {
  val url: String = "http://localhost:9001/capmovie/delete/MOV0001"
  val title = "The Navigator Delete"
  def confirmButton: WebElement = driver.findElement(By.id("confirm"))

}
