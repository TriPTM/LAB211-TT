
package view;

import Library.Utils;
import model.Fruit;
import controller.ShopController;
import java.util.ArrayList;

public class CustomerView {
    private ShopController sList=new ShopController();
    private Utils ut = new Utils();
    
    public void create(){
        while(true){
            String id=ut.getString("Enter fruit id");
            String name=ut.getString("Enter fruit name");
            int price=ut.getInt("Enter price");
            int quantity=ut.getInt("Enter quantity");
            String origin=ut.getString("Enter origin");
            sList.getListFruit().add(new Fruit(id,name,origin,price,quantity));
            String checked=ut.getString("Do you want to continue (Y/N)");
            checked=checked.toUpperCase();
            if(!checked.equals("Y")){
                break;
            }
        }
    }
    
    public void viewOrder(){
        sList.viewOrder();
    }
    
    public void shopping(){
        ArrayList<Fruit> order=new ArrayList<Fruit>();
        int size=sList.getListFruit().size()+1;
        while(true){
            sList.displayAllFruits();
            int selected=ut.getInt("Enter fruit want to buy");
            if(selected>size){
                System.out.println("Wrong input!!!\n Try again!!!");
            }else{
                System.out.println("Your selected: "+sList.getListFruit().get(selected-1).getFruitName());
                int quantity=ut.getInt("Please input quantity (has "+sList.getListFruit().get(selected-1).getQuantity()+")");
                if(sList.update(sList.getListFruit().get(selected-1), quantity)){
                    System.out.println("Order success!!!");
                    order.add(new Fruit(sList.getListFruit().get(selected-1).getFruitId(),sList.getListFruit().get(selected-1).getFruitName(),sList.getListFruit().get(selected-1).getOrigin(),sList.getListFruit().get(selected-1).getPrice(),quantity));
                }else{
                    System.out.println("Not enough quantity!!!");
                }
                String checked=ut.getString("Do you want to order now (Y/N)");
                checked=checked.toUpperCase();
                if(!checked.equals("N")){
                    System.out.println(String.format("%-8s | %-10s | %-7s | %-7s", "Product","Quantity","Price","Amount"));
                    int i=1;
                    int amount=0;
                    for(Fruit item: order){
                        System.out.println(String.format("%-8s   %-10d   %-7s   %-7s", i+". "+item.getFruitName(),item.getQuantity(),item.getPrice()+"$",(item.getPrice()*item.getQuantity())+"$"));
                        amount+=item.getPrice()*item.getQuantity();
                        i++;
                    }
                    System.out.println("Total: "+amount+"$\n");
                    String name=ut.getString("Input your name");
                    sList.shopping(order, name);
                    break;
                }
            }
        }
        
    }
}
