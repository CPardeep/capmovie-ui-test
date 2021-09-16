/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{MovieRegAgeRatingPage, MovieRegCastConfPage, MovieRegPlotPage, MovieRegPosterPage}

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

  Then("""I am redirected to the Plot page""") { () =>
    eventually {
      MovieRegAgeRatingPage.getTitle shouldBe MovieRegPlotPage.title
    }
  }

  Then("""I am redirected to the update plot page""") { () =>
    eventually {
      MovieRegPlotPage.getUrl should include regex MovieRegPlotPage.updateUrl
    }
  }

  Given("""I am on the update plot page""") { () =>
  }

  When("""I click continue on the plot, poster and cast confirmation page without making any changes""") { () =>
    MovieRegPlotPage.clickContinue()
    MovieRegPosterPage.clickContinue()
    MovieRegCastConfPage.clickContinue()
  }

}
