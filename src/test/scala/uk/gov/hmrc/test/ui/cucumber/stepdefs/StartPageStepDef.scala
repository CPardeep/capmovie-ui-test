/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{HomePage, StartPage}

class StartPageStepDef extends BaseStepDef {
  Given("""I am on the startPage""") { () =>
    StartPage.goTo()
    StartPage.getTitle shouldBe StartPage.title
  }

  When("""I click on view all movies""") { () =>
    StartPage.button.click()
  }

  Then("""I am moved to homepage""") { () =>
    eventually {
      StartPage.getTitle shouldBe HomePage.title
    }
  }
}
