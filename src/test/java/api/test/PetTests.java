package api.test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.PetEndPoints;
import api.payload.Pet;
import io.restassured.response.Response;

public class PetTests {
	
	Faker faker;
	Pet petpayload ;
	@BeforeClass
	public void setup() {
		
		faker =new Faker();
		petpayload= new Pet();
		
		petpayload.setId(faker.number().numberBetween(1, 30));
		petpayload.setName(faker.animal().name());
		//petpayload.setName(faker.name().name());
		
	}
	@Test(priority=1)
	public void testCreateStore() {
		
		Response response=PetEndPoints.CreateUser(petpayload);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 2)
	public void testGetStore() {
		Response response =PetEndPoints.GetUser(this.petpayload.getId());
		response.then().log().body();
		Assert.assertEquals(response.getStatusCode(),200);
	}
	
	@Test(priority = 3)
	public void testUpdateStore() {
		petpayload.setName(faker.animal().name());
		//petpayload.setName(faker.name().name());
		petpayload.setStatus("unavailable");
		
		Response response=PetEndPoints.UpdateUser(this.petpayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		//AfterUpadted
		Response responseAfterUpadte =PetEndPoints.GetUser(this.petpayload.getId());
		responseAfterUpadte.then().log().body();
	}
	@Test(priority = 4)
	public void testDeletePet() {
		Response response=PetEndPoints.DeleteUser(this.petpayload.getId());
		response.then().log().body();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	

}
