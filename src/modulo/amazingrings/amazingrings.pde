void setup(){
 size(800,800); 
}
int x=250;
int a=550;

void draw(){
for(int i=400;i>10;i-=5){
 if(x<400){
   noFill();
 ellipse(x++,400,i,i);
 ellipse(a--,400,i,i);
  }
  else if(x>400){
    noFill();
   ellipse(x--,400,i,i);
   ellipse(a++,400,i,i);
  }
  }
}