package oops;

import java.util.Scanner;

public class Car 
{
    public static void main(String[] args) {
       String a,b,c,f,g;
       int d,e,h;
       Scanner o;
        o = new Scanner(System.in);
       car obj[]= new car[2];
       for(int i=0;i<obj.length;i++)
       {
           
           System.out.println("Enter Name:");
           a=o.next();
           System.out.println("Enter cities:");
           b=o.next();
           System.out.println("Enter Profession:");
           c=o.next();
           System.out.println("Enter Registration Number:");
           d=o.nextInt();
           System.out.println("Enter Seats:");
           e=o.nextInt();
           System.out.println("Enter Colour:");
           f= o.next();
           System.out.println("Enter brand:");
           g=o.next();
           System.out.println("Enter Model:");
           h=o.nextInt();
           System.out.println();
           System.out.println();
           obj[i]=new car(a,b,c,d,f,e,g,h);
           
       }
       for(int i=0;i<obj.length;i++)
       {
           System.out.println(obj[i]);
       }
    }
    
}
class owner
{
    String name,city,profession;
    owner(String names,String cities,String professions)
    {
        name = names;
        city = cities;
        profession = professions;
    }
    String getname(){
        return name;
    }
    String getcity(){
        return city;
    }
    String getprofession(){
        return profession;
    }
    public String tostring()
    {
        return "\nOwner Name:"+name+"\nOwner City:"+city+"\nOwner profession:"+profession;
    }
}
class car extends owner
{
    int re_num,seat,model;
    String color,brand;
    car (String names,String cities,String professions,int reg,String cr,int seats,String brands,int models){
        re_num =reg;
        color=cr;
        seat=seats;
        brand=brands;
        model=models;
        name = names;
        city = cities;
        profession = professions;
    }
    int getregis(){
        return re_num;
    }
    String getcolour(){
        return color;
    }
    int getseat(){
        return seat;
    }
    String getbrand(){
        return brand;
    }
    int getmodel(){
        return model;
    }
    @Override
    public String tostring()
    {
        return "Car Details:"+"\nOwner Name:"+name+"\nOwner City:"+city+"\nOwner profession:"+profession+"\nRegistration Number"+re_num+"\nColour:"+color+"\nSeats:"+seat+"\nBrands:"+brand+"\nModel:"+model;
    }
}
