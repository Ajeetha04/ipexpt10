/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author ashwi
 */
public class order {
    private String orderid;
private String cname;
private String date;


public order()
        {
        }
public order( String orderid, String cname, String date) {

this.cname = cname;
this.orderid = orderid;
this.date=date;
}



public String getId() {
return orderid;
}

public void setId(String cname) {
this.orderid = orderid;
}




public String getName() {
return cname;
}

public void setName(String cname) {
this.cname=cname;
}

public String getdate() {
return date;
}

public void setdate(String date)
        {
this.date = date;
}

}
    
