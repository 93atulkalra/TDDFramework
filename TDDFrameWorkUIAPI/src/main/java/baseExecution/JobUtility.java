package baseExecution;

import backend.pojo.request.JobDTO;
import backend.pojo.request.RequestSpecificationDTO;
import io.restassured.response.Response;

public class JobUtility extends BaseBackEnd {
	
	String jobAPIURI= readPropertyValue("postcall");
	
	//String jobAPIURI= "https://reqres.in/api/users";
	public Response getJobAPIResponse(String name, String job)

	{
		JobDTO jobDTO = JobDTO.builder().job(job).name(name).build();	
		RequestSpecificationDTO requestSpecificationDTO = createRequestSpecificationObject(jobAPIURI,"POST", setHeaders(), jobDTO);
		Response response = RestAssuredUtility.callAPI(requestSpecificationDTO, null);
		
		return response;
		
		
	}

	

}
