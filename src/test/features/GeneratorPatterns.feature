Feature: createPatterns
  Scenario: createDefaultJavaSingleton
    Given createObjectGeneratorPatternsJava
    When callMethodcreateSingleton
    Then hisReturnString
