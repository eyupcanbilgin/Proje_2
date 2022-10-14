package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    //----------------------Fields-------------------------------------------------------------------------
    // Alisveris sepetinde, sepete eklenen urunleri CartItem sinifi cinsinden "items" isimli bir List de tutacagiz...
    // Sepete birden fazla CartItem eklenebileceginden instance degiskeninizi List seklende tanimlayiniz...
    // Ayrica sepetteki CartItem larin toplam fiyatini double cinsinden totalCartCost degiskeninde tutacagiz...tanimlayiniz..

    private ArrayList<CartItem>items= new ArrayList<>();
    private double totalCartCost;




    //----------------------Constructor---------------------------------------------------------------------
    // Alisveris sepeti olusturulurken herhangi bir degiskeni initilize etmemize gerek yoktur...



    //----------------------Instance Methods----------------------------------------------------------------
    // Return tipi void olan addToCart(CartItem item) methodu tanimlayin...
    // Bu method cagirildiginda, parametre olarak aldigi CartItem'i yukarida tanimlanan "items" List ine eklesin...

    // Ayni urun daha once eklenmis ise bu urunun sadece miktarini guncellemeniz gerekmektedir...

    // Sepete yeni urun eklenmesi veya mevcut bir urunun miktarinin arttirilmasi "totalCartCost" toplam fiyati degistirecektir...

    public void addToCart(CartItem item)
    {

            if (items.contains(item.getItem())){

                item.setQuantity(item.getQuantity()+ item.getQuantity());
                calculateTotalCartCost();
            }
            else
            {
                items.add(item);
                calculateTotalCartCost();
            }


    }
 // addToCart() methodu icerisinde bu methodu cagirmalisiniz ki her urun eklendiginde veya miktar degistiginde toplam fiyat guncellensin...

    public void calculateTotalCartCost()
    {
        totalCartCost=0;
        for(CartItem tcc:items)
        {
             totalCartCost += tcc.getItem().getPrice() * tcc.getQuantity();
        }

    }




    // Return tipi void olan emptyCart() isimli bir method tanimlayin...
    // Bu method cagirildiginda, "items" olarak tanimladiginiz List icerindeki -sepetinizdeki- urunleri silsin-temizlesin-bosaltsin...


    public void emptyCart()
    {
        items.clear();
    }



    //----------------------Getter and Setter ---------------------------------------------------------------------

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CartItem> items) {
        this.items = items;
    }

    public double getTotalCartCost() {
        return totalCartCost;
    }

    public void setTotalCartCost(double totalCartCost) {
        this.totalCartCost = totalCartCost;
    }
}
