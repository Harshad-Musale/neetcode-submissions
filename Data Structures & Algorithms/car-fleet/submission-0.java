class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleets=0;
        int n=speed.length;
        int[][] cars= new int [n][2];
        for(int i=0; i<n; i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars, (a,b)-> Integer.compare(b[0], a[0]));
        double currMaxTime=0.0;

        for(int[] car: cars){
            double time=(double)(target- car[0])/car[1];

            if(time>currMaxTime){
                fleets++;
                currMaxTime=time;
            }
        }
        return fleets;
    }
}
