package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.StoreEndPoints;
import api.payload.Store;
import io.restassured.response.Response;

public class StoreTests {
	
	Faker faker;
	Store storepayload;
	@BeforeClass
	public void setup() {
		faker=new Faker();
		storepayload=new Store();
		
		storepayload.setId(faker.number().numberBetween(1, 10));
		storepayload.setPetId(faker.idNumber().hashCode());
		storepayload.setQuantity(faker.idNumber().hashCode());
			
	}
	
	@Test(priority = 1)
	public void testPostUser() {
		Response response=StoreEndPoints.CreateUser(storepayload);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority=2)
	public void testGetUser() {
		Response response =StoreEndPoints.GetUser(this.storepayload.getId());
		response.then().log().body();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	/*@Test(priority=3)
	public void testUpdateUser() {
		storepayload.setQuantity(faker.idNumber().hashCode());
		storepayload.setComplete("false");
		Response response=StoreEndPoints.UpdateUser(this.storepayload.getId(), storepayload);
		response.then().log().all();
		//Assert.assertEquals(response.getStatusCode(), 200);
		//After updating 
		Response responseafterUpadte=StoreEndPoints.GetUser(this.storepayload.getId());
		responseafterUpadte.then().log().body();

		
	}*/
	
	@Test(priority=3)
	public void testDeleteUser() {
		
		Response response=StoreEndPoints.DeleteUser(this.storepayload.getId());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}

}
