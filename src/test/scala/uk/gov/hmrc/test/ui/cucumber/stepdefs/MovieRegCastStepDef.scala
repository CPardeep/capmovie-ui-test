/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{MovieRegCastConfPage, MovieRegCastPage, MovieRegSummaryPage}

class MovieRegCastStepDef extends BaseStepDef {

  Given("""I am on the Add Movie Cast page""") { () =>
    MovieRegCastPage.goTo()
  }

  When("""I submit a cast member""") { () =>
    MovieRegCastPage.inputMovieCast("Test Cast1")
    MovieRegCastPage.clickContinue()
  }

  Then("""I am redirected to the Cast Confirmation page""") { () =>
    MovieRegCastConfPage.getTitle shouldBe MovieRegCastConfPage.title
  }

  Given("""I have already added one cast member for this movie""") { () =>

  }

  When("""I submit another cast member""") { () =>
    MovieRegCastConfPage.addAnotherButton.click()
    MovieRegCastPage.inputMovieCast("Test Cast2")
    MovieRegCastPage.clickContinue()
  }

  Then("""both cast members are listed on the Cast Confirmation page""") { () =>
    MovieRegCastConfPage.getCastCount shouldBe 2
  }

  Given("""I am on the Cast Confirmation page with two genres""") { () =>
  }

  When("""I remove a cast member""") { () =>
    MovieRegCastConfPage.removeCast.click()
  }

  Then("""there should be one cast member listed""") { () =>
    MovieRegCastConfPage.getCastCount shouldBe 1
  }

  And("""I remain on the Cast Confirmation Page""") { () =>
    MovieRegCastConfPage.getTitle shouldBe MovieRegCastConfPage.title
  }

  Given("""I am on the Cast Confirmation page""") { () =>

  }

  When("""I confirm the cast by clicking continue""") { () =>
    MovieRegCastConfPage.clickContinue()
  }

  Then("""I am redirected to the Summary page""") { () =>
    MovieRegSummaryPage.getTitle shouldBe MovieRegSummaryPage.title
  }


}
