/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.MovieRegNamePage

class MovieRegNameStepDef extends BaseStepDef {

  Given("""I am on the Add Movie name page""") { () =>
    MovieRegNamePage.goTo()
  }

  When("""I input the movie name""") { () =>
    MovieRegNamePage.inputMovieName()
  }

  When("""I click Save and Continue""") { () =>
    MovieRegNamePage.submitButton.click()
  }

  Then("""I am redirected to the same page""") { () =>
    eventually {
      MovieRegNamePage.getTitle shouldBe MovieRegNamePage.title
    }
  }

}
