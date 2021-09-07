/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.AdminLogin.driver

object UserLogin extends BasePage {
  override val url: String = "http://localhost:9001/capmovie/login"

  val title = "Login Page"

  def inputId(id: String): Unit = driver.findElement(By.id("id")).sendKeys(id)

  def inputPassword(password: String): Unit = driver.findElement(By.id("password")).sendKeys(password)

  def submit(): Unit = driver.findElement(By.id("submit")).click()
}
