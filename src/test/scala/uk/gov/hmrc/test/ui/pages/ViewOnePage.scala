/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object ViewOnePage extends BasePage {
  val url: String = "http://localhost:9001/capmovie/movie/MOV0001"
  val title: String = "The Navigator"
  val title2: String = "The Land Beyond the Sunset"

  def movieName: WebElement = driver.findElement(By.id("title"))
  def deleteButton: WebElement = driver.findElement(By.id("delete"))
  def updateButton: WebElement = driver.findElement(By.id("update"))
  def addReviewButton: WebElement = driver.findElement(By.id("add-review"))
  def avgRating: WebElement = driver.findElement(By.id("avg-rating"))

  def checkRatedValue(rating: String): Boolean = driver.findElement(By.id("rated")).getText.contains(rating)
  def checkTextExists(str: String): Boolean = driver.getPageSource.contains(str)
}
