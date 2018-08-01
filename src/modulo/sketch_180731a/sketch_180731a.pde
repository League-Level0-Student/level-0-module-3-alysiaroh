void setup(){
  size(400,400);
}
void draw(){
for(int i=200;i>10;i-=10){

 if((i/10)%2==0){
 fill(#FF0000);
 }
  else if((i/10)%2==1){
   fill(#FFFFFF);
 }
  ellipse(200,200,i,i); 
}



}