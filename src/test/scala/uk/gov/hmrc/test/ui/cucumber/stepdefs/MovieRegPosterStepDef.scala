/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{MovieRegAgeRatingPage, MovieRegPosterPage}

class MovieRegPosterStepDef extends BaseStepDef {

  Given("""I am on the Add Movie Poster page""") { () =>
    MovieRegPosterPage.goTo()
  }
  When("""I submit the movie poster URL""") { () =>
    MovieRegPosterPage.inputMoviePoster()
    MovieRegPosterPage.clickContinue()
  }
  Then("""I am redirected to the Add Movie Age Rating page""") { () =>
    eventually {
      MovieRegPosterPage.getTitle shouldBe MovieRegAgeRatingPage.title
    }
  }
}
