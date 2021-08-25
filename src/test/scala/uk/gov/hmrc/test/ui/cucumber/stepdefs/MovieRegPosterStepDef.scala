/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.MovieRegPosterPage

class MovieRegPosterStepDef extends BaseStepDef {

  Given("""I am on the Add Movie Poster page""") { () =>
    MovieRegPosterPage.goTo()
  }
  When("""I input the movie poster URL""") { () =>
    MovieRegPosterPage.inputMoviePoster()
  }
  Then("""I am redirected to the Add Movie Poster page""") { () =>
    eventually {
      MovieRegPosterPage.getTitle shouldBe MovieRegPosterPage.title
    }
  }
}
