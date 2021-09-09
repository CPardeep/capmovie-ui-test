/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{HomePage, ViewOnePage}

class MoviePageStepDef extends BaseStepDef {

  When("""I click on a movie link""") { () =>
    HomePage.firstMovie.click()
  }
  Then("""I am redirected to that movies page""") { () =>
    eventually {
      ViewOnePage.getTitle shouldBe ViewOnePage.title
    }
  }
  When("""I click update on a movie page""") { () =>
    HomePage.firstMovie.click()
    ViewOnePage.updateButton.click()
  }

  And("""the updated details are displayed""") { () =>
    ViewOnePage.checkRatedValue("U")
    ViewOnePage.checkTextExists("genre2") shouldBe true
  }

  Then("""I am redirected back to the movie page""") { () =>
    ViewOnePage.getTitle shouldBe "The Land Beyond the Sunset"
  }

}
