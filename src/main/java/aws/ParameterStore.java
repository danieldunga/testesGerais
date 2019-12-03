package aws;

import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClient;
import com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest;
import com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult;

public class ParameterStore {
	
	

	public static void main(String[] args) {
		System.out.println(new ParameterStore().isNewAdjustments());
	}
	
	public boolean isNewAdjustments() {
		
		boolean useNew = true;
		
		try {			
			String nomeParametro = "NewAdjustments";
			
			AWSSimpleSystemsManagement awsSimpleSystemsManagement = AWSSimpleSystemsManagementClient.builder().build();
			GetParameterRequest getparameterRequest = new GetParameterRequest().withName(nomeParametro);
			
			GetParameterResult result = awsSimpleSystemsManagement.getParameter(getparameterRequest);
			
			if (!result.getParameter().getValue().equalsIgnoreCase("true")) {
				useNew = false;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return useNew;
	}

}
