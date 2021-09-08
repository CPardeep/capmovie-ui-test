/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{MovieRegGenresPage, MovieRegPlotPage, MovieRegTitlePage}

class MovieRegTitleStepDef extends BaseStepDef {

  Given("""I am on the Add Movie Title page""") { () =>
    MovieRegTitlePage.goTo()
  }

  When("""I submit the movie Title""") { () =>
    MovieRegTitlePage.inputMovieTitle()
    MovieRegTitlePage.clickContinue()
  }

  And ("""I update the Movie Title""") { () =>
    MovieRegTitlePage.titleInput.clear()
    MovieRegTitlePage.inputUpdatedMovieTitle()
    MovieRegTitlePage.clickContinue()
  }


  Then("""I am redirected to the Add Genres page""") { () =>
    eventually {
      MovieRegTitlePage.getTitle shouldBe MovieRegGenresPage.title
    }
  }

}
