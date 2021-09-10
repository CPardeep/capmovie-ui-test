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

  Then("""I am redirected to the Add Age Rating page""") { () =>
    MovieRegAgeRatingPage.getTitle shouldBe MovieRegAgeRatingPage.title
  }

  Then("""I am redirected to the update age rating page""") { () =>
    MovieRegAgeRatingPage.getUrl shouldBe MovieRegAgeRatingPage.updateUrl
  }

  Given("""I am on the update age rating page""") { () =>
  }


}
