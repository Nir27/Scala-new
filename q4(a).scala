
  object q4 {
	def main(args: Array[String]): Unit = {
	     
       
       TH(40,30);
	
}
       def normal(hours:Int):Int=hours*250;
	     
       def ot(hours:Int):Int=hours*85 ;
       
       def income(h1:Int,h2:Int):Int= normal(h1)+ot(h2);
       
       def tax(income:Int):Double=income*.12;
       
       def TH(h1:Int,h2:Int) ={
         
       var a = income(h1,h2)-tax(income(h1,h2));
       
       println(a);
       
     }
}
       