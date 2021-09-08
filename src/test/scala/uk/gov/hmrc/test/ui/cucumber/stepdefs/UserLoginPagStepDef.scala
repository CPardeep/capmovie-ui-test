/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{HomePage, UserLogin}

class UserLoginPagStepDef extends BaseStepDef {
  Given("""that I am on the user Login Page""") { () =>
    UserLogin.goTo()
    UserLogin.getTitle shouldBe UserLogin.title
  }

  When("""I fill in the username and password field""") { () =>
    UserLogin.inputId("USER0001")
    UserLogin.inputPassword("PASS")
  }

  And("""I click the Login""") { () =>
    UserLogin.submit()
  }

  Then("""I am navigated to the home page where a list movies are displayed""") { () =>
    HomePage.getTitle shouldBe HomePage.title
  }
}
