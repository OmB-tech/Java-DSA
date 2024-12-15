class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int[] c : classes) {
            int pass = c[0], total = c[1];
            double gain = gainWithExtraStudent(pass, total);
            maxHeap.offer(new double[]{gain, pass, total});
        }

        while (extraStudents > 0) {
            double[] top = maxHeap.poll();
            int pass = (int) top[1], total = (int) top[2];
            pass++;
            total++;
            double gain = gainWithExtraStudent(pass, total);
            maxHeap.offer(new double[]{gain, pass, total});
            extraStudents--;
        }

        double average = 0.0;
        int n = classes.length;
        while (!maxHeap.isEmpty()) {
            double[] top = maxHeap.poll();
            average += top[1] / top[2];
        }
        return average / n;
    }

    private double gainWithExtraStudent(int pass, int total) {
        return (double) (pass + 1) / (total + 1) - (double) pass / total;
    }
}