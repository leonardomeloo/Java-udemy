package entities.enums;

public enum OrderStatus {
  PENDING_PAYMENT(0),
  PROCESSING(1),
  SHIPPED(2),
  DELIVERED(3);

  private int code;

  private OrderStatus(int code){
    this.code = code;
  }

  public int getCode(){
    return code;
  }
  public static OrderStatus valueOF(int code){ 
    for(OrderStatus status : OrderStatus.values()){
      if(status.getCode() == code){
        return status;
      }
  }
      return null;
}

}
