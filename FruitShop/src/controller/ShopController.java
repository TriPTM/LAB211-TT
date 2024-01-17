
package controller;

import java.util.ArrayList;
import java.util.Hashtable;
import model.Fruit;

public class ShopController {
    private ArrayList<Fruit> listFruit;
    private Hashtable<String,ArrayList<Fruit>> customer= new Hashtable<String,ArrayList<Fruit>>();

    public ShopController() {
        this.listFruit = new ArrayList<Fruit>();
        Fruit a=new Fruit("1","Apple","VietNam",1,10);
        Fruit b=new Fruit("2","Apple","American",1,10);
        Fruit c=new Fruit("3","Apple","ThaiLan",1,10);
        Fruit d=new Fruit("4","Banana","VietNam",1,10);
        Fruit e=new Fruit("5","Mango","VietNam",1,10);
        Fruit f=new Fruit("6","Orange","VietNam",1,10);
        this.listFruit.add(a);
        this.listFruit.add(b);
        this.listFruit.add(c);
        this.listFruit.add(d);
        this.listFruit.add(e);
        this.listFruit.add(f);
    }

    public ShopController(ArrayList<Fruit> listFruit) {
        this.listFruit = listFruit;
    }

    public ArrayList<Fruit> getListFruit() {
        return listFruit;
    }

    public void setListFruit(ArrayList<Fruit> listFruit) {
        this.listFruit = listFruit;
    }

    public Hashtable<String, ArrayList<Fruit>> getCustomer() {
        return customer;
    }

    public void setCustomer(Hashtable<String, ArrayList<Fruit>> customer) {
        this.customer = customer;
    }

    
    public void viewOrder(){
        if(customer.isEmpty()){
            System.out.println("No order!!!");
        }else{
            for(String key: customer.keySet()){
                ArrayList<Fruit> list = customer.get(key);
                System.out.println("Customer: "+key);
                System.out.println(String.format("%-8s | %-10s | %-7s | %-7s", "Product","Quantity","Price","Amount"));
                int i=1;
                int amount=0;
                for(Fruit item: list){
                    System.out.println(String.format("%-8s   %-10d  %-7s   %-7s", i+". "+item.getFruitName(),item.getQuantity(),item.getPrice()+"$",(item.getPrice()*item.getQuantity())+"$"));
                    amount+=item.getPrice()*item.getQuantity();
                    i++;
                }
                System.out.println("Total: "+amount+"$\n");
            }
        }
    }
    
    public void shopping(ArrayList<Fruit> listBuy, String customer){
        this.customer.put(customer, listBuy);
    }
    
    public void displayAllFruits() {
        System.out.println("List of Fruit:");
        System.out.println(String.format("| %-10s | %-17s | %-15s | %-11s |", "++Item++", "++Fruit Name++", "++Origin++", "++Price++"));
        int i=1;
        for (Fruit item: this.listFruit) {
            if(checkInventory(item)){
                System.out.println(String.format("     %-13s  %-15s  %-17s  %-11s ", i,item.getFruitName(),item.getOrigin(),item.getPrice()+"$"));
                i++;
            }else{
                String a="(Sold out)";
                System.out.println(String.format("     %-13s  %-15s  %-17s  %-11s %-10s", i,item.getFruitName(),item.getOrigin(),item.getPrice()+"$",a));
                i++;
            }
        }
    }
    
    public boolean update(Fruit fruit, int quantity){
        for(Fruit item:this.listFruit){
            if(item.equals(fruit)){
                int inventory=item.getQuantity();
                if(inventory<quantity){
                    return false;
                }
                inventory-=quantity;
                item.setQuantity(inventory);
                return true;
            }
        }
        return true;
    }
    
    public boolean checkInventory(Fruit fruit){
        if(fruit.getQuantity()>0){
            return true;
        }else return false;
    }
}
