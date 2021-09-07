/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object ViewOnePage extends BasePage {
  val url: String = "http://localhost:9001/capmovie/movie/MOV0001"
  val title: String = "The Navigator"

  def movieName: WebElement = driver.findElement(By.id("title"))
  def deleteButton = driver.findElement(By.id("delete"))
}
