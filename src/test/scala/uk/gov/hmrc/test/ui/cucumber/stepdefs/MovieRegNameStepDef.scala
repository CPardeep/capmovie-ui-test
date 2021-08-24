/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.MovieRegTitlePage

class MovieRegNameStepDef extends BaseStepDef {

  Given("""I am on the Add Movie Title page""") { () =>
    MovieRegTitlePage.goTo()
  }

  When("""I input the movie Title""") { () =>
    MovieRegTitlePage.inputMovieTitle()
  }

  When("""I click Save and Continue""") { () =>
    MovieRegTitlePage.submitButton.click()
  }

  Then("""I am redirected to the same page""") { () =>
    eventually {
      MovieRegTitlePage.getTitle shouldBe MovieRegTitlePage.title
    }
  }

}
