package org.example;
import java.util.*;
public class Buildings {


    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        ArrayList<Integer> index = new ArrayList<>();
        if(buildings.length == 0){
            return new ArrayList<Integer>();
        }
        if(buildings.length == 1){
            int indexOf = 0;
            index.add(indexOf);
            return index;
        }else{
            if(direction.equals("EAST")){
                int max = buildings[buildings.length-1];
                index.add(buildings.length-1);
                for(int i = buildings.length-1; i >=0; i --){
                    if(buildings[i] > max){
                        index.add(i);
                        max = buildings[i];
                    }
                }
            }if(direction.equals("WEST")){
                int max = buildings[0];
                index.add(0);
                for(int i = 0; i < buildings.length - 1; i ++){
                    if(buildings[i] > max){
                        index.add(i);
                        max = buildings[i];
                    }
                }
            }
        }
       Collections.sort(index);
        return index;
    }

    public static void main(String[] args) {
        Buildings building = new Buildings();
        int[] buildings = {3,3,5,2,6,8,3,1};
        System.out.println(building.sunsetViews(buildings,"EAST"));
    }
}
