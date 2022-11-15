class IfClass{

public static void main(String args[]){

 boolean MovieSardar=true;
 boolean GoodReview=true;
 boolean TamilSubtitle=true;

  if(MovieSardar)
{
     if(GoodReview)
   {
        if(TamilSubtitle)
        {
            System.out.println("BookTicket");

        }
         else
             {
               System.out.println("No Tamil Subtitle");
             }
          

   }
       else
          {
            System.out.println("Movie not Good");
             }


}
    else
      {
         System.out.println("Movie not Available");
         }
}

}
