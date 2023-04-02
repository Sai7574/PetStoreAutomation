package api.payload;

public class Store {
	/*
	 * {
  "id": 0,
  "petId": 0,
  "quantity": 0,
  "shipDate": "2023-04-02T05:52:24.987Z",
  "status": "placed",
  "complete": true
}
	 */
	int id;
	int petId;
	int quantity;
	String shipDate="2023-04-02T05:52:24.987Z";
	String status="placed";
	String complete="true";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getShipDate() {
		return shipDate;
	}
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComplete() {
		return complete;
	}
	public void setComplete(String complete) {
		this.complete = complete;
	}
	

}
