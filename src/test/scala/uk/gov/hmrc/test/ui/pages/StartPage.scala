/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

import java.util

object StartPage extends BasePage {

  val url: String = "http://localhost:9001/capmovie/start"
  val title = "Start Page"

  def button: WebElement = driver.findElement(By.id("startMovie"))

}
