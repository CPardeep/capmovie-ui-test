/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By

object ReviewSummaryPage extends BasePage {
  val url: String = "http://localhost:9001/capmovie/movie/MOV0002/create/review/summary"
  val title = "Review Summary"

  def ratingValue = driver.findElement(By.cssSelector("dl.govuk-summary-list>div:first-child>dd"))
  def reviewValue = driver.findElement(By.cssSelector("dl.govuk-summary-list>div:last-child>dd"))


}
