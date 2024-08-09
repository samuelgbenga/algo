package my_algos.algo3_graph.algo4;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringifyTotalTravel {

    public static String pathIt(ArrayList<ArrayList<String>> routes){

        ArrayList<String> startArr = new ArrayList<>();
        ArrayList<String> endArr = new ArrayList<>();

        int arrLen = routes.size();

        //get the start array and the end array
        for(ArrayList<String> arrStr : routes){
            startArr.add(arrStr.get(0));
            endArr.add(arrStr.get(1));
        }

        // get the start journey string
        String startJourney = "";
        for(ArrayList<String> arrStr : routes){
            if(!endArr.contains(arrStr.get(0))){
                startJourney = arrStr.get(0);
            }
        }

        String endJourney = "";

        for(ArrayList<String> arrStr : routes){
            if(!startArr.contains(arrStr.get(1))){
                endJourney = arrStr.get(1);
            }
        }


        ArrayList<ArrayList<String>> orderRoutes = new ArrayList<>();

        String prevStr = "";
        for(int i = 0; i < arrLen; i++){


            for(int j = 0; j < arrLen; j++){
                // add the start of the journey
                if(orderRoutes.isEmpty() && routes.get(j).get(0)== startJourney ){

                        orderRoutes.add(routes.get(j));
                        prevStr = routes.get(j).get(1);

                    // end of other parts of the journey accordingly
                }else if(!orderRoutes.isEmpty() && !orderRoutes.contains(routes.get(j)) && prevStr == routes.get(j).get(0)){

                        orderRoutes.add(routes.get(j));
                        prevStr = routes.get(j).get(1);

                }
            }

        }


        // add the different journey
        for(int i = 1; i < arrLen; i++){
            startJourney += ", " + orderRoutes.get(i).get(0);
        }
        startJourney += ", "+ endJourney;




        return startJourney;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<String>> routs = new ArrayList<>();

        routs.add(new ArrayList<>(Arrays.asList("toronto", "indian")));
        routs.add(new ArrayList<>(Arrays.asList("indian", "china")));
        routs.add(new ArrayList<>(Arrays.asList("malawi", "congo")));
        routs.add(new ArrayList<>(Arrays.asList("china", "nigeria")));
        routs.add(new ArrayList<>(Arrays.asList("congo", "toronto")));


        System.out.println(pathIt(routs));


    }
}


@DisplayName("findRoutes")
 class FindRoutesTest {
    @Nested
    @DisplayName("sample tests")
    class SampleTests {

        @Test
        @DisplayName("five city acronyms")
        public void fiveCityAcronyms() {
            assertEquals("MNL, TAG, CEB, TAC, BOR", StringifyTotalTravel.pathIt(new ArrayList<ArrayList<String>>(Arrays.asList(new ArrayList<String>(Arrays.asList("MNL", "TAG")), new ArrayList<String>(Arrays.asList("CEB", "TAC")), new ArrayList<String>(Arrays.asList("TAG", "CEB")), new ArrayList<String>(Arrays.asList("TAC", "BOR"))))));
        }

        @Test
        @DisplayName("six full city names")
        public void sixFullCityNames() {
            assertEquals("Halifax, Montreal, Toronto, Chicago, Winnipeg, Seattle", StringifyTotalTravel.pathIt(new ArrayList<ArrayList<String>>(Arrays.asList(new ArrayList<String>(Arrays.asList("Chicago", "Winnipeg")), new ArrayList<String>(Arrays.asList("Halifax", "Montreal")), new ArrayList<String>(Arrays.asList("Montreal", "Toronto")), new ArrayList<String>(Arrays.asList("Toronto", "Chicago")), new ArrayList<String>(Arrays.asList("Winnipeg", "Seattle"))))));
        }
    }
}
