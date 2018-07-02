package yak.product.controller;

public class Response<T> {
  
  private String status;
  
  private String msg="";
  
  private T data;
  
  public Response(){
  }
  
  public Response(String status, String msg, T obj) {
    this.status = status;
    this.msg = msg;
    this.data = obj;
  }
  
  public Response(String status, String msg) {
    this.status = status;
    this.msg = msg;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
  
}

