/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object ReviewSuccessPage extends BasePage {
  val url: String = "http://localhost:9001/capmovie/movie/MOV0002/create/review/sudmit?"
  val title = "Add a Review Success"

  def returnHomeButton: WebElement = driver.findElement(By.id("home-page"))


}
