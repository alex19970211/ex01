
public class Staff {
	 private String name,id;
	 private char gender;
	 private String height,weight;
public void setname(String name1,String id1){
	name=name1;
	id=id1;
   }
public String getname(){
	return name;
   }
public String getid(){
	return id;
   }
public void setgender(char gender1){
	if(gender1=='1'){
		System.out.println("male");
	  }
	if(gender1=='2'){
		System.out.println("female");
      }
	if(gender1=='0'){
		System.out.println("none");
      }
   }
public char getgender(){
	return gender;
      }
public void setheight(String height1,String weight1){
	height=height1;
	weight=weight1;
   }
public String getheight(){
	return height;
   }
public String getweight(){
	return weight;
   }
}	