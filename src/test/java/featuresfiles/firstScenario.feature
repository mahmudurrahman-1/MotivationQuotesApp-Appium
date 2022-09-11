Feature: test
  Background: 01 Explore Quotes By Categories
    Given Sultan on home page after opening "Motivational Quotes" mobile app
    When Sultan click "Explore" from top list from home page
    And Sultan click to "Nature" from categories
    And Sultan goes "Nothing Better...." image
  Then Sultan click "Like" icon, "Save" button , and click "Download"

  Scenario: 01 Explore Quotes By Categories

  Given Sultan on home page after opening "Motivational Quotes mobile" app
  When Sultan click "Explore" from top list from home page
  And Sultan go to "Self Love" from Explore Page And: Sultan Select "Nobody is ever" image quotes from Self Love category
  Then Sultan click "Download"