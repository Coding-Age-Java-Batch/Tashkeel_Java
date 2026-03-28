package Array;

 class Students {
     int id;
     String name;
     Students(int id,String name){
         this.id=id;
         this.name=name;
     }
     void show(){
         System.out.println("Id: "+id+",  Name: "+name);
     }
 public static void main(String[] args) {

         Students[] st=new Students[5];
         st[0]=new Students(1,"TASHKEEL");
         st[1]=new Students(2,"FAIZ");
         st[2]=new Students(3,"SALMAN");
         st[3]=new Students(4,"ANWAR");
         st[4]=new Students(5,"AMIR ASGHAR");
         for(int i=0;i<st.length;i++){

             st[i].show();
         }
 }
 }
