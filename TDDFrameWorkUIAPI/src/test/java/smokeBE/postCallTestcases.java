package smokeBE;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import backend.pojo.response.JobResponseDTO;
import baseExecution.BaseBackEnd;
import baseExecution.JobUtility;
import io.restassured.response.Response;

public class postCallTestcases extends BaseBackEnd{
	
	@Test
	//DataProvider foe fetchig body
	public void validateNamePostAPI()
	{
		String job="SSE";
		String name="AK";
		BaseBackEnd be = new BaseBackEnd();
		SoftAssert sa = new SoftAssert();	
		be.setAuthenticationToken();
		
		JobUtility jobobj = new JobUtility();
		Response response = jobobj.getJobAPIResponse(name, job);
		
		System.out.println(response.getStatusCode());
		JobResponseDTO jobresponse = jobobj.getResponseDTO(response, JobResponseDTO.class);
		
		System.out.println(jobresponse.getId());
		
		System.out.println(response.getBody().asPrettyString());
	
		
		sa.assertAll();
		
	}

}
