import java.util.ArrayList;



public class Themepark {

    ArrayList<Attraction> attractions;

    public Themepark(ArrayList<Attraction> attractions){
        this.attractions = attractions;
    }

    /*
    Below we are creating a for loop to return an arraylist...

    Firstly we create a new empty arraylist and call it reviews, this is where our results are stored...

    We then loop through type "attraction", name "reviews" in the attractions array list we inherit from the Attraction
    class that we set above "ArrayList<Attraction> attractions"...

    then we call .add on the name that we called our arraylist "reviews" then use the name we gave to our second array
    list "attraction" and use the .getRating method we created in the Attraction class that in inherits from.
    */

    public ArrayList<Integer> getAllReviewed(){
        ArrayList<Integer> reviews = new ArrayList<Integer>();
        for(Attraction attraction : this.attractions){
            reviews.add(attraction.getRating());
        }
        return reviews;
    };

//    public getAllAllowedFor(Visitor)


}


