/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.driver.BrowserDriver

trait BasePage extends Matchers with BrowserDriver {
  val url: String
  val updateUrl: String = "http://localhost:9000/capmovie/update/"

  def getUrl: String = driver.getCurrentUrl

  def goTo(): Unit = {
    driver.navigate.to(url)
  }

  def getTitle: String = {
    driver.getTitle
  }

  def clickContinue(): Unit = {
    driver.findElement(By.id("next-button")).click()
  }
}
