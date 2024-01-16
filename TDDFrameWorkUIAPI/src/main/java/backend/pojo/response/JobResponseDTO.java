package backend.pojo.response;

import java.util.Date;

import lombok.Data;

@Data
public class JobResponseDTO {
	
	  public String name;
	    public String job;
	    public String id;
	    public Date createdAt;

}
