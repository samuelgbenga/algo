package my_algos1.solution1;

public class MaxPointOnAStraightLine {

//    class Solution {
//        public int maxPoints(int[][] arr) {
//            int max = 1;
//            for (int i = 0; i < arr.length; i++) {
//                HashMap<Double, Integer> map = new HashMap<>();
//                for (int j = 0; j < arr.length; j++) {
//                    if (i == j) continue;
//                    double slope = (arr[j][0] - arr[i][0]) != 0 ? (arr[j][1] - arr[i][1]) * 1.0 / (arr[j][0] - arr[i][0]) : Integer.MAX_VALUE;
//                    map.put(slope, map.getOrDefault(slope, 1) + 1);
//                    max = Math.max(max, map.get(slope));
//                }
//            }
//            return max;
//        }
//    }

    // the explanation

//    The whole idea is: for each point (for i loop), consider each pair of point involving that point
//    (for j loop) and calculate the slope of the line that goes through the original point and
//    the other point of the pair. For each point, you'll have calculated n - 1 slopes. You might have
//    gotten the same slope multiple times: The number of times you got the same slope, is the number of
//    points that are being crossed by the same line, and all these points are aligned.
//
//    The slope of the line that goes through points A(x1, y1) and B(x2, y2) is calculated with
//    this formula: (y2 - y1) / (x2 - x1)
//
//    Now you can have two points located at the same x, meaning those two points
//    are vertically aligned. You need to handle this case specifically because you would
//    divide by 0 with the formula above. In that special case, we assume the slope is Integer.MAX_VALUE
//    because it is the closest value to infinity (which is more or less the result of dividing a positive number
//    by zero) and especially because it doesn't conflict with the constraints of the problem, meaning the
//    formula above can't yield MAX_VALUE with these constraints.
//
//    Also you ignore i == j because a point is obviously aligned with itself, and you already took
//    that point into account in the result via initializing max to 1.
//
//    At each j iteration, you update the result max with the current maximum number of times
//    you got the same slope so far. You could also wait to have calculated all slopes before updating max,
//    meaning adding this line just after
//    the for j loop: max = Integer.max(max, Collections.max(slopesCount.values()));.
//    However you'll need to handle the case where there is only one point in the array,
//    because your map will be empty with your current code.

//
//    Keep in mind you need to reset the map before moving on to the next point, which you
//    do by creating a new map at each i iteration. You could also .clear() to avoid a new
//    allocation of a map every time which might be a bit faster.
//
//    Hope this helps. What part of your code don't you understand?
}
