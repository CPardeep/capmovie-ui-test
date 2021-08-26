/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.MovieRegAgeRatingPage

class MovieRegAgeRatingStepDef extends BaseStepDef {
  Given("""I am on the Add Age Rating page""") { () =>
    MovieRegAgeRatingPage.goTo()
  }
  When("""I submit an age rating for the movie""") { () =>
    MovieRegAgeRatingPage.ageRatingSelect.click()
    MovieRegAgeRatingPage.clickContinue()
  }

  Then("""I am redirected to the Age Rating page""") { () =>
    eventually {
      MovieRegAgeRatingPage.getTitle shouldBe MovieRegAgeRatingPage.title
    }
  }



}
