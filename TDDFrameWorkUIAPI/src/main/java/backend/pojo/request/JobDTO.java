package backend.pojo.request;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobDTO {

	 public String name;
	    public String job;
}