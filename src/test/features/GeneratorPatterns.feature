Feature: createPatterns
  Scenario: createDefaultJavaSingleton
    Given createObjectGeneratorPatternsJava
    When callMethodcreateSingleton
    Then hisReturnString
  Scenario: createDefaultJavaSingletonRight
    Given createObjectGeneratorPatternsJava
    When callMethodcreateSingleton
    Then hisReturnStringWithCodeSingleton