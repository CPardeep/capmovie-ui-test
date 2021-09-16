/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{HomePage, ViewOnePage}

class MoviePageStepDef extends BaseStepDef {

  Given("""I am on a movie page""") { () =>
    HomePage.goTo()
    HomePage.firstMovie.click()
  }
  When("""I click on a movie link""") { () =>
    HomePage.firstMovie.click()
  }
  Then("""I am redirected to that movies page""") { () =>
    eventually {
      ViewOnePage.getTitle shouldBe "The Land Beyond the Sunset"
    }
  }
  When("""I click update on a movie page""") { () =>
    HomePage.lastMovie.click()
    ViewOnePage.updateButton.click()
  }

  And("""the updated details are displayed""") { () =>
    ViewOnePage.checkRatedValue("PG")
    ViewOnePage.checkTextExists("genre2") shouldBe true
  }

  Then("""I am redirected back to the movie page""") { () =>
    ViewOnePage.getTitle shouldBe "TestTitle1"
  }

}
