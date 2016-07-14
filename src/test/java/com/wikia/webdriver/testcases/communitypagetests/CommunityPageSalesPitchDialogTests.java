package com.wikia.webdriver.testcases.communitypagetests;

import com.wikia.webdriver.common.contentpatterns.PageContent;
import com.wikia.webdriver.common.core.Assertion;
import com.wikia.webdriver.common.core.annotations.Execute;
import com.wikia.webdriver.common.templates.NewTestTemplate;
import com.wikia.webdriver.pageobjectsfactory.pageobject.article.ArticlePageObject;
import com.wikia.webdriver.pageobjectsfactory.pageobject.communitypage.SalesPitchDialog;
import org.testng.annotations.Test;

@Test(groups = "CommunityPageTests")
@Execute(onWikia = "mediawiki119")
public class CommunityPageSalesPitchDialogTests extends NewTestTemplate {

  @Execute(disableCommunityPageSalesPitchDialog = "false")
  public void verifySalesPitchDialogDisplayedOnFourthPageview() {
    String articleTitle = PageContent.ARTICLE_NAME_PREFIX + ArticlePageObject.getTimeStamp();
    ArticlePageObject article = new ArticlePageObject();

    // 2nd pageview
    article.open(articleTitle);
    // 3rd pageview
    article.open(articleTitle);
    // 4th pageview
    article.open(articleTitle);

    SalesPitchDialog dialog = new SalesPitchDialog();
    Assertion.assertTrue(dialog.isDialogVisible());
  }

  @Execute(disableCommunityPageSalesPitchDialog = "false")
  public void verifyEditPageIsNotCountedAsPageview() {
    String articleTitle = PageContent.ARTICLE_NAME_PREFIX + ArticlePageObject.getTimeStamp();
    ArticlePageObject article = new ArticlePageObject();

    // 2nd pageview
    article.open(articleTitle);
    article.navigateToArticleEditPage();

    // 3rd pageview
    article.open(articleTitle);
    article.navigateToArticleEditPage();

    // 4th pageview
    article.open(articleTitle);

    SalesPitchDialog dialog = new SalesPitchDialog();
    Assertion.assertTrue(dialog.isDialogVisible());
  }

  @Execute(disableCommunityPageSalesPitchDialog = "false")
  public void verifyClickHelpOutButtonRedirectToSpecialCommunity() {
    String articleTitle = PageContent.ARTICLE_NAME_PREFIX + ArticlePageObject.getTimeStamp();
    ArticlePageObject article = new ArticlePageObject();

    // 2nd pageview
    article.open(articleTitle);
    // 3rd pageview
    article.open(articleTitle);
    // 4th pageview
    article.open(articleTitle);

    SalesPitchDialog dialog = new SalesPitchDialog();
    Assertion.assertTrue(dialog.clickHelpOutButton().isCommunityPageOpen());
  }

  @Execute(disableCommunityPageSalesPitchDialog = "false")
  public void verifyDialogImageRedirectToSpecialCommunity() {
    String articleTitle = PageContent.ARTICLE_NAME_PREFIX + ArticlePageObject.getTimeStamp();
    ArticlePageObject article = new ArticlePageObject();

    // 2nd pageview
    article.open(articleTitle);
    // 3rd pageview
    article.open(articleTitle);
    // 4th pageview
    article.open(articleTitle);

    SalesPitchDialog dialog = new SalesPitchDialog();
    Assertion.assertTrue(dialog.clickDialogImage().isCommunityPageOpen());
  }

  @Execute(disableCommunityPageSalesPitchDialog = "false")
  public void verifyDialogContentRedirectToSpecialCommunity() {
    String articleTitle = PageContent.ARTICLE_NAME_PREFIX + ArticlePageObject.getTimeStamp();
    ArticlePageObject article = new ArticlePageObject();

    // 2nd pageview
    article.open(articleTitle);
    // 3rd pageview
    article.open(articleTitle);
    // 4th pageview
    article.open(articleTitle);

    SalesPitchDialog dialog = new SalesPitchDialog();
    Assertion.assertTrue(dialog.clickDialogContent().isCommunityPageOpen());
  }

  public void verifySalesPitchDialogIsNotShownIfCookieIsSet() {
    String articleTitle = PageContent.ARTICLE_NAME_PREFIX + ArticlePageObject.getTimeStamp();
    ArticlePageObject article = new ArticlePageObject();

    // 2nd pageview
    article.open(articleTitle);
    // 3rd pageview
    article.open(articleTitle);
    // 4th pageview
    article.open(articleTitle);

    SalesPitchDialog dialog = new SalesPitchDialog();
    dialog.isDialogNotVisible();
  }
}
