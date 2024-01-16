package baseExecution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.BeforeSuite;

import com.google.gson.Gson;

import backend.pojo.request.RequestSpecificationDTO;
import io.restassured.response.Response;
import lombok.Builder;
import lombok.Getter;

public class BaseBackEnd extends RestAssuredUtility {
	
Gson gson = new Gson();
private static ThreadLocal<String> token = new ThreadLocal<String>();
private static ThreadLocal<Properties> prop = new ThreadLocal<Properties>();
//private static Properties prop =null;


public static ThreadLocal<Properties> getProp() {
	return prop;
}

public static void setProp(Properties property) {
	prop.set(property);
}

public static void setToken(String tokenValue)
{
	token.set(tokenValue);
	}

public static String getTokenKey()
{
return token.get();	

}

public Map<String, String> setHeaders()
{
Map<String, String> headers = new HashMap<String, String>();

headers.put("Content-Type", "application/json");
if(getTokenKey()!=null)
{
	headers.put("Authorization", "Bearer "+getTokenKey());
	}

return headers;

}


public void setAuthenticationToken ()
{
//First Time Token
	setToken(null);
	//do some process or first call to the aplication may be
	setToken("Test123");

}


public <T> T getResponseDTO(Response response, Class<T> tclass)
{
return gson.fromJson(response.getBody().asString(), tclass);	
}


public JSONObject convertJsonToString(String str)
{
	
	JSONParser jsonParser = new JSONParser();
	
	try
	{
		JSONObject jsonObject = (JSONObject) jsonParser.parse(str);
		return jsonObject;
		
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return null;
	 
	}


public Map<String, String> setQueryParams()
{
Map<String, String> queryParams = new HashMap<String, String>();

// To do anything common

return queryParams;

}


public RequestSpecificationDTO createRequestSpecificationObject(String uri, String method, Map<String, String> headers,
		Object tClass) {
	
	
	
	RequestSpecificationDTO requestSpecificationDTO ;
	
	requestSpecificationDTO = RequestSpecificationDTO.builder().headers(headers).uri(uri)
	.requestBody(convertJsonToString(gson.toJson(tClass))).method(method)
.build();

	
	
	return requestSpecificationDTO;
	
}

@BeforeSuite
public static void readPropertiesFile() throws IOException {
    FileInputStream fis = null;
   
    try {
       fis = new FileInputStream("C:\\Users\\atulkalra\\eclipse-workspace\\TDDFrameWorkUIAPI\\src\\main\\java\\baseExecution\\uri.properties");
    Properties   property = new Properties();
    property.load(fis);
    
    BaseBackEnd.setProp(property); 
    } catch(FileNotFoundException fnfe) {
       fnfe.printStackTrace();
    } catch(IOException ioe) {
       ioe.printStackTrace();
    } finally {
    
    }
 
   
 }

public static String readPropertyValue(String key)

{
	return  prop.get().getProperty(key);

}




}
