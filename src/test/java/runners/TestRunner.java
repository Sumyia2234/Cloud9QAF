package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	features = 	"Feature",
	glue = "steps",
	tags="@googlesearch" ,
	plugin ="pretty",
	monochrome = true
	)
public class TestRunner extends AbstractTestNGCucumberTests {

}
