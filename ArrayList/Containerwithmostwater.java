import java.util.ArrayList;

class Containerwithmostwater {
    public int maxArea(ArrayList<Integer> height) {

        int left = 0;
        int right = height.size() - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int mheight = Math.min(height.get(left), height.get(right));
            int area = width * mheight;

            maxArea = Math.max(maxArea, area);

            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
