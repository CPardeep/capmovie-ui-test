/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegSubmissionConfPage extends BasePage {

  val url: String = "http://localhost:9000/capmovie/submit"
  val title = "Add a Movie Success"

  def returnToHomeButton: WebElement = driver.findElement(By.linkText("Return to home"))
  def addAnotherMovieButton: WebElement = driver.findElement(By.id("add-another-movie-button"))

}
