package Testrunner;

import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\feature folder\\orange.feature",
tags= {"@tc_05"},
glue= {"stepdefinition"},
monochrome=true
)
public class searchTR
{

}
