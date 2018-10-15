$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("any-client_orderProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Any client - Order Product",
  "description": "\r\nA client want to order a guitar on our store",
  "id": "any-client---order-product",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "guitar available",
  "description": "",
  "id": "any-client---order-product;guitar-available",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "I\u0027m authenticated as \"\u003cfirst_name_client\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "\"\u003cguitar_model\u003e\" is in number of \"\u003cstock_before\u003e\" in the stock",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I try to order a \"\u003cguitar_model\u003e\" which is \"\u003cavailability\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the order is register",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "the \"\u003cguitar_model\u003e\" is now in number of \"\u003cstock_after\u003e\" in the stock",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "any-client---order-product;guitar-available;",
  "rows": [
    {
      "cells": [
        "first_name_client",
        "guitar_model",
        "stock_before",
        "availability",
        "stock_after"
      ],
      "line": 24,
      "id": "any-client---order-product;guitar-available;;1"
    },
    {
      "cells": [
        "Fleur",
        "Custom 24",
        "10",
        "true",
        "9"
      ],
      "line": 25,
      "id": "any-client---order-product;guitar-available;;2"
    },
    {
      "cells": [
        "Fleur",
        "KH Demonology",
        "4",
        "true",
        "3"
      ],
      "line": 26,
      "id": "any-client---order-product;guitar-available;;3"
    },
    {
      "cells": [
        "Roger",
        "KH White Zombie",
        "6",
        "true",
        "5"
      ],
      "line": 27,
      "id": "any-client---order-product;guitar-available;;4"
    },
    {
      "cells": [
        "Adrienne",
        "Custom 24",
        "9",
        "true",
        "8"
      ],
      "line": 28,
      "id": "any-client---order-product;guitar-available;;5"
    }
  ],
  "keyword": "Examples"
});
});