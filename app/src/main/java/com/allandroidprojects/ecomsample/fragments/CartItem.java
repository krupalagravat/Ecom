package com.allandroidprojects.ecomsample.fragments;

public class CartItem {
    private String ImgeURl;
    private boolean isFav ;

    public CartItem(String imgeURl, boolean isFav) {
        ImgeURl = imgeURl;
        this.isFav = isFav;
    }

    public CartItem() {
    }

    public String getImgeURl() {
        return ImgeURl;
    }

    public void setImgeURl(String imgeURl) {
        ImgeURl = imgeURl;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }
}
