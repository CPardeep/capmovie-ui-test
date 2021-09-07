/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{DeleteAreYouSurePage, DeleteSuccessfulPage, ViewOnePage}

class DeleteMovieStepDef extends BaseStepDef {

  And("""I click delete""") { () =>
    ViewOnePage.deleteButton.click()
  }
  And("""I click confirm""") { () =>
    DeleteAreYouSurePage.title shouldBe driver.getTitle
    DeleteAreYouSurePage.confirmButton.click()
  }
  Then("""I will be on the delete success page""") { () =>
    DeleteSuccessfulPage.title shouldBe driver.getTitle
  }
}
