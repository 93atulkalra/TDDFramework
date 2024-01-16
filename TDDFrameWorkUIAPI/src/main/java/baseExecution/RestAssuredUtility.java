package baseExecution;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.google.gson.Gson;

import backend.pojo.request.RequestSpecificationDTO;
import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class RestAssuredUtility {
	
	public static <T> T callAPI(RequestSpecificationDTO requestSpecificationDTO, Class<T> tclass)
	{
	    Response response =null;
	    Gson gson=new Gson();
	
	    RequestSpecification requestSpecification = requestSpecificationCreation(requestSpecificationDTO);
	    
	    switch(requestSpecificationDTO.getMethod()) {
	    case "GET":
	    		response = requestSpecification.get();
	    		break;
	    		
	    case "POST":
	    	response = requestSpecification.post();
	    	break;
	    	
	    }
	    
	    if(tclass!=null ) return gson.fromJson(response.getBody().asString(), tclass);
	    	
	    else return (T) response;
	    
	}
	
	public static RequestSpecification requestSpecificationCreation(RequestSpecificationDTO requestSpecificationDTO)
	{
		RequestSpecification requestSpecification = RestAssured.given();
		
		if(requestSpecificationDTO.getHeaders()!=null)
			requestSpecification.headers(requestSpecificationDTO.getHeaders());
		
		if(requestSpecificationDTO.getUri()!=null)
			requestSpecification.baseUri(requestSpecificationDTO.getUri());
		
		if(requestSpecificationDTO.getContentType()!=null)
			requestSpecification.contentType(requestSpecificationDTO.getContentType());
		
		if(requestSpecificationDTO.getRequestBody()!=null)
			requestSpecification.body(requestSpecificationDTO.getRequestBody());
		
	
		
		requestSpecification.relaxedHTTPSValidation();
		return requestSpecification;
		
	}
	
	
	      
	 

}
