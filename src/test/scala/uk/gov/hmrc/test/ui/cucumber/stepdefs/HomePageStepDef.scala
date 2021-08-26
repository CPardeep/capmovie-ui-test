/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.HomePage

class HomePageStepDef extends BaseStepDef {

  Given("""I am on the homepage""") { () =>
    HomePage.goTo()
    HomePage.getTitle shouldBe "Home Page"
  }

  Then("""I can view the list of movies""") { () =>
    HomePage.checkListSize shouldBe true
  }
}
