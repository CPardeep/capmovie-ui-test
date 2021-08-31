/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{AdminLogin, HomePage}

class LoginPageStefDef extends BaseStepDef {
  Given("""that I am on the Login Page""") { () =>
    AdminLogin.goTo()
    AdminLogin.getTitle shouldBe AdminLogin.title
  }

  When("""I fill in the username and password fields with valid credentials""") { () =>
    AdminLogin.inputId("ADMIN0001")
    AdminLogin.inputPassword("PASS")
  }

  And("""I click the Login button""") { () =>
    AdminLogin.submit()
  }

  Then("""I am navigated to the home page where a list movies are shown""") { () =>
    AdminLogin.getTitle shouldBe HomePage.title

  }

}
