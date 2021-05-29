package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(dryRun=false,features= {"src/test/java/assignmentfeatures/CreateInc.feature",
			"src/test/java/assignmentfeatures/DeleteIncident.feature","src/test/java/assignmentfeatures/CreateProposal.feature"},glue= {"assignmentstepdefs"},monochrome=true)

	public class AssignmentCucumberRunner extends AbstractTestNGCucumberTests {

	}

