/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{MovieRegPlotPage, MovieRegPosterPage}

class MovieRegPlotStepDef extends BaseStepDef {

  Given("""I am on the Add Movie Plot page""") { () =>
    MovieRegPlotPage.goTo()
  }

  When("""I submit the movie plot""") { () =>
    MovieRegPlotPage.inputMoviePlot()
    MovieRegPlotPage.clickContinue()
  }

  Then("""I am redirected to the Add Movie Poster page""") { () =>
    eventually {
      MovieRegPlotPage.getTitle shouldBe MovieRegPosterPage.title
    }
  }

}
