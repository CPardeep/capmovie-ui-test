/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages._

class ReviewRatingStepDef extends BaseStepDef {

  Given("""I am logged in a user""") { () =>
    UserLogin.goTo()
    UserLogin.inputId("USER0001")
    UserLogin.inputPassword("PASS")
    UserLogin.submit()
    HomePage.getTitle shouldBe HomePage.title
  }
  And("""I am on the movie page""") { () =>
    HomePage.firstMovie.click()
    ViewOnePage.getTitle shouldBe ViewOnePage.title2
  }
  When("""I submit a rating""") { () =>
    ViewOnePage.addReviewButton.click()
    RatingPage.rating2.click()
    RatingPage.clickContinue()
  }
  And("""I submit a review""") { () =>
    ReviewPage.inputReview
    ReviewPage.clickSubmit
  }
  Then("""I am redirected to the Review Summary Page""") { () =>
    ReviewSummaryPage.getTitle shouldBe ReviewSummaryPage.title
    ReviewSummaryPage.getUrl shouldBe ReviewSummaryPage.getUrl
  }
  Given("""I am on the Review Summary page""") { () =>
  }
  When("""I confirm that details are correct and submit it""") { () =>
    ReviewSummaryPage.ratingValue.getText shouldBe "2.0"
    ReviewSummaryPage.reviewValue.getText shouldBe "TESTREVIEW"
    ReviewSummaryPage.clickContinue()
  }
  Then("""I redirected to the Review Success page""") { () =>
    ReviewSuccessPage.getUrl shouldBe ReviewSuccessPage.url
    ReviewSuccessPage.getTitle shouldBe ReviewSuccessPage.title
  }
  Given("""a movie already has one review and rating""") { () =>
  }
  When("""another user adds a new rating""") { () =>
    UserLogin.goTo()
    UserLogin.inputId("USER0002")
    UserLogin.inputPassword("PASS")
    UserLogin.submit()
    HomePage.firstMovie.click()
    ViewOnePage.addReviewButton.click()
    RatingPage.rating5.click()
    RatingPage.clickContinue()
    ReviewPage.inputReview
    ReviewPage.clickSubmit
    ReviewSummaryPage.clickContinue()
    ReviewSuccessPage.returnHomeButton.click()
  }
  Then("""the updated Average User Rating is displayed on the movie page""") { () =>
    HomePage.firstMovie.click()
    ViewOnePage.avgRating.getText shouldBe "3.5"
  }
}
