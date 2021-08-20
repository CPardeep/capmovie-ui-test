/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.driver.BrowserDriver

trait BasePage extends Matchers with BrowserDriver {
  val url: String

  def goTo(): Unit = {
    driver.navigate.to(url)
  }

  def getTitle(): String = {
    driver.getTitle
  }
}
