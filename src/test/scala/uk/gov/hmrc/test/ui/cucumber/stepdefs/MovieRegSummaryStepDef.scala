/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{MovieRegSubmissionConfPage, MovieRegSummaryPage}

class MovieRegSummaryStepDef extends BaseStepDef {

  Given("""I am on the Movie Summary page after entering valid details for a movie""") { () =>
    MovieRegSummaryPage.goTo()
    MovieRegSummaryPage.getTitle shouldBe MovieRegSummaryPage.title

  }

  When("""I have confirmed the movie details match what has been inputted""") { () =>
    MovieRegSummaryPage.getMovieTitle.getText shouldBe "TestTitle"
    MovieRegSummaryPage.getMovieGenres.getText shouldBe "genre2"
    MovieRegSummaryPage.getMovieAgeRating.getText shouldBe "U"
    MovieRegSummaryPage.getMoviePlot.getText shouldBe "Test Plot"
    MovieRegSummaryPage.getMoviePoster.getText shouldBe "TestURL"
    MovieRegSummaryPage.getMovieCast.getText shouldBe "Test Cast2"

  }

  And("""I click the submit button""") { () =>
    MovieRegSummaryPage.clickContinue()
  }

  Then("""I am redirected to the Submission Confirmation Page""") { () =>
  MovieRegSubmissionConfPage.getTitle shouldBe MovieRegSubmissionConfPage.title
  }
}
