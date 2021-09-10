/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object DeleteSuccessfulPage extends BasePage {
  val url: String = "http://localhost:9001/capmovie/delete/confirmed/MOV0001"
  val title: String = "Delete Successful"

  def confirmButton: WebElement = driver.findElement(By.id("confirm"))
}
