/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object MovieRegPlotPage extends BasePage {
  val url: String = "http://localhost:9000/capmovie/movie-plot/false"
  val updateUrl: String = "http://localhost:9000/capmovie/update/MOV0002/plot"
  val title = "Add a Plot"
  val moviePlot = "Test Plot"

  def getPlotInput: WebElement = driver.findElement(By.id("plot"))

  def inputMoviePlot(): Unit = {
    getPlotInput.sendKeys(moviePlot)
  }
}
