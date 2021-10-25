package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students {

    private List<Integer> heights = new ArrayList<>();

    public void addHeight(int height) {
        heights.add(height);
    }

    public void addHeights(Integer... heights) {
        this.heights.addAll(Arrays.asList(heights));
    }

    public boolean isHeightIncreasing() {
        for (int i = 1; i < heights.size(); i++) {
            if (heights.get(i - 1) > heights.get(i)) {
                return false;
            }
        }
        return true;
    }

}
