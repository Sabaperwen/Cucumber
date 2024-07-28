package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="features/Login.features"
,glue={"stepDefination"}
,plugin = {"pretty","html:test-output"})

public class TestRunner{

}
