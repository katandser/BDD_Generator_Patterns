Feature: createPatterns
  Scenario: createDefaultJavaSingleton
    Given createObjectGeneratorPatternsJava
    When callMethodcreateSingleton
    Then hisReturnString

  Scenario: createDefaultJavaSingletonRight
    Given createObjectGeneratorPatternsJava
    When callMethodcreateSingleton
    Then hisReturnStringWithCodeSingleton

  Scenario: createJavaSingletonWithA
    Given createObjectGeneratorPatternsJava
    When callMethodcreateSingletonWithA
    Then hisReturnStringSingletonA

  Scenario: createJavaSingletonWithARight
    Given createObjectGeneratorPatternsJava
    When callMethodcreateSingletonWithA
    Then hisReturnStringWithRightCodeSingletonA

  Scenario: createJavaSingletonWithSingleton
    Given createObjectGeneratorPatternsJava
    When callMethodcreateSingletonWithSingleton
    Then hisReturnStringWithRightCodeSingletonSingleton

  Scenario: createJavaSingletonWithYES
    Given createObjectGeneratorPatternsJava
    When callMethodcreateSingletonWithYES
    Then hisReturnStringWithRightCodeSingletonYES
