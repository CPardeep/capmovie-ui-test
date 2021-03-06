/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{MovieRegGenresConfPage, MovieRegGenresPage}

class MoveRegGenresStepDef extends BaseStepDef {
  Given("""I am on the Add Movie Genres page""") { () =>
    MovieRegGenresPage.goTo()
  }

  When("""I submit a movie genre""") { () =>
    MovieRegGenresPage.inputMovieGenres("genre1")
    MovieRegGenresPage.clickContinue()
  }

  Then("""I am redirected to the Genres Confirmation page""") { () =>
    MovieRegGenresConfPage.getTitle shouldBe "Genres Confirmation Page"
  }

  Given("""I have already added one movie genre""") { () =>
  }

  When("""I submit another movie genre""") { () =>
    MovieRegGenresConfPage.addAnotherButton.click()
    MovieRegGenresPage.inputMovieGenres("genre2")
    MovieRegGenresPage.clickContinue()
  }

  Then("""both genres are listed on the Genres Confirmation page""") { () =>
    MovieRegGenresConfPage.getGenresCount shouldBe 2
  }

  Given("""I am on the Genres Confirmation page with two genres""") { () =>
  }

  When("""I remove a genre""") { () =>
    MovieRegGenresConfPage.removeGenre.click()
  }

  Then("""there should be one genre left""") { () =>
    MovieRegGenresConfPage.getGenresCount shouldBe 1
  }

  And("""I remain on the same page""") { () =>
    MovieRegGenresConfPage.getTitle shouldBe MovieRegGenresConfPage.title
  }

  Given("""I am on the Genres Confirmation page""") { () =>
  }

  Given("""I confirm genres by clicking continue""") { () =>
    MovieRegGenresConfPage.clickContinue()
  }

  Then("""I am redirected to the Add Genres page""") { () =>
    eventually {
      MovieRegGenresPage.getTitle shouldBe MovieRegGenresPage.title
    }
  }
  Then("""I am redirected to the update genres confirmation page""") { () =>
    MovieRegGenresConfPage.getUrl should include regex MovieRegGenresConfPage.updateUrl
  }

  Given("""I am on the update genres confirmation page""") { () =>
  }

  When("""I click continue""") { () =>
    MovieRegGenresConfPage.clickContinue()
  }

  Then("""the new genre is listed on the confirmation page""") { () =>
    MovieRegGenresConfPage.getLastGenre shouldBe "genre2"
  }


}
